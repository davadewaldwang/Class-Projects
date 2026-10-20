import info.gridworld.actor.Bug;


public class WBug extends Bug
{
    private int steps;
    private int sideLength;
    private int turns;


    public WBug(int length)
    {
        steps = 0;
        sideLength = length;
        turns = 0;
        this.setDirection(180); //start facing south

    }


    public void act()
    {
        if (steps < sideLength && canMove()) //move if can move and under length limit
        {
            move();
            steps++;
        }
        else
        if (turns < 3 && turns % 2 == 0) //can only turn 3 times
        {
            setDirection(45); //face northeast if on even number of turns so at bottom of w
            turns++; //complete 1 turn
            steps = 0; //reset for length of next leg
        }
        else
        if (turns < 3 && turns % 2 == 1)
        {
            setDirection(180); //face south if odd number of turns so top of w
            turns++;
            steps = 0;
        }
    }
}
