//dava dewald-wang

import info.gridworld.actor.*;
import info.gridworld.grid.*;

import java.awt.Color;

public class Jumper extends Actor
{

    public Jumper()
    {
        setDirection(180);
        setColor(Color.blue);
    }

    public Jumper(Color bugColor)
    {
        setDirection(180);
        setColor(bugColor);
    }

    public void act()
    {
        Location adjAdjLoc = getLocation().getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection()); //adjacent location of the adjacent location
        Location newLocation;
        if (getGrid().isValid(adjAdjLoc)) //if in grid go there
            newLocation = new Location(adjAdjLoc.getRow(), adjAdjLoc.getCol());
        else
            newLocation = new Location(mod(adjAdjLoc.getRow(), getGrid().getNumRows()), mod(adjAdjLoc.getCol(), getGrid().getNumCols()));
        
        if (getGrid().get(newLocation) instanceof Rock)
            setDirection(getDirection() + 45); //turn if new location has actor           
        else
            moveTo(newLocation);
    }

    private static int mod(int a, int b) //helper method rewrite %
    {
        int remainder = 0;
        while((double)a / b != a / b) //check if no remainder
        {
            a--;
            remainder++; //count how many integers away from closest smaller divisible integer
        }
        return remainder;
    }
}