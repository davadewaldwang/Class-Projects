
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;
import info.gridworld.actor.Rock;


public class PatternBugRunner {
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        //int[] james = {1,0,0,1,6,2,0,6,2,0,0,0,0,0,0,0,2};
        int [] sunshine = {1, 2, 3, 4};
        PatternBug lebron = new PatternBug(sunshine);
        world.add(new Location(3, 3), lebron);
        world.show();

        Rock rock = new Rock();
        world.add(new Location(3, 5), rock);
    }
}
