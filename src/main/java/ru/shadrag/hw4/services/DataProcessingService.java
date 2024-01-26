package ru.shadrag.hw4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shadrag.hw4.models.User;
import ru.shadrag.hw4.UsersDB;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Класс для работы с данными
 */
@Service
public class DataProcessingService {
    private final UsersDB usersDB;

    @Autowired
    public DataProcessingService(UsersDB usersDB) {
        this.usersDB = usersDB;
    }

    public User getUserById(int id) {
        return usersDB.getUsers().stream().filter(it -> it.getId() == id).findFirst().orElse(null);
    }

    public List<User> filterUsersByAge(int age) {
        List<User> copyUserList = new ArrayList<>(usersDB.getUsers());
        return copyUserList.stream().filter(user -> user.getAge() > age).toList();
    }

    public String getAverageAge() {
        double averageAge = usersDB.getUsers().stream().mapToInt(User::getAge).average().orElse(0);
        return String.format("%.2f", averageAge);
    }

    public List<User> sortUserByAgeASC() {
        List<User> copyUserList = new ArrayList<>(usersDB.getUsers());
        copyUserList.sort(Comparator.comparingInt(User::getAge));
        return copyUserList;
    }

    public List<User> sortUserByAgeDESC() {
        List<User> copyUserList = new ArrayList<>(usersDB.getUsers());
        copyUserList.sort((o1, o2) -> o2.getAge() - o1.getAge());
        return copyUserList;
    }

    public List<User> getUsers() {
        return usersDB.getUsers();
    }
}
