// McKeen remembers to put his name at the top of most of his files.  Do you?
// CritterRunner_McKeenTestCase2025
// Because of the snow day, BlushingCritter is now a commented BONUS


import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;


import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Critter;


import java.awt.Color;


import java.util.Scanner;
import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;


public class CritterRunner_McKeenTestCase2025
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int choice;
        ActorWorld world;
        //Flower f1;
       
        do
        {
           
            System.out.println("\n#############################################");
            System.out.println("\nWelcome to the Critter test cases.");
            System.out.println("What Test Case # do you want to run?\n\n"+
                                    "1. RockEater - 3x3\n"+
                                    "2. SpeedyCrab - 10x10 \n"+
                                    "3. SpeedyCrab - 7x7 \n"+
                                    "4. SpeedyCrab Diagonal - 7x7 \n"+
                                    "5. SmellyCrab - pushes all rocks away - 10x10 \n"+
                                    "6. SmellyCrab - remove all rocks - 10x10 \n"+
                                    "7. BONUS: BlushingCritter - 3x3 - brighten-darken every turn -- MUST BE UNCOMMENTED \n"+
                                    "8. BONUS: BlushingCritter - 10x10 - No other critters -- MUST BE UNCOMMENTED \n"+
                                    "9. BONUS: BlushingCritter - 10x10 - No other critters -- MUST BE UNCOMMENTED \n"+
                                    "10. BONUS: NarrowChameleon - 5x5 -- MUST BE UNCOMMENTED\n"+
                                    "11. BONUS: NarrowChameleon - 6x6 -- MUST BE UNCOMMENTED\n"+
   
                                    "99. Exit\n");
            System.out.println("#############################################");
            System.out.print("Please select a testing option:");
            choice = reader.nextInt();


            // Hack++ from Landon Smith
            // Closes all open Window objects (but not the terminal window)
            for (Frame f : Frame.getFrames()) {
                f.dispose();
            }
   
   
            if (choice == 1)
            {
                world = new ActorWorld(new BoundedGrid(3,3));
                RockEater c1 = new RockEater();
                c1.setDirection(0);
                world.add(new Location(1, 1), c1);
                world.add(new Location(0, 0), new Flower());
                world.add(new Location(0, 1), new Rock());
                world.add(new Location(0, 2), new Rock());
                world.add(new Location(1, 0), new Rock());
                world.add(new Location(1, 2), new Rock());
                world.add(new Location(2, 0), new Rock());
                world.add(new Location(2, 1), new Rock());
                world.add(new Location(2, 2), new Bug());
                world.show();
            }
   
            if (choice == 2)
            {
                world = new ActorWorld(new BoundedGrid(10,10));
                SpeedyCrab c1 = new SpeedyCrab();
                c1.setDirection(0);
                world.add(new Location(1, 2), c1);
                world.add(new Location(0,0), new Flower());
                world.add(new Location(0,1), new Flower());
                world.add(new Location(0,2), new Flower());
                world.add(new Location(0,3), new Flower());
                world.add(new Location(0,4), new Flower());
                world.add(new Location(0,5), new Flower());
                world.add(new Location(0,6), new Flower());
                world.add(new Location(0,7), new Flower());
                world.add(new Location(0,8), new Flower());
                world.add(new Location(0,9), new Flower());
                world.add(new Location (1,1), new Rock());
                world.add(new Location (1,8), new Rock());
                world.show();
            }
            if (choice == 3)
            {
                world = new ActorWorld(new BoundedGrid(7,7));
                SpeedyCrab c1 = new SpeedyCrab();
                SpeedyCrab c2 = new SpeedyCrab();
                SpeedyCrab c3 = new SpeedyCrab();
                SpeedyCrab c4 = new SpeedyCrab();
                c1.setDirection(0);
                c2.setDirection(90);
                c3.setDirection(180);
                c4.setDirection(270);
                world.add(new Location(1, 2), c1);
                world.add(new Location(2, 5), c2);
                world.add(new Location(5, 2), c3);
                world.add(new Location(2, 1), c4);
                world.add(new Location (1,1), new Rock());
                world.add(new Location (1,5), new Rock());
                world.add(new Location (5,5), new Rock());
                world.add(new Location (5,1), new Rock());
   
                world.add(new Location(0,0), new Flower());
                world.add(new Location(0,1), new Flower());
                world.add(new Location(0,2), new Flower());
                world.add(new Location(0,3), new Flower());
                world.add(new Location(0,4), new Flower());
                world.add(new Location(0,5), new Flower());
                world.add(new Location(0,6), new Flower());
   
                world.add(new Location(6,0), new Flower());
                world.add(new Location(6,1), new Flower());
                world.add(new Location(6,2), new Flower());
                world.add(new Location(6,3), new Flower());
                world.add(new Location(6,4), new Flower());
                world.add(new Location(6,5), new Flower());
                world.add(new Location(6,6), new Flower());
   
                world.add(new Location(1,0), new Flower());
                world.add(new Location(2,0), new Flower());
                world.add(new Location(3,0), new Flower());
                world.add(new Location(4,0), new Flower());
                world.add(new Location(5,0), new Flower());
   
   
                world.add(new Location(1,6), new Flower());
                world.add(new Location(2,6), new Flower());
                world.add(new Location(3,6), new Flower());
                world.add(new Location(4,6), new Flower());
                world.add(new Location(5,6), new Flower());
                world.show();
            }
            if (choice == 4)
            {
                world = new ActorWorld(new BoundedGrid(7,7));
                SpeedyCrab c1 = new SpeedyCrab();


                c1.setDirection(-45);
                world.add(new Location(4, 2), c1);


                world.show();
            }
            if (choice == 5)
            {
                world = new ActorWorld(new BoundedGrid(7,7));
                SmellyCrab c1 = new SmellyCrab();
                SmellyCrab c2 = new SmellyCrab();
                SmellyCrab c3 = new SmellyCrab();
                SmellyCrab c4 = new SmellyCrab();
                c1.setDirection(0);
                c2.setDirection(90);
                c3.setDirection(180);
                c4.setDirection(270);
                world.add(new Location(2, 3), c1);
                world.add(new Location(3, 4), c2);
                world.add(new Location(4, 3), c3);
                world.add(new Location(3, 2), c4);
                //north rocks
                world.add(new Location (1,2), new Rock());
                world.add(new Location (1,3), new Rock());
                world.add(new Location (1,4), new Rock());
                //east rocks
                world.add(new Location (2,5), new Rock());
                world.add(new Location (3,5), new Rock());
                world.add(new Location (4,5), new Rock());
                //south rocks
                world.add(new Location (5,2), new Rock());
                world.add(new Location (5,3), new Rock());
                world.add(new Location (5,4), new Rock());
                //west rocks
   
                world.add(new Location (2,1), new Rock());
                world.add(new Location (3,1), new Rock());
                world.add(new Location (4,1), new Rock());
   
                world.show();
            }
            if (choice == 6)
            {
                world = new ActorWorld(new BoundedGrid(7,7));
                SmellyCrab c1 = new SmellyCrab();
                SmellyCrab c2 = new SmellyCrab();
                SmellyCrab c3 = new SmellyCrab();
                SmellyCrab c4 = new SmellyCrab();
                c1.setDirection(0);
                c2.setDirection(90);
                c3.setDirection(180);
                c4.setDirection(270);
                world.add(new Location(2, 3), c1);
                world.add(new Location(3, 4), c2);
                world.add(new Location(4, 3), c3);
                world.add(new Location(3, 2), c4);
                //north rocks
                world.add(new Location (1,2), new Rock());
                world.add(new Location (1,3), new Rock());
                world.add(new Location (1,4), new Rock());
                //east rocks
                world.add(new Location (2,5), new Rock());
                world.add(new Location (3,5), new Rock());
                world.add(new Location (4,5), new Rock());
                //south rocks
                world.add(new Location (5,2), new Rock());
                world.add(new Location (5,3), new Rock());
                world.add(new Location (5,4), new Rock());
                //west rocks
   
                world.add(new Location (2,1), new Rock());
                world.add(new Location (3,1), new Rock());
                world.add(new Location (4,1), new Rock());
   
                world.add(new Location(0,0), new Flower());
                world.add(new Location(0,1), new Flower());
                world.add(new Location(0,2), new Flower());
                world.add(new Location(0,3), new Flower());
                world.add(new Location(0,4), new Flower());
                world.add(new Location(0,5), new Flower());
                world.add(new Location(0,6), new Flower());
   
                world.add(new Location(6,0), new Flower());
                world.add(new Location(6,1), new Flower());
                world.add(new Location(6,2), new Flower());
                world.add(new Location(6,3), new Flower());
                world.add(new Location(6,4), new Flower());
                world.add(new Location(6,5), new Flower());
                world.add(new Location(6,6), new Flower());
   
                world.add(new Location(1,0), new Flower());
                world.add(new Location(2,0), new Flower());
                world.add(new Location(3,0), new Flower());
                world.add(new Location(4,0), new Flower());
                world.add(new Location(5,0), new Flower());
   
   
                world.add(new Location(1,6), new Flower());
                world.add(new Location(2,6), new Flower());
                world.add(new Location(3,6), new Flower());
                world.add(new Location(4,6), new Flower());
                world.add(new Location(5,6), new Flower());
                world.show();
            }
//  *************************************************************************************************
//  *************************************************************************************************
//  *****************BlushingCritter ****************************************************************
/*
            if (choice == 7)
            {
                world = new ActorWorld(new BoundedGrid(3,3));
                BlushingCritter c1 = new BlushingCritter(1);
                c1.setDirection(0);
                c1.setColor(Color.PINK);
                world.add(new Location(1, 1), c1);
               
                world.show();
            }
           
            if (choice == 8)
            {
                world = new ActorWorld(new BoundedGrid(10,10));
                BlushingCritter c1 = new BlushingCritter(1);
                c1.setDirection(0);
                c1.setColor(Color.GREEN);
                world.add(new Location(4, 4), c1);
               
                for(int i = 2; i<= 6; i++)
                    for (int j = 2; j<=6; j++)
                        if (i!=4 || j !=4)
                            world.add(new Location(i,j), new Rock()); //Make 5x5 rocks
                           
                world.show();
            }


            if (choice == 9)
            {
                world = new ActorWorld(new BoundedGrid(5,5));
                BlushingCritter c1 = new BlushingCritter(1);
                c1.setDirection(0);
                c1.setColor(Color.ORANGE);
                world.add(new Location(2, 2), c1);
               
                for(int i = 1; i<= 3; i++)
                    for (int j = 1; j<=3; j++)
                        if (i!=2 || j !=2)
                            world.add(new Location(i,j), new Rock()); //Make 3x3 rocks
                           
                world.add(new Location(0,0), new Rock()); //Make corner rocks
                world.add(new Location(0,4), new Rock()); //Make corner rocks
                world.add(new Location(4,0), new Rock()); //Make corner rocks
                world.add(new Location(4,4), new Rock()); //Make corner rocks


                world.add(new Location(0,1), new Rock()); //Make edge rocks
                world.add(new Location(0,3), new Rock()); //Make edge rocks
                world.add(new Location(1,0), new Rock()); //Make edge rocks
                world.add(new Location(1,4), new Rock()); //Make edge rocks


                world.add(new Location(3,0), new Rock()); //Make edge rocks
                world.add(new Location(3,4), new Rock()); //Make edge rocks
                world.add(new Location(4,1), new Rock()); //Make edge rocks
                world.add(new Location(4,3), new Rock()); //Make edge rocks




                world.add(new Location(0,2), new Critter());                
                world.add(new Location(2,0), new Critter());                
                world.add(new Location(0,4), new Rock()); //Make corner rocks
                world.add(new Location(2,4), new Critter());                
                world.add(new Location(4,2), new Critter());                
                world.add(new Location(0,4), new Rock()); //Make corner rocks






                world.show();
            }
           
*/




//  *************************************************************************************************
// MUST BE UNCOMMENTED ******************************************************************************
// TO TEST THE BONUS NarrowChameleon ****************************************************************
/*
            if (choice == 10)
            {
                world = new ActorWorld(new BoundedGrid(5,5));
                NarrowChameleon c1 = new NarrowChameleon();
                c1.setDirection(90);
                world.add(new Location(2, 2), c1);
                Rock r1 = new Rock();
                r1.setColor(Color.RED);
                world.add(new Location(1, 1), r1);
                Rock r2 = new Rock();
                r2.setColor(Color.BLUE);
                world.add(new Location(1, 3), r2);
                Rock r3 = new Rock();
                r3.setColor(Color.GREEN);
                world.add(new Location(3, 1), r3);
                Rock r4 = new Rock();
                r4.setColor(Color.PINK);
                world.add(new Location(3, 3), r4);
                world.show();
            }
   
            if (choice == 11)
            {
                world = new ActorWorld(new BoundedGrid(6,6));
                NarrowChameleon c1 = new NarrowChameleon();
                c1.setDirection(0);
                world.add(new Location(1, 0), c1);
                Rock r1 = new Rock();
                r1.setColor(Color.RED);
                world.add(new Location(0, 0), r1);
                Rock r2 = new Rock();
                r2.setColor(Color.BLUE);
                world.add(new Location(0, 5), r2);
                Rock r3 = new Rock();
                r3.setColor(Color.GREEN);
                world.add(new Location(5, 0), r3);
                Rock r4 = new Rock();
                r4.setColor(Color.PINK);
                world.add(new Location(5, 5), r4);
                world.show();
            }
*/
// ****************************************************************************************************
// ****************************************************************************************************
// ****************************************************************************************************


        }
        while(choice != 99);
       
    System.out.println("\n\nMr. McKeen is very happy that you have taken this class.");
    System.out.println("Thank you for providing him with a meaningful way to feed his children.\n\n");
           
        System.exit(0);
    }
}

