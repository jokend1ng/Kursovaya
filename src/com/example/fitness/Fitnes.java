package com.example.fitness;

import com.example.cards.Cards;
import com.example.date.Date;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Fitnes {
    private static  Fitnes INSTANCE;
    private  final List<Cards> gym = new ArrayList<>(20);
    private  final List<Cards> waterFall = new ArrayList<>(20);
    private  final List<Cards> groupExercises = new ArrayList<>(20);

    public  void fill(List<Cards> array, Cards values) {
        for (int i = 0; i < 20; i++) {
            values.setTimeToBe(LocalDateTime.now());
            array.add(values);
        }
    }

    public Fitnes() {
    }

    public static Fitnes getFitnes() {
        if (INSTANCE ==null){
            INSTANCE = new Fitnes();
        }
        return INSTANCE;
    }

    public  List<Cards> getGym() {
        return gym;
    }

    public  List<Cards> getWaterFall() {
        return waterFall;
    }

    public  List<Cards> getGroupExercises() {
        return groupExercises;
    }

    public  void addToTask(List<Cards> list, Cards card) {
        if (Date.isRequiredCard(card.getDateOfcancelation()) && isNotContains(card) && isHaveEmptyPlace(list)) {
            if (list == gym && card.getTypeOfCards().isZone("gym", card.getTypeOfCards().getZone())) {
                putCardInZone(list, card);
            } else if (list == waterFall && card.getTypeOfCards().isZone("waterfall", card.getTypeOfCards().getZone())) {
                putCardInZone(list, card);
            } else if (list == groupExercises && card.getTypeOfCards().isZone("groupezercises", card.getTypeOfCards().getZone())) {
                putCardInZone(list, card);
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

    private boolean isHaveEmptyPlace(List<Cards> array) {
        return array.size() < 20;
    }

    private  boolean isNotContains(Cards card) {
        return !waterFall.contains(card) && !gym.contains(card) && !groupExercises.contains(card);
     }

    public  void getAllTracks() {
        List<Cards> allTracks = new ArrayList<>();
        for (int i = 0; i < gym.size(); i++) {
            allTracks.add(gym.get(i));
            System.out.println(gym.get(i).owner.getName() + " " + gym.get(i).owner.getSurname() + " Gym");
            System.out.println(gym.get(i).getTimeToBe());
        }
        for (int i = 0; i < waterFall.size(); i++) {
            allTracks.add(waterFall.get(i));
            System.out.println(waterFall.get(i).owner.getName() + " " + waterFall.get(i).owner.getSurname() + " waterfall");
            System.out.println(waterFall.get(i).getTimeToBe());
        }
        for (int i = 0; i < groupExercises.size(); i++) {
            allTracks.add(groupExercises.get(i));
            System.out.println(groupExercises.get(i).owner.getName() + " " + groupExercises.get(i).owner.getSurname() + " groupExercises");
            System.out.println(groupExercises.get(i).getTimeToBe());
        }
    }


    private void putCardInZone(List<Cards> list, Cards card) {
        card.setTimeToBe(LocalDateTime.now());
        list.add(card);
        System.out.println(card.owner.getName() + " " + card.owner.getSurname() + "  groupExercises");
        System.out.println(card.getTimeToBe());
    }


}
