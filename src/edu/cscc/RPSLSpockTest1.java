package edu.cscc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Charles Johnson
 * @version 1.05
 */
public class RPSLSpockTest1 {
    /**
     * Setting that all values are true
     */
    @Test
    public void testisValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SPOCK));
        Assert.assertFalse(RPSLSpock.isValidPick("Bananas"));
    }

    /**
     * This is a loop to make sure the picks run through multiple times
     */
    @Test
    public void testgeneratePick() {
        for (int i=0; i<1000000;i++);{
            String pick=RPSLSpock.generatePick();
            Assert.assertNotNull(pick);
            Assert.assertTrue(RPSLSpock.isValidPick(pick));
        }
    }

    /**
     * This tests all the combos to see if they are true or not
     */
    @Test
    public void testisComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK,RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK,RPSLSpock.SCISSORS));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.SCISSORS));

    }
}