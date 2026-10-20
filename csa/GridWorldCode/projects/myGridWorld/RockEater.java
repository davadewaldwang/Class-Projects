//dava dewald-wang

import java.util.ArrayList;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class RockEater extends Critter
{
    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            if (a instanceof Rock) //eat a if a is a rock
                a.removeSelfFromGrid();
        }
    }

    public void makeMove(Location loc)
    {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }
}
