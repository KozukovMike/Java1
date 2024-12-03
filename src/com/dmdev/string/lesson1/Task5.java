package com.dmdev.string.lesson1;


// написать функцию разбивающую строку ра равные части по n символов и сохраняющих их в массив вывести массив
public class Task5 {

    public static void main(String[] args) {
        String s = "abcabcabcabcddd";
        String[] buf = divide(s, 3);
        for (String str: buf) {
            System.out.println(str);
        }
    }

    public static String[] divide(String str, int n) {
        String[] result = new String[str.length() / n];
        for (int i = 0, j = 0; i < str.length(); i=i+n, j++) {
            result[j] = str.substring(i, i + n);
        }
        return result;
    }

}
