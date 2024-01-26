package ru.shadrag.hw4;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import ru.shadrag.hw4.models.User;

import java.util.ArrayList;
import java.util.List;

@Repository
@Scope("singleton")
public class UsersDB {
    private final List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User("Алиса", 18, "alisa@example.com"));
        users.add(new User("Борис", 19, "boris@example.com"));
        users.add(new User("Валентин", 20, "valentin@example.com"));
        users.add(new User("Галина", 21, "galina@example.com"));
        users.add(new User("Денис", 22, "denis@example.com"));
        users.add(new User("Евгения", 23, "evgenia@example.com"));
        users.add(new User("Жорж", 24, "zhorge@example.com"));
        users.add(new User("Зинаида", 25, "zinaida@example.com"));
        users.add(new User("Игорь", 26, "igor@example.com"));
        users.add(new User("Йозеф", 27, "joseph@example.com"));
        users.add(new User("Карина", 28, "karina@example.com"));
        users.add(new User("Лев", 29, "lev@example.com"));
        users.add(new User("Марина", 30, "marina@example.com"));
        users.add(new User("Никита", 31, "nikita@example.com"));
        users.add(new User("Ольга", 32, "olga@example.com"));
        users.add(new User("Павел", 33, "pavel@example.com"));
        users.add(new User("Рита", 34, "rita@example.com"));
        users.add(new User("Сергей", 35, "sergey@example.com"));
        users.add(new User("Татьяна", 36, "tatiana@example.com"));
        users.add(new User("Ульяна", 37, "ulyana@example.com"));
        users.add(new User("Виктор", 38, "victor@example.com"));
        users.add(new User("Вера", 39, "vera@example.com"));
        users.add(new User("Владимир", 40, "vladimir@example.com"));
        users.add(new User("Галина", 41, "galina@example.com"));
        users.add(new User("Дмитрий", 42, "dmitriy@example.com"));
        users.add(new User("Елена", 43, "elena@example.com"));
        users.add(new User("Жанна", 44, "zhanna@example.com"));
        users.add(new User("Захар", 45, "zakhar@example.com"));
        users.add(new User("Ирина", 46, "irina@example.com"));
        users.add(new User("Йозеф", 47, "joseph@example.com"));
        users.add(new User("Каролина", 48, "karolina@example.com"));
        users.add(new User("Леонид", 49, "leonid@example.com"));
        users.add(new User("Маргарита", 50, "margarita@example.com"));
        users.add(new User("Николай", 18, "nikolay@example.com"));
        users.add(new User("Оксана", 19, "oksana@example.com"));
        users.add(new User("Петр", 20, "petr@example.com"));
        users.add(new User("Раиса", 21, "raisa@example.com"));
        users.add(new User("Семен", 22, "semen@example.com"));
        users.add(new User("Тамара", 23, "tamara@example.com"));
        users.add(new User("Ульяна", 24, "ulyana@example.com"));
        users.add(new User("Василий", 25, "vasiliy@example.com"));
        users.add(new User("Юрий", 26, "yuri@example.com"));
        users.add(new User("Захар", 27, "zakhar@example.com"));
        users.add(new User("Анна", 28, "anna@example.com"));
        users.add(new User("Богдан", 29, "bogdan@example.com"));
        users.add(new User("Валерия", 30, "valeriya@example.com"));
        users.add(new User("Глеб", 31, "gleb@example.com"));
        users.add(new User("Дарья", 32, "darya@example.com"));
        users.add(new User("Егор", 33, "egor@example.com"));
        users.add(new User("Жанна", 34, "zhanna@example.com"));
        users.add(new User("Зиновий", 35, "zinoviy@example.com"));
        users.add(new User("Ирина", 36, "irina@example.com"));
    }

    public List<User> getUsers() {
        return users;
    }
}
