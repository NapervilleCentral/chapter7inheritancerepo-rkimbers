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
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner
{
    public static void main(String[] args)
    {
        int[] dances = {4,2,3,6,7,5,3,2,10,9,2,4,56,3,5,4,4,6,6,3,2,4,5,3,2,4,6,4,8,7};
        
        
        ActorWorld world = new ActorWorld();
        
        BoxBug bob = new BoxBug(3);
        SpiralBug ryan = new SpiralBug(10);
        ZBug Z = new ZBug(10);
        DancingBug James = new DancingBug(dances);
        
        //world.add(new Location(7,2),bob);
        //world.add(new LineBug());
        //world.add(new Location(5,5),ryan);
       // world.add(new Location(0,0),Z);
        
        world.add(new Location(5,5),James);
        //world.add(new Bug());
        //world.add(new Rock());
        world.show();
    }
}
