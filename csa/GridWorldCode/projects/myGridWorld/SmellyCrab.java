//dava dewald-wang

import java.util.ArrayList;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class SmellyCrab extends CrabCritter
{
    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor actor : actors)
        {
            Location moveTo = actor.getLocation().getAdjacentLocation(180 + actor.getLocation().getDirectionToward(getLocation())); //opposite direction as towards this
            if (getGrid().isValid(moveTo) && getGrid().get(moveTo) == null)
                actor.moveTo(moveTo);
            else
                if (!(actor instanceof Critter))
                    actor.removeSelfFromGrid();
        }
    }
}
