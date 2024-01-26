package ru.shadrag.hw4.models;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Класс сущности пользователя
 */
public class User {

    //region КОНСТРУКТОРЫ

    public User(String name, int age, String email) {
        this.id = counter.incrementAndGet();
        this.name = name;
        this.age = age;
        this.email = email;
    }

    //endregion

    //region ГЕТТЕРЫ и СЕТТЕРЫ

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", email='" + email + '\'' +
               '}';
    }

    //endregion

    //region ПОЛЯ
    private static AtomicInteger counter = new AtomicInteger();
    private int id;
    private String name;
    private int age;
    private String email;
    //endregion


}
