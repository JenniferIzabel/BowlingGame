/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.BowlingGame;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author a1136976 - Jennifer
 */
public class BowlingGameTest {

    public BowlingGameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void inicio() {
        BowlingGame bowlingGame = new BowlingGame();
        assertEquals(0, bowlingGame.getScore());
    }

    @Test
    public void jodada1() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(4);
        bowlingGame.roll(5);
        assertEquals(9, bowlingGame.getScore());

    }

    @Test
    public void totalSimples() {
        BowlingGame bowlingGame = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(1);
        }
        assertEquals(20, bowlingGame.getScore());

    }

    @Test
    public void totalSpare() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        for (int i = 2; i < 20; i++) {
            bowlingGame.roll(1);
        }
        assertEquals(29, bowlingGame.getScore());

    }

    @Test
    public void totalStrike() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(2);
        bowlingGame.roll(2);
        bowlingGame.roll(10);
        for (int i = 1; i < 17; i++) {
            bowlingGame.roll(1);
        }
        assertEquals(32, bowlingGame.getScore());

    }
}
