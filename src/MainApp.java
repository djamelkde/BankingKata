
import banking.Account;
import banking.AccountManager;
import static utils.DateBuilder.date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkouicem
 */
public class MainApp {
    
    public static void main(String[] args) {
        Account account = new Account(50.0); // the first init operation is displayed as a deposit transaction

        AccountManager manager= AccountManager.getManager(account);

        manager.deposit(100.0, date("01/04/2022 12:45:53"));
        manager.deposit(200.0, date("05/04/2022 16:00:10"));
        //manager.withdraw(70.0, date("10/04/2022 13:16:54"));
        
        //account.printStatement(System.out);
        manager.printTransactionsHistory(System.out);
    }

    
}
