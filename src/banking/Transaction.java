/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import banking.IAccountOperation.OperationType;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dkouicem
 */
public class Transaction{
    
    private OperationType operationType;
    private double value;
    private Date date;
    private Account account;
    
    public OperationType getOperationType() {
        return operationType;
    }

    public double getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }
    
    public Transaction(Account account, OperationType operationType, double value, Date date){
        this.account = account;
        this.operationType = operationType;
        this.value = value;
        this.date = date;
    }
    
}
