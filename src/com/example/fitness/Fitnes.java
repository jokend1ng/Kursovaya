package com.example.fitness;

import com.example.cards.Cards;
import com.example.date.Date;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public  class Fitnes {
    private static final List<Cards> gym = new ArrayList<>(20);
    private static final List<Cards> waterFall = new ArrayList<>(20);
    private static final List <Cards> groupExercises = new ArrayList<>(20);

    public static void fill(List<Cards> array, Cards values) {
        for (int i = 0;i<20;i++){
            values.setTimeToBe(LocalDateTime.now());
            array.add(values);
        }
    }

    public static List<Cards> getGym() {
        return gym;
    }

    public static List <Cards>getWaterFall() {
        return waterFall;
    }

    public static List <Cards> getGroupExercises() {
        return groupExercises;
    }

    public static void addToTask(List list, Cards card) {
        if (Date.isRequiredCard(card.getDateOfcancelation()) && isNotContains(card) && isHaveEmptyPlace(list)) {
            if (list == gym && card.getTypeOfCards().isGym()) {
                putCardInZone(list,card);
            } else if (list == waterFall && card.getTypeOfCards().isWaterfall()) {
                putCardInZone(list,card);
            } else if (list == groupExercises && card.getTypeOfCards().isGroupExercises()) {
               putCardInZone(list,card);
            } else {
                System.out.println("Нет такого занятия!");
            }
        } else if (!Date.isRequiredCard(card.getDateOfcancelation())) {
            System.out.println("Ваш абонемент просрочен!");
        } else if (!isNotContains(card)) {
            System.out.println("Вы уже занимаетесь!");
        } else {
            System.out.println("Нет свободных мест!");
        }
    }

    private static boolean isHaveEmptyPlace(List array) {
        if (array.size() < 20) return true;
        else return false;
    }

    private static boolean isNotContains(Cards card) {
        if (!waterFall.contains(card) && !gym.contains(card) && !groupExercises.contains(card)) return true;
        else return false;
    }

    public static void getAllTracks (){
        List<Cards> allTracks = new ArrayList<>();
        for (int i = 0; i <gym.size(); i++)
            allTracks.add( gym.get(i));
        for (int i = 0; i <waterFall.size(); i++)
            allTracks.add( waterFall.get(i));
        for (int i = 0; i <groupExercises.size(); i++)
            allTracks.add( groupExercises.get(i));


        for (var card : allTracks){
            String zone="";
            if (groupExercises.contains(card))zone="groupExercises";
            if (gym.contains(card)) zone="gym";
            if (waterFall.contains(card)) zone="waterfall";
            System.out.println(card.owner.getName() + " "+ card.owner.getSurname() + " "+ zone);
            System.out.println(card.getTimeToBe());
        }
    }
    private static void putCardInZone(List list,Cards card){
        card.setTimeToBe(LocalDateTime.now());
        list.add(card);
        System.out.println(card.owner.getName() + " "+ card.owner.getSurname() + "  groupExercises");
        System.out.println(card.getTimeToBe());
    }


}
