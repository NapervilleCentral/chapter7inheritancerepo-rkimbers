/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Bug;


import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class CaseStudyNotes
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        
        Location loc1 = new Location(3,3);
        Location loc2 = new Location(2,3);
        Location loc3 = new Location(0,0);
        
        System.out.println(loc1.equals(loc2));
        
        //get a location in a certain direction
        
        System.out.println(loc1.getAdjacentLocation(Location.NORTH)); //2,3
        System.out.println(loc1.getAdjacentLocation(Location.EAST)); //3,4
        
        int dir = loc1.getDirectionToward(loc2);
        System.out.println(loc1.getAdjacentLocation(dir));
        
        
        dir = loc1.getDirectionToward(loc3);
        System.out.println(loc1.getAdjacentLocation(dir));
        
        
        dir = loc1.getDirectionToward(new Location(3,4));
        System.out.println(loc1.getAdjacentLocation(dir));
        
        Bug jake = new Bug();
        Bug jen = new Bug();
        DirBug ryan = new DirBug(jen);
        
        world.add(jen);
        world.add(new Location(0,0),ryan);
        world.add(new Location(5,5),jake);
        //find a obj location
        Location jenL = jen.getLocation();
        //find the direction they are in relation to us
        int jendir = jake.getLocation().getDirectionToward(jenL);
        jake.setDirection(jendir);
        
        

        
        
        /*
        BoxBug alice = new BoxBug(6);
        alice.setColor(Color.ORANGE);
        BoxBug bob = new BoxBug(3);
        CircleBug me = new CircleBug(10);
        me.setColor(Color.GREEN);
        
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.add(new Location(2,2), me);
        
        world.show();
        */
    }
}



