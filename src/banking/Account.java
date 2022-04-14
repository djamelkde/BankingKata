/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.io.PrintStream;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author dkouicem
 */
public class Account {
    private double balance = 0.0;
    
    public Account(double initialBalance) {
        balance = initialBalance;
    }
    
    public void PrintSolde(PrintStream printer) {
        printer.println("Current Balance: "+balance);
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    private void updateBalance(double newBalance){
        this.balance = newBalance;
    }
    
    
    public boolean notifyUpdate(AccountManager manager, double newBalance) throws Exception{
        if(AccountManager.getManager(this).equals(manager)){
            updateBalance(newBalance);
            return true;
        }
        throw new Exception("The operation of Account Updating is impossible!");
    }
    
}
