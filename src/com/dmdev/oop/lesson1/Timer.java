package com.dmdev.oop.lesson1;

public class Timer {

    private Second seconds;
    private Minute minutes;
    private Hour hours;

    public Timer(Second seconds) {
        this.hours = new Hour(seconds.getValue() / 3600);
        this.minutes = new Minute(seconds.getValue() % 3600 / 60);
        this.seconds = new Second(seconds.getValue() % 3600 % 60);
    }

    public Timer(Second seconds, Minute minutes, Hour hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public void showTimer() {
        System.out.println("Hours: " + this.hours.getValue() + " Minutes: " + this.minutes.getValue() + " Seconds: " + this.seconds.getValue());
    }
}
