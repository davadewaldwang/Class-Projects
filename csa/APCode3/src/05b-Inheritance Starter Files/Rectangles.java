//dava dewald-wang
//rectangles assignment - rectangle with parent class polygon

public class Rectangles extends Polygons
{
    private boolean isSquare;
    public Rectangles(double w, double h)
    {
        super(w, h);
        isSquare = w == h; //set isSquare to true if w and h are same value
    }

    //isSquare accessor method
    public boolean getIsSquare()
    {
        return isSquare;
    }

    
    public double getArea()
    {
        return getWidth() * getHeight();
    }

    public void displayInfo()
    {
        System.out.println("\n\nSHAPE INFO:");
		System.out.println("The figure is a rectangle.");
		if (isSquare)
            System.out.println("Is square?: Yes!"); //print if isSquare is true
        else   
            System.out.println("Is square?: No!");
		super.displayInfo();
    }
}
