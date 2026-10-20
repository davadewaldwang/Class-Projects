//dava dewald-wang

import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.Color;


public class DewaldWang_JumperTestCase 
{
    public static void main(String[] args)
    {
    	//KeyboardReader reader = new KeyboardReader();
        ActorWorld world;
        Jumper lebron;
		Flower james;
		
		//Create a new ActorWorld that contains a 6X3 Bounded Grid
        world = new ActorWorld(new BoundedGrid(3,4));
        
        lebron = new Jumper();
        lebron.setDirection(45);  //facing northeast
        
        james = new Flower();
        
        //Add a jumper that is facing East at location 2,0
        world.add(new Location(2, 0), lebron);

        world.add(new Location(2, 2), james);  // Add the flower
        world.add(new Location(1,2), new Rock()); // Add the rock
        
        world.show();
    }
}