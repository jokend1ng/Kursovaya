package com.example.cards;

import com.example.date.Date;
import com.example.person.Person;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Cards {
    private LocalDate dateOfRegistration;
    private LocalDate dateOfcancelation;
    public Person owner;
    TypeOfCards typeOfCards;
    private LocalDateTime timeToBe;

    public LocalDateTime getTimeToBe() {
        return timeToBe;
    }

    public void setTimeToBe(LocalDateTime timeToBe) {
        this.timeToBe = timeToBe;
    }

    public Cards(String dateOfcancelation, Person owner, TypeOfCards typeOfCards) {
        this.dateOfRegistration = LocalDate.now();
        this.dateOfcancelation = Date.parseDate(dateOfcancelation);
        this.owner = owner;
        this.typeOfCards = typeOfCards;
    }

    public LocalDate getDateOfcancelation() {
        return dateOfcancelation;
    }

    public void setDateOfcancelation(LocalDate dateOfcancelation) {
        this.dateOfcancelation = dateOfcancelation;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public TypeOfCards getTypeOfCards() {
        return typeOfCards;
    }

    public void setTypeOfCards(TypeOfCards typeOfCards) {
        this.typeOfCards = typeOfCards;
    }
}

