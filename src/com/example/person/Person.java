package com.example.person;

import com.example.date.Date;

import java.text.ParseException;
import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private LocalDate birthday;
    private static int number=1;


    public Person(String name, String surname, String birthday)  {
        if (name != null)
        this.name = name;
        if (surname != null)
        this.surname = surname;
        if (Date.parseDate(birthday) != null)
        this.birthday = Date.parseDate(birthday);
        number++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
