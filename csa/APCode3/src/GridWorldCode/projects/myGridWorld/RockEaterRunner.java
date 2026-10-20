//dava dewald-wang

import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class RockEaterRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld(new BoundedGrid<>(5,5));
        Rock dwayne = new Rock();
        RockEater patrick = new RockEater();

        world.add(new Location(2,2),dwayne);
        world.add(new Location(3,2),patrick);
        world.show();
    }
}
