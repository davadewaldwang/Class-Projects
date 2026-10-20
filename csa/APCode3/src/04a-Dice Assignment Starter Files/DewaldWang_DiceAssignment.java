// DewaldWang_DiceAssignment
// dava dewald-wang
// practice with objects using Dice class

class DewaldWang_DiceAssignment {
  static KeyboardReader reader = new KeyboardReader();
  public static void main(String[] args)
  {

    System.out.println("\nRUNNING THE DICE ASSIGNMENT\n\n");

    int selection = 0;

    while (selection != 99) //looping selection menu
    {
      System.out.println();
      System.out.println("Select: ");
      System.out.println("1.\t2 6-sided dice");
      System.out.println("2.\t10,000 rolls");
      System.out.println("3.\tPlay craps");
      System.out.println("4.\t100,000 games of craps");
      System.out.println("5:\tFive and One");
      System.out.println("99.\tStop");

      selection = reader.readInt("Selection:\t");
      System.out.println();

      switch(selection)
      {
        case 1:
          method1();
        break;
        
        case 2:
          method2();
        break;

        case 3:
          craps();
        break;

        case 4:
          craps100k();
        break;

        default:
          if (selection == 99)
            System.out.println("harshini eats toes");
      }
    }
  }

  static public void method1()
  {
    char play = 'y'; //

    //create 2 dice
    Dice dice1 = new Dice(6);
    Dice dice2 = new Dice(6);

    while (play == 'y')
    {
      int n = reader.readInt("How many times would you like to roll the dice?\t");
      System.out.println();
      int roll1, roll2, sum;
      for (int i = 0; i < n; i++)//display rolls & sum for each round
      {
        roll1 = dice1.roll();
        roll2 = dice2.roll();
        sum = roll1 + roll2;
        System.out.println("Roll #" + (i + 1) + ":\t" + roll1 + " + " + roll2 + " = " + sum);
        reader.pause();
      }
      System.out.println();
      play = Character.toLowerCase(reader.readChar("Would you like to play again? (Y/N)\t"));//case insensitive
    }
  }

  static public void method2()
  {
    Dice dice = new Dice(6);
    int[] count = new int[6]; //array to store # of times per roll

    for (int i = 0; i < 10000; i++)
    {
      count[dice.roll() - 1]++; //each roll sorted into corresponding array cell-1, +1 for each roll
    }
    
    for (int i = 0; i < 6; i++)
    {
      System.out.println("Number of times " + (i + 1) + " was rolled:\t" + count[i]); //display counts in array
    }
  }

  static public void craps()
  {
    Dice dice1 = new Dice(6);
    Dice dice2 = new Dice(6);
    int roll1, roll2, point, sum;
    char play = 'y';
    while(play == 'y')
    {
      System.out.println();
      roll1 = dice1.roll();
      roll2 = dice2.roll();
      sum = roll1 + roll2;
      point = sum;
      boolean cont = true;//

      System.out.println("Player rolled " + roll1 + " + " + roll2 + " = " + sum); //first roll
      if (sum == 7 || sum == 11)
      {
        System.out.println("Player wins!");
        cont = false; //if win dont continue
      }
      if (sum == 2 || sum == 3 || sum == 12)
      {
        System.out.println("Player loses.");
        cont = false; //if lose dont continue
      }
      if (cont == true)
        System.out.println("Point is " + point + ".\n");//continue if none of above

      while(cont == true) //next rolls
      {
        roll1 = dice1.roll();
        roll2 = dice2.roll();
        sum = roll1 + roll2;

        System.out.println("Player rolled " + roll1 + " + " + roll2 + " = " + sum); //first roll
        if (sum == point)//win if point
        {
          System.out.println("Player wins!");
          cont = false;
        }
        else if (sum == 7)//lose if 7
        {
          System.out.println("Player loses.");
          cont = false;
        }
      }
      System.out.println();
      play = Character.toLowerCase(reader.readChar("Would you like to play again? (Y/N)\t"));
    }
  }

  public static void craps100k()
  {
    int win = 0, lose = 0; //overall lose/win
    int win1 = 0, winP = 0, lose1 = 0, loseP = 0; //win first roll, win point, lose first roll, lose no point
    int roll1, roll2, sum, point;
    //die
    Dice dice1 = new Dice(6);
    Dice dice2 = new Dice(6);

    //100000 games of craps
    //same as craps without printlns
    //also counts times per each win
    for (int i = 0; i < 100000; i++)
    {
      roll1 = dice1.roll();
      roll2 = dice2.roll();
      sum = roll1 + roll2;
      point = sum;
      boolean cont = true;

      if (sum == 7 || sum == 11)
      {
        win1++;
        win++;
        cont = false;
      }
      if (sum == 2 || sum == 3 || sum == 12)
      {
        lose1++;
        lose++;
        cont = false;
      }

      while(cont == true)
      {
        roll1 = dice1.roll();
        roll2 = dice2.roll();
        sum = roll1 + roll2;

        if (sum == point)
        {
          winP++;
          win++;
          cont = false;
        }
        else if (sum == 7)
        {
          loseP++;
          lose++;
          cont = false;
        }
      }
    }

    System.out.println("Games won:\t" + win);
    System.out.println("Games lost:\t" + lose);
    System.out.println("Games won on first roll:\t" + win1);
    System.out.println("Games lost on first roll:\t" + lose1);
    System.out.println("Games won by making point:\t" + winP);
    System.out.println("Games lost by not making point:\t" + winP);
    System.out.println();
    
    System.out.println("Overall experimental probibility of winning:\t" + ((double)win/100000));
    System.out.println("Overall experimental probibility of losing:\t" + ((double)lose/100000));
    System.out.println();
    System.out.println("Experimental probibility of winning on first roll:\t" + ((double)win1/100000));
    System.out.println("Experimental probibility of losing on first roll:\t" + ((double)lose1/100000));
    System.out.println("Experimental probibility of winning by making point:\t" + ((double)winP/100000));
    System.out.println("Experimental probibility of losing by not making point:\t" + ((double)loseP/100000));
  }

  public static void fiveOne()
  {

  }
}