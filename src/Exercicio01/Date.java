package Exercicio01;

import java.time.LocalDate;


public class Date {
   private int day;
   private int month;
   private int year;

    public Date(int day, int month, int year) {
        if (day < 0 || day > 30)
            throw new IllegalArgumentException("Day must be > 0 and <= 30");
        if (month < 0 || month > 12)
            throw new IllegalArgumentException("Month must be > 0 and <= 30");
        if (year >= 2023)
            throw new IllegalArgumentException("Year must be < 2023");
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 0 || day > 30)
            throw new IllegalArgumentException("Day must be > 0 and <= 30");
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 0 || month > 12)
            throw new IllegalArgumentException("Month must be > 0 and <= 30");
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 2023)
            throw new IllegalArgumentException("Year must be < 2023");
        this.year = year;
    }
}
