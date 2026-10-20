//dava dewald-wang
//fraction class assignment

public class Fraction implements FractionInterface
{

    //private instance variables
    private int myNum;
    private int myDenom;

    //constructors
    public Fraction()       //fraction to 0/1
    {
        myNum = 0;
        myDenom = 1;
    }

    public Fraction(int n, int d)    //full simplified fraction
    {
        myNum = n;
        myDenom = d;
        simplify();
    }

    public Fraction(double db)
    {
        myNum = 1;
        myDenom = 1;
        while ((double)myNum / myDenom != Math.abs(db))
        {
            if ((double)myNum / myDenom > Math.abs(db)) //make denominator bigger to make fraction smaller
                myDenom++;
            if ((double)myNum / myDenom < Math.abs(db)) //make numerator bigger to make fraction bigger
                myNum++;
        }
        if (db < 0)
            myNum *= -1;
        simplify();
    }

    //private method
    private void simplify()     //fully reduce fraction
    {
        if (myDenom == 0) //cant have 0 denominator
        {
            System.out.println("Error: cannot divide by zero");
            myNum = 0;
            myDenom = 1;
        }

        /*int big;
        if (myNum > myDenom) //set big to bigger value
            big = myNum;
        else   
            big = myDenom;
        int gcd = big;
        for (int i = 0; i < big; i++) //run through loop until biggest factor of both numbers
        {
            if (myNum % gcd == 0 && myDenom % gcd == 0)
                break;
            gcd--;
        }
        myNum /= gcd;
        myDenom /= gcd;*/

        int min = Math.min(myNum, myDenom);
        for (int i = min; myNum % i != 0 || myDenom % i != 0; i++)
        {
            if (myNum % i == 0 && myDenom % i == 0)
            {
                myNum /= i;
                myDenom /= i;
            }
        }
        
        if (myDenom < 0) //negative denominator -> negative numerator
        {
            myDenom = Math.abs(myDenom);
            myNum *= -1;
        }

    }

    //public methods
    public Fraction add(Fraction f)
    {
        Fraction result = new Fraction();
        result.myNum = this.myNum * f.myDenom + f.myNum * this.myDenom; //get common denominator
        result.myDenom = this.myDenom * f.myDenom;
        result.simplify();
        return result;
    }

    public Fraction subtract(Fraction f)
    {
        Fraction result = new Fraction();
        result.myNum = this.myNum * f.myDenom - f.myNum * this.myDenom; //common denominator
        result.myDenom = this.myDenom * f.myDenom;
        result.simplify();
        return result;
    }

    public Fraction multiply(Fraction f)
    {
        Fraction result = new Fraction();
        result.myNum = this.myNum * f.myNum; //multiply straight across
        result.myDenom = this.myDenom * f.myDenom;
        result.simplify();
        return result;
    }

    public Fraction divide(Fraction f)
    {
        Fraction result = new Fraction(f.myDenom, f.myNum); //multiply by reciprocal fraction
        result = this.multiply(result);
        result.simplify();
        return result; 
    }

    public double toDouble()
    {
        return (double)myNum / myDenom;
    }

    public int compareTo(Fraction f)        //return 1 if this > f, 0 if this = f, -1 if this < f
    {
        double one = this.toDouble();
        double two = f.toDouble();
        if (one > two)
            return 1;
        if (one == two)
            return 0;
        else   
            return -1;
    }

    public boolean equals(Fraction f)
    {
        return (this.compareTo(f) == 0); //return true if both equal each other
    }

    public boolean equals(double dd)
    {
        return (this.toDouble() >= (dd - .00000001) && this.toDouble() <= (dd + .00000001)); //within .00000001 of db

    }

    public boolean equals(int n, int d)
    {
        return (myNum * d == myDenom * n); //return true if same numerator with common denominator
    }

    //accessors
    public int getNumerator()
    {
        return myNum;
    }

    public int getDenominator()
    {
        return myDenom;
    }

    public void print()
    {
        System.out.println(this);
    }

    public String toString()
    {
        String s1 = myNum + "/" + myDenom;
        return s1;
    }


    //bonus
    public Fraction FractionList(char[] operators, Fraction[] list)
    {
        Fraction result = this;
        for (int i = 0; i < list.length; i++)
        {
            if (operators[i] == '+')
                result = result.add(list[i]);
            if (operators[i] == '-')
                result = result.subtract(list[i]);
            if (operators[i] == '*')
                result = result.multiply(list[i]);
            if (operators[i] == '/')
                result = result.divide(list[i]);
        }
        return result;
    }
}