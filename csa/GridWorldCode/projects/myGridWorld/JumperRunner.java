import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class JumperRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        Jumper skibidi = new Jumper();
        world.add(new Location(4, 5), skibidi);
        world.show();
    }
}
