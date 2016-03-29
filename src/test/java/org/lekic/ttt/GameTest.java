package org.lekic.ttt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit-tests for the Game class.
 * 
 * @author dejan
 */
public class GameTest {
    
    public GameTest() {
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

    @Test
    public void nextReturns010() {
        Game g = new Game("human");
        assertEquals(0, g.next());
        assertEquals(1, g.next());
        assertEquals(0, g.next());
    }
    
    @Test
    public void getXReturns0() {
        Game g = new Game("human");
        assertEquals(0, g.getX("A2"));
    }
    
    @Test
    public void getYReturns1() {
        Game g = new Game("human");
        assertEquals(0, g.getY("B1"));
    }
    
    @Test
    public void isValidReturnsTrue() {
        Game g = new Game("human");
        // initially all cells are empty, so isValid() should work...
        assertTrue(g.isValid("A1"));
        assertTrue(g.isValid("A2"));
        assertTrue(g.isValid("A3"));
        assertTrue(g.isValid("B1"));
        assertTrue(g.isValid("B2"));
        assertTrue(g.isValid("B3"));
        assertTrue(g.isValid("C1"));
        assertTrue(g.isValid("C2"));
        assertTrue(g.isValid("C3"));
    }
    
} // GameTest class
