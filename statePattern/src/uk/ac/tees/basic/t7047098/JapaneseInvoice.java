/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.basic.t7047098;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 *
 * @author t7047098
 */
public class JapaneseInvoice implements InvoicingAlgorithm
{

    @Override
    public String getInvoice(String n, double a) 
    {
        double converter = a * 121;
        
        String ln1 = "TO:	" + n + "\n";
        String ln2 = "FROM:	Easyflap (UK)\n";
        String ln3 = String.format("AMOUNT:	%s%.2f\n", "\u00a5", converter);
        
        return "--------------------------------------\n"
                + ln1 
                + ln2
                + ln3
                + "--------------------------------------";
    }
    
}
