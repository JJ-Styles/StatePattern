/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.standard.t7047098;

/**
 *
 * @author t7047098
 */
public abstract class FlightUpgrade extends Flight
{
    protected Flight flight;

    public FlightUpgrade(Flight flight) 
    {
        this.flight = flight;
    }
    
    @Override
    public double getCost()
    {
        return flight.getCost() + this.cost;
    }
}
