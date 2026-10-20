
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;


public class OctaBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        OctaBug alice = new OctaBug(6);
        alice.setColor(Color.ORANGE);
        OctaBug bob = new OctaBug(3);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}