//dava dewald-wang 
//PolygonsRunner.java 
//An introduction to inheritance in OOP

public class PolygonsRunner
{
	public static void main(String[]args)
	{
		KeyboardReader reader = new KeyboardReader();

// Let's add a polygon here
		Polygons[] shapes = {new Rectangles(4,4), new Rectangles(2,12)}; //declare and initialize array of polygon objects

		for (Polygons i : shapes) //for each loop
		{
			i.displayInfo();
		}
	
		ProperFraction mango = new ProperFraction(-7,-3);

		System.out.println(mango);
		mango.print();
		System.out.println(mango.getRemainder());
		System.out.println(mango.getWhole());
	}
	

}
