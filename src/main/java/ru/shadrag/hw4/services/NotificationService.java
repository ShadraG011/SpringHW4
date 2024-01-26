package ru.shadrag.hw4.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ru.shadrag.hw4.models.User;

@Service
@Scope("singleton")
public class NotificationService {

    public String filteredUsersByAge(int age) {
        return String.format("Выведен список пользователей старше %d\n", age);
    }

    public String getAvgAge() {
        return "Показан средний возраст пользователей\n";
    }

    public String sortedUsersByAgeASC() {
        return "Пользователи отсортированы по возрасту в возрастающем порядке\n";
    }

    public String sortedUsersByAgeDESC() {
        return "Пользователи отсортированы по возрасту в убывающем порядке\n";
    }

    public String getUsers() {
        return "Выведен весь список пользователей";
    }
}
