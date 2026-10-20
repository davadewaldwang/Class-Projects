//dava dewald-wang

import java.util.ArrayList;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class SpeedyCrab extends CrabCritter
{
    public ArrayList<Location> getMoveLocations()
    {
        ArrayList<Location> locations = new ArrayList<>();
        if (super.getMoveLocations().size() == 2) //if both locations next to sc are valid
        {
            ArrayList<Location> twoAway = new ArrayList<>();
            if (getGrid().isValid(super.getMoveLocations().get(0).getAdjacentLocation(getDirection() - 90)))
                twoAway.add(super.getMoveLocations().get(0).getAdjacentLocation(getDirection() - 90)); //location two away to the left
            if (getGrid().isValid(super.getMoveLocations().get(1).getAdjacentLocation(getDirection() + 90)))
                twoAway.add(super.getMoveLocations().get(1).getAdjacentLocation(getDirection() + 90)); //location two away to the right
            for (Location loc : twoAway)
                if (getGrid().get(loc) == null) //if nothing in loc it is ok to move
                    locations.add(loc);
            if (locations.size() > 0)   
                return locations;
        }
        if (super.getMoveLocations().size() == 1) //if only one adjacent location of sc is emmpty
        {
            Location next = null;
            //find which side of sc is where adjacent adjacent location is empty
            if (getGrid().isValid(super.getMoveLocations().get(0).getAdjacentLocation(getDirection() + 90)) && getGrid().get(super.getMoveLocations().get(0).getAdjacentLocation(getDirection() + 90)) == null)
                next = super.getMoveLocations().get(0).getAdjacentLocation(getDirection() + 90);
            else
            if (getGrid().isValid(super.getMoveLocations().get(0).getAdjacentLocation(getDirection() - 90)) && getGrid().get(super.getMoveLocations().get(0).getAdjacentLocation(getDirection() - 90)) == null)
                next = super.getMoveLocations().get(0).getAdjacentLocation(getDirection() - 90);
            if (next != null && getGrid().isValid(next)) //can move to next if it exists and is valid
            {
                locations.add(next);
                return locations;
            }
            
        }
        return super.getMoveLocations(); //if sc cant move two away then move like a crabcritter
    }
}
