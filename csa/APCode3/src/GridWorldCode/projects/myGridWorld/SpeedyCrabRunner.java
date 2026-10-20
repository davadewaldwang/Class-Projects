//dava dewald-wang

import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class SpeedyCrabRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld(new BoundedGrid<>(2, 6));
        SpeedyCrab krabs = new SpeedyCrab();
        
        world.add(new Location(1,4), krabs);
        world.show();
    }
}
