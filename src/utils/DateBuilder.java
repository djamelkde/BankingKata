/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author dkouicem
 */
public class DateBuilder {
    public static final String format = "dd/MM/yyyy";
    public static Date date(String dateString) {
            Date date = null;
            SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
            try{
                date = DateFor.parse(dateString);
            }catch (ParseException e) {e.printStackTrace();}
            return date;		
    }
}
