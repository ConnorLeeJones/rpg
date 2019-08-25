package com.connor.game.creatures.players;

import com.connor.game.creatures.Creature;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class MageTest {

    private Mage mage;

    @Before
    public void setUp() throws Exception {
        mage = new Mage("Connor");
        mage.setName("Gandalf");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getPlayerName() {
        Assert.assertEquals("Connor", mage.getPlayerName());
    }

    @Test
    public void setPlayerName() {
        mage.setPlayerName("Con");
        Assert.assertEquals("Con", mage.getPlayerName());
    }

    @Test
    public void getName() {
        Assert.assertEquals("Gandalf", mage.getName());
    }

    @Test
    public void setName() {
        mage.setName("Ganon");
        Assert.assertEquals("Ganon", mage.getName());
    }

    @Test
    public void getStats() {
        Integer expected = 0;
        Integer actual = mage.getStats().get("Attack");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setStats() {
        HashMap<String, Integer> newStats = new HashMap<>();
        newStats.put("Attack", null);
        mage.setStats(newStats);
        Assert.assertNull(mage.getStats().get("Attack"));
    }

    @Test
    public void instanceOf() {
        Assert.assertTrue(mage instanceof HumanPlayer);
        Assert.assertTrue(mage instanceof Creature);
    }

    @Test
    public void changeStat() {
        mage.changeStat("Attack", 20);

        Integer expected = 20;
        Integer actual = mage.getStats().get("Attack");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void increaseStat() {
        mage.setStat("Attack", 5);
        mage.setStat("Attack", 10);

        Integer expected = 15;
        Integer actual = mage.getStats().get("Attack");

        Assert.assertEquals(expected, actual);
    }


}
