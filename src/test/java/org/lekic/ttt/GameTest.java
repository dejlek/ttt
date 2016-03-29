package org.lekic.ttt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unittests for the Game class.
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
    
} // GameTest class
