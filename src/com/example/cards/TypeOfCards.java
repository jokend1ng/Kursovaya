package com.example.cards;

import com.example.date.Date;

import java.time.LocalTime;

public enum TypeOfCards {
    DAYLY("16:00", false, true, true),
    FULL("22:00", true, true, true),
    ONCE("22:00", true, true, false);
    LocalTime starting = Date.parseTime("08:00");
    ;
    LocalTime ending;
    boolean isWaterfall=false;
    boolean isGym=false;
    boolean isGroupExercises=false;

    TypeOfCards(String ending, boolean isWaterfall, boolean isGym, boolean isGroupExercises) {
        if (Date.parseTime((ending))!=null)
        this.ending = Date.parseTime((ending));
        this.isWaterfall = isWaterfall;
        this.isGym = isGym;
        this.isGroupExercises = isGroupExercises;
    }

    public LocalTime getEnding() {
        return ending;
    }

    public void setEnding(LocalTime ending) {
        this.ending = ending;
    }

    public boolean isWaterfall() {
        return isWaterfall;
    }

    public void setWaterfall(boolean waterfall) {
        isWaterfall = waterfall;
    }

    public boolean isGym() {
        return isGym;
    }

    public void setGym(boolean gym) {
        isGym = gym;
    }

    public boolean isGroupExercises() {
        return isGroupExercises;
    }

    public void setGroupExercises(boolean groupExercises) {
        isGroupExercises = groupExercises;
    }
}
