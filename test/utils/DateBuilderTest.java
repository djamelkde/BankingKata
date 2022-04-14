/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dkouicem
 */
public class DateBuilderTest {
    
    public DateBuilderTest() {
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

    /**
     * Test of date method, of class DateBuilder.
     */
    @Test
    public void testDate() {
        System.out.println("date");
        Date date = DateBuilder.date("10/01/2012");
        // TODO review the generated test code and remove the default call to fail.
        assertArrayEquals(new int[]{10,01,2012}, new int[]{date.getDay(), date.getMonth(), date.getYear()});        
    }
    
}
