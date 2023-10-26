package com.example.date;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;

import static java.util.logging.Level.parse;

public class Date {
    public static LocalDate parseDate(String date)  {
        try {
            return LocalDate.parse(date);
        } catch (Exception e) {
            throw new RuntimeException("Не верная дата");
        }
    }
    public static LocalTime parseTime(String time) {
        try {
            return LocalTime.parse(time);
        } catch (Exception e) {
            throw new RuntimeException("Не верное время");
        }
    }
    public static boolean isRequiredCard(LocalDate date) {
        if (LocalDate.now().compareTo(date)<0){
            return true;
        }else return false;
        }
    }

