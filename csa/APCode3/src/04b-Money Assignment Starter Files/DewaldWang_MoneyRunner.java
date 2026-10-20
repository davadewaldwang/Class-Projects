// DewaldWang_MoneyRunner
// dava dewald-wang
// Use this file to THOROUGHLY test the Money Class because Mr. McKeen's test cases can be nasty

class DewaldWang_MoneyRunner
{
	public static void main(String[] args)
	{
		KeyboardReader reader = new KeyboardReader();
		
		Money joe = new Money(67,-201);
		joe.print(); //test print method
		
		Money mustard = new Money(69,69);
		System.out.println(mustard.toString());

		Money mango = mustard.add(joe); //test add method with Money parameter & normalize for cent > 99
		mango = mango.add(4,30); //test add method with two int parameters
		mango.print();

		System.out.println(mango = mango.subtract(mustard)); //test subtract method with Money parameter

		System.out.println(mango = mango.subtract(2,99)); //test subtracdt method with two int parameters

		System.out.println(mango.subtract(mustard)); //test normalize for negative money

		System.out.println(mango = mango.multiply(10));//test multiply method

		System.out.println(mango.add(joe));

		Money.SortMoney();
	}
}

