package com.connor.game.items.potions;

import com.connor.game.creatures.Creature;
import com.connor.game.items.Item;

public abstract class Potion implements Item {

    private String stat;
    private Integer amount;

    Potion(){}

    Potion(String stat, Integer amount){
        this.stat = stat;
        this.amount = amount;
    }

    public void drink(Creature creature){
        creature.getInventory().remove(this);
        creature.setStat(this.stat, this.amount);
        if (creature.getStats().get(this.stat) > creature.getStats().get("Max" + this.stat)){
            creature.setStat(this.stat, creature.getStats().get("Max" + this.stat));
        }
    }


}
