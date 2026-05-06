package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {

    public String[] makeFruitStringArray() {

        String[] fruits = {"apple", "banana", "cherry", "date", "elderberry"};

        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {

        String[] fruits = new String[size];

        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = "apple";
        }

        return fruits;
    }

    public String[] makeTopThreeArray(String[] fruits) {

        String[] topThree = new String[3];

        for (int i = 0; i < 3; i++) {
            topThree[i] = fruits[i];
        }

        return topThree;
    }

    public ArrayList<String> makeFruitList() {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        fruits.add("elderberry");

        return fruits;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add(fruit1);
        fruits.add(fruit2);
        fruits.add(fruit3);

        return fruits;
    }

    public HashMap<String, String> makeFruitMap() {

        HashMap<String, String> fruitMap = new HashMap<>();

        fruitMap.put("apple", "red");
        fruitMap.put("banana", "yellow");
        fruitMap.put("cherry", "red");
        fruitMap.put("date", "brown");
        fruitMap.put("elderberry", "black");

        return fruitMap;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {

        return fruitMap.get("apple");
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {

        HashSet<String> fruits = new HashSet<>();

        fruits.add(fruit1);
        fruits.add(fruit2);
        fruits.add(fruit3);

        return fruits;
    }
}