package com.connor.game.creatures.players;

import com.connor.game.creatures.Creature;

public abstract class HumanPlayer extends Creature {
    private String playerName;


    HumanPlayer(){
        super();
        this.playerName = "n/a";
    }

    HumanPlayer(String playerName){
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
