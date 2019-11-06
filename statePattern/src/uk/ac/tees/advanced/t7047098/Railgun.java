/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.advanced.t7047098;

/**
 *
 * @author t7047098
 */
public class Railgun 
{
    RailgunState state;
    int noOfRounds;

    public Railgun() 
    {
        this.state = new NormalState();
        noOfRounds = 10;
    }
    
    
}
