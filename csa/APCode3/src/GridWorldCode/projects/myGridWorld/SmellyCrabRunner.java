//dava dewald-wang

import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class SmellyCrabRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld(new BoundedGrid<>(3,5));
        SmellyCrab matt = new SmellyCrab();
        matt.setDirection(Location.SOUTH);
        Rock dwayne = new Rock();

        world.add(new Location(0,2), matt);
        world.add(new Location(1,1), dwayne);
        world.show();
    }
}
