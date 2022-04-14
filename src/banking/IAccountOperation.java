/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.Date;

/**
 *
 * @author dkouicem
 */
public interface IAccountOperation {
    public enum OperationType{
        INIT,
        DEPOSIT,
        WITHDRAW
    }    
    abstract public void deposit(double amount, Date date);
    abstract public void withdraw(double amount, Date date);
    
    // we could add other abstract methods referring to other account operations, for instance there is only two methods (deposit and withraw)
    
}
