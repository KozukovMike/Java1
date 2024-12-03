package com.dmdev.string.lesson1;

// Написать функцию принимаю имя, фамилию, отчесвто и возвращающую инициалы
// в формате Ф.И.О
//
public class Task3 {

    public static void main(String[] args) {
        System.out.println(makeFIO("козюков", "Michael", "dEANISOVICH"));
    }

    public static String makeFIO(String name, String surname, String patronymic) {
        return name.toUpperCase().charAt(0) + "." + surname.toUpperCase().charAt(0) + "." + patronymic.toUpperCase().charAt(0);
    }
}
