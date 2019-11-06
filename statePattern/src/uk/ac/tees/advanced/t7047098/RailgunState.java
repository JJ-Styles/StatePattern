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
public interface RailgunState 
{
   public abstract String fire(Point p, int x, Railgun r);
   public abstract String move(Point p);
}
