package com.example.cards;

import com.example.date.Date;

import java.time.LocalTime;

public enum TypeOfCards {
    DAYLY("16:00", Zone.GYM, Zone.GROUPEXERCISES),
    FULL("22:00", Zone.GYM, Zone.GROUPEXERCISES, Zone.WATERFALL),
    ONCE("22:00", Zone.GYM, Zone.WATERFALL);
    private LocalTime starting = Date.parseTime("08:00");
    ;
    private LocalTime ending;
    Zone[] zone;


    TypeOfCards(String ending, Zone... zone) {
        this.ending = Date.parseTime(ending);
        this.zone = zone;
    }

    public LocalTime getEnding() {
        return ending;
    }

    public void setEnding(LocalTime ending) {
        this.ending = ending;
    }

    public Zone[] getZone() {
        return zone;
    }

    public boolean isZone(String zoneInFitness, Zone[] zone) {
        for (int i = 0; i < zone.length; i++) {
            if (zone[i].toString().equals(zoneInFitness.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

}

enum Zone {
    GYM, WATERFALL, GROUPEXERCISES
}
