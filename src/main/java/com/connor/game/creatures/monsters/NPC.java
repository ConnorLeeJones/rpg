package com.connor.game.creatures.monsters;

import com.connor.game.creatures.Creature;

public abstract class NPC extends Creature {
    private String playerName;


    NPC(){
        super();
        this.playerName = "n/a";
    }

    NPC(String playerName){
        super();
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
