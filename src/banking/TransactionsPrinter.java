/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author dkouicem
 */
public class TransactionsPrinter {
    
    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final String EMPTY_VALUE = "          ";
    public static final String STATEMENT_HEADER = "Date       | Credit   | Debit    | Balance";
    
    private List<String> statementLines = new LinkedList<String>();
    public void addLine(Transaction operation, double currentBalance){
        String line = "";
        line +=operation.getDate().toString()+" | ";
        if(operation.getOperationType() == IAccountOperation.OperationType.INIT || operation.getOperationType() == IAccountOperation.OperationType.DEPOSIT){
            line +=operation.getValue()+" | ";
            line +=EMPTY_VALUE+"|";
        }
        else if (operation.getOperationType() == IAccountOperation.OperationType.WITHDRAW){
            line +=operation.getValue()+" | ";
            line +=EMPTY_VALUE+" | ";
        }
        line += currentBalance;
        statementLines.add(line);
    }
    
    public void printTransactions(PrintStream printer){
        printer.println(STATEMENT_HEADER);
        printLines(printer);
    }
    
    private void printLines(PrintStream printer) {
        for (String statementLine : statementLines) {
                printer.println(statementLine);
        }
}

    
}
