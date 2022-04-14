/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

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
public class AccountTest {
    
    public AccountTest() {
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
     * Test of deposit method, of class Account.
     */
    @Test
    public void testDeposit() {
        System.out.println("Deposit");
        double amount = 100.0;
        Date date = new Date();
        Account instance = new Account(0.0);
        AccountManager manager= AccountManager.getManager(instance);
        manager.deposit(amount, date);
        assertTrue(amount==instance.getBalance());
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testSuccessfulWithdraw() {
        System.out.println("Successuful withdraw");
        double amount = 20.0;
        Date date = new Date();
        Account instance = new Account(10.0);
        AccountManager manager= AccountManager.getManager(instance);
        manager.withdraw(amount, date);
        assertTrue(10.0==instance.getBalance());
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testUnSuccessfulWithdraw() {
        System.out.println("UnSuccessuful withdraw");
        double amount = 10.0;
        Date date = new Date();
        Account instance = new Account(20.0);
        AccountManager manager= AccountManager.getManager(instance);
        manager.withdraw(amount, date);
        assertTrue(10.0==instance.getBalance());
    }
    
    /**
     * Test of PrintSolde method, of class Account.
     */
    @Test
    public void testPrintTransactions (){
        System.out.println("Print transactions");
        Account instance = null;
        // TODO review the generated test code and remove the default call to fail.
        assertSame("", "");   
    }
}
