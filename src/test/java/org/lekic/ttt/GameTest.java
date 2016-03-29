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
    public void isValidReturnsTrue() {
        Game g = new Game("human");
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
