package com.connor.game.creatures;

import com.connor.game.items.Item;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Creature {
    private String name;
    public Race race;
    private HashMap<String, Integer> stats;
    private ArrayList<Item> inventory;

    public Creature() {
        this.name = "n/a";
        this.stats = initStats();
    }

    private HashMap<String, Integer> initStats(){
        HashMap<String, Integer> nullStats = new HashMap<>();
        nullStats.put("Attack", 0);
        nullStats.put("Defense", 0);
        nullStats.put("HP", 100);
        nullStats.put("MaxHP", 100);
        nullStats.put("MP", 100);
        nullStats.put("MaxMP", 100);
        nullStats.put("Level", 1);
        nullStats.put("XP", 0);
        nullStats.put("MaxXP", 0);


        return nullStats;
    }


    public Creature(String name, HashMap<String, Integer> stats) {
        this.name = name;
        this.stats = stats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Integer> getStats() {
        return stats;
    }

    public void setStats(HashMap<String, Integer> stats) {
        this.stats = stats;
    }

    public void changeStat(String stat, Integer value) {
        this.stats.put(stat, value);
    }

    public void setStat(String stat, Integer value) {
        Integer newVal = this.stats.get(stat) + value;
        this.stats.put(stat, newVal);
    }


    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }
}
