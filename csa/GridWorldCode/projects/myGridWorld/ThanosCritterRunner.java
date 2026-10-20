//dava dewald-wang

import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class ThanosCritterRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        ThanosCritter thanos = new ThanosCritter();
        DumbCritter harshini = new DumbCritter();
        Rock rock = new Rock();
        world.add(harshini);
        world.add(thanos);
        world.add(rock);
        world.show();
    }
}
