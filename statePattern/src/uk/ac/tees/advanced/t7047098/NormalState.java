/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.advanced.t7047098;

import java.awt.Point;

/**
 *
 * @author t7047098
 */
public class NormalState implements RailgunState
{

    @Override
    public String fire(Point p, int x, Railgun r) 
    {
        r.noOfRounds -= x;
        return "Fire order: Success 6/6";
    }

    @Override
    public String move(Point p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
