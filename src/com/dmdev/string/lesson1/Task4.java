package com.dmdev.string.lesson1;


// подсчитать кол-во всех точек, запятых и восклицательных знаков в строке
public class Task4 {

    public static void main(String[] args) {
        String s = "sakldk ../aasd,asd.,!!das";
        System.out.println(countSpecial(s));
    }

    public static int countSpecial(String str) {
        int length = str.length();
        str = str.replace(".", "").replace(",", "").replace("!", "");
        return length - str.length();
    }
}
