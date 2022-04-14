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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dkouicem
 */
public final class AccountManager implements IAccountOperation{
    
    private static AccountManager accountManager;
    
    //we assure that we manage only one account, in case these is many, we can store them in a linkedlist.
    private Account account;
    private List<Transaction> transactions;
    private TransactionsPrinter txPrinter;
    
    private AccountManager(Account account){
        this.account = account;
        transactions = new LinkedList<Transaction>();
        txPrinter = new TransactionsPrinter();
        Transaction tx = new Transaction(account, IAccountOperation.OperationType.INIT, account.getBalance(), new Date()); 
        transactions.add(tx);
        txPrinter.addLine(tx, account.getBalance());
    }
    
    public static AccountManager getManager(Account account){
        if(accountManager == null){
            accountManager = new AccountManager(account);
        }
        return accountManager;
        
    }
    
    @Override
    public void deposit(double amount, Date date) {
        double newBalance = account.getBalance() +amount;
        try {
            account.notifyUpdate(accountManager, newBalance);
        } catch (Exception ex) {
            Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        Transaction tx = new Transaction(account, IAccountOperation.OperationType.DEPOSIT, amount, date);
        transactions.add(tx);
        txPrinter.addLine(tx, account.getBalance());
    }

    @Override
    public void withdraw(double amount, Date date) {
        try {
            if(account.getBalance() - amount >=0){
                double newBalance = account.getBalance() - amount;
                account.notifyUpdate(accountManager, newBalance);
            }
            throw new Exception("the withdrawal is imposssible, no enough money!");
        } catch (Exception ex) {
            Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
        }
        Transaction tx = new Transaction(account, IAccountOperation.OperationType.WITHDRAW, amount, date);
        transactions.add(tx);
        txPrinter.addLine(tx, account.getBalance());
    }
    
    public void printTransactionsHistory(PrintStream printer){
        txPrinter.printTransactions(printer);
    }
}
