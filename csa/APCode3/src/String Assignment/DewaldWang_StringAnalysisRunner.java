public class DewaldWang_StringAnalysisRunner
{
    public static void main(String[] args)
    {
        
        StringAnalysis calc = new StringAnalysis("dogdog");
        //System.out.println(calc);
        calc.showArray();
        System.out.println();
        calc.showArrayList();
        //System.out.println(calc.getNumVowels());
        //System.out.println(calc.isAlphabetized());
        //System.out.println(calc.isPalindrome());
        //System.out.println(calc.wordCount(1, "dog"));
        System.out.println(calc.wordCount(2, "dog"));
        //System.out.println(calc.wordCount(3, "pom"));
    }
}