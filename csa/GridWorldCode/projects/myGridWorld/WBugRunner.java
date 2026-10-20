import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;

import java.awt.Color;


public class WBugRunner extends Bug
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        WBug alice = new WBug(3);
        alice.setColor(Color.ORANGE);
        world.add(new Location(7, 2), alice);
        Rock patrick = new Rock();
        world.add(new Location(3, 5), patrick);
        world.show();
    }
}