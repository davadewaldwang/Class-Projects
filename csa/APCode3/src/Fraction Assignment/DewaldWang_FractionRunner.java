public class DewaldWang_FractionRunner {
    public static void main(String[] args)
    {
        Fraction mango = new Fraction(-9.25);
        mango.print();

        Fraction skibidi = new Fraction(-1,-4);
        skibidi.print();
        System.out.println(mango.subtract(skibidi));

        System.out.println(mango.add(skibidi));

        System.out.println(mango.multiply(skibidi));

        System.out.println(mango.divide(skibidi));

        System.out.println(mango.toDouble());

        System.out.println(mango.compareTo(skibidi));

        System.out.println(mango.equals(3,10));

        System.out.println(mango.equals(.40000001));

        //bonus
        Fraction test = new Fraction(1,3), test2 = new Fraction(1,5), test3 = new Fraction(1,6);
        char[] operators ={'+','+','-','*','/'};
        Fraction[] fractions = {mango,skibidi,test,test2,test3};
        Fraction bonus = new Fraction(1,8);
        System.out.println(bonus.FractionList(operators,fractions));


    }
}