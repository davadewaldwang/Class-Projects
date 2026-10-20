import info.gridworld.actor.Bug;


public class PatternBug extends Bug
{
    int[] pattern;
    int count;

    public PatternBug(int[] patternArray)
    {
        pattern = patternArray;
        count = 0;
    }


    public void act()
    {
        if (count >= pattern.length) //reset loop if finished with pattern
            count = 0;
        setDirection(getDirection() + pattern[count] * 45); //set direction to starting direction plus direction of current step
        if (canMove()) //act like bug 🐞
            move();
        else
            turn();
        count++;
    }
}
