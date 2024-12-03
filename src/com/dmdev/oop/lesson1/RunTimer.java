package com.dmdev.oop.lesson1;

public class RunTimer {

    public static void main(String[] args) {
        Second seconds = new Second(44);
        Minute minutes = new Minute(55);
        Hour hours = new Hour(11);
        Timer timer = new Timer(seconds, minutes, hours);
        timer.showTimer();
        Second seconds2 = new Second(4456);
        Timer timer2 = new Timer(seconds2);
        timer2.showTimer();
    }
}
