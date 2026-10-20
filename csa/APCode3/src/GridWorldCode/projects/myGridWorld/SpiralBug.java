import info.gridworld.actor.Bug;


public class SpiralBug extends Bug
{
    private int steps;
    private int sideLength;


    public SpiralBug(int length)
    {
        steps = 0;
        sideLength = length;
    }


    public void act()
    {
        if (steps < sideLength && canMove()) //move if under length limit
        {
            move();
            steps++;
        }
        else
        {
            turn(); //turn 90 degrees
            turn();
            sideLength++; //increase length limit for next loop
            steps = 0;
        }
    }
}
