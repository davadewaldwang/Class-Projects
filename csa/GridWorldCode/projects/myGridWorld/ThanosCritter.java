//dava dewald-wang

import java.awt.Color;
import java.util.ArrayList;


import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class ThanosCritter extends Critter
{
    private int stones;
    public ThanosCritter() //constructor
    {
        setColor(new Color(155, 0, 240));
        stones = 0;
    }

    public ArrayList<Location> getMoveLocations()
    {
        ArrayList<Location> rocks = new ArrayList<>();
        for (Location i : this.getGrid().getOccupiedAdjacentLocations(getLocation()))
        {
            if (getGrid().get(i) instanceof Rock)
            {

                rocks.add(i);//add locations of rocks to possible locations
            }
        }
        if (rocks.size() > 0)
            return rocks;
        return super.getMoveLocations();
    }

    public Location selectMoveLocation(ArrayList<Location> locs)
    {
        ArrayList<Location> rocks = new ArrayList<>();
        for (Location hold : locs) //get location of adjacent rocks
        {
            if (getGrid().get(hold) instanceof Rock)
                rocks.add(hold);
        }
        if (rocks.size() > 0)
        {
            int r = (int) (Math.random() * rocks.size()); 
            return rocks.get(r); //move to random rock
        }
        return super.selectMoveLocation(locs); //if no rocks do what critter does
    }

    public void processActors(ArrayList<Actor> actors) 
    {
        if (stones == 6)
        {
            Grid<Actor> gr = getGrid();
            ArrayList<Location> locs = gr.getOccupiedLocations();
            System.out.println(locs);
            Location[] die = new Location[locs.size()/2];
            for (int i = 0; i < die.length; i++) //make new array of half of random occupied location
            {
                int rand = (int) (Math.random() * locs.size());
                die[i] = locs.get(rand);
                locs.remove(rand);
            }
            for (Location kill : die)
            {
                gr.get(kill).removeSelfFromGrid(); //remove self - object in location of randomly selected locadtions
            }
            if (getGrid() != null)
            {
                Flower flower = new Flower();
                flower.putSelfInGrid(getGrid(), getLocation()); //replace thanos with flower if it still exists
            }
        }

        /*for (Actor a : actors) 
        {
            if (a instanceof Rock)
            {
                System.out.println(a.getGrid().getNeighbors(a.getLocation()));
                
            }
        }*/
        
    }

    public void makeMove(Location loc) 
    {
        setDirection(getLocation().getDirectionToward(loc));      
        super.makeMove(loc);
    }

    public void act()
    {
        if (getGrid() == null)
            return;
        ArrayList<Actor> actors = getActors();
        processActors(actors);
        if (getGrid() == null)
            return;
        ArrayList<Location> moveLocs = getMoveLocations();
        Location loc = selectMoveLocation(moveLocs);
        if (getGrid().get(loc) instanceof Rock)
        {
            for (Actor k : getGrid().getNeighbors(loc))
                    if (!(k instanceof ThanosCritter) && !(k instanceof Rock))
                        k.removeSelfFromGrid(); //kill actors neighboring rock location
                stones++; //collect rock
        }
        makeMove(loc);
    }
}
