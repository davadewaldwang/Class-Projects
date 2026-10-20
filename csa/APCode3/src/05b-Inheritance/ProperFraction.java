//dava dewald-wang
//proper fraction assignment - turn fractions into proper fractions

public class ProperFraction extends Fraction
{
    public ProperFraction(int n, int d) //proper fraction constructor
    {
        super(n,d); //make a fraction object
    }

    public int getWhole()
    {
        return getNumerator() / getDenominator();
    }

    public int getRemainder()
    {
        return (getNumerator() % getDenominator());
    }

    public String toString()
    {
        if (getWhole() == 0 && getRemainder() != 0) //fraction less than one
            return "" + getRemainder() + "/" + getDenominator();
        else
        if (getRemainder() == 0)
            return "" + getWhole(); //whole number
        else
            return "" + getWhole() + " " + Math.abs(getRemainder()) + "/" + getDenominator(); //so negative shows up only in front of whole number
    }

    public void print()
    {
        System.out.println(this.toString());
    }
}
