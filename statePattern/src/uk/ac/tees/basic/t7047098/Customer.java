/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.basic.t7047098;

/**
 *
 * @author t7047098
 */
public class Customer 
{
    String name;
    double amount;
    InvoicingAlgorithm i;

    public Customer(String name, double amount) 
    {
        this.name = name;
        this.amount = amount;
    }

    public void setInvoicingAlgorithm(InvoicingAlgorithm i) {
        this.i = i;
    }
    
    public String getInvoice()
    {
        return i.getInvoice(name,amount);
    }
}
