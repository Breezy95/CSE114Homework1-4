import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double a,b,c,d,e,f;
		System.out.println("Enter radius for circle one");
		a = input.nextDouble();
		System.out.println("Enter radius for circle two");
		b = input.nextDouble();
		System.out.println("Enter length for rectangle 1");
		c = input.nextDouble();
		System.out.println("Enter width for rectangle 1");
		d = input.nextDouble();
		System.out.println("Enter length for rectangle 2");
		e = input.nextDouble();
		System.out.println("Enter width for rectangle 2");
		f = input.nextDouble();
			GeometricObject one = new Circle(a);
			GeometricObject two = new Circle(b);
			GeometricObject three = new Rectangle(c,d);
			GeometricObject four = new Rectangle(e,f);
			System.out.println("The largest shape was " + GeometricObject.max(one,two) + "\n The area is " + GeometricObject.max(one,two).getArea() );
			System.out.println("The largest shape was " + GeometricObject.max(three,four) + "\n The area is " + GeometricObject.max(three,four).getArea());
			

}
}
abstract class GeometricObject implements Comparable<GeometricObject>{
	  private String color = "white";
	  private boolean filled;
	  private java.util.Date dateCreated;
	  protected GeometricObject() {
	    dateCreated = new java.util.Date();
	  }
	  protected GeometricObject(String color, boolean filled) {
	    dateCreated = new java.util.Date();
	    this.color = color;
	    this.filled = filled;
	  }
	  public String getColor() {   return color;  }
	  public void setColor(String color) {  this.color = color;  }
	  public boolean isFilled() {   return filled;  }
	  public void setFilled(boolean filled) {  this.filled = filled;  }
	  public java.util.Date getDateCreated() {   return dateCreated;  }
	  public String toString() {
	    return "created on " + dateCreated + "\ncolor: " + color +
	      " and filled: " + filled;
	  }
	  /** Abstract method getArea */
	  public abstract double getArea();
	  /** Abstract method getPerimeter */
	  public abstract double getPerimeter();
	  public int compareTo(GeometricObject a) {
		  if (getArea() > a.getArea())
			  return 1;
		  else if (getArea() == a.getArea())
			  return 0;
		  else
			  return -1;
	  }
	  public static GeometricObject max(GeometricObject one, GeometricObject two) {
		  if(one.compareTo(two) == 1)
			  return one;
		  else return two;
	  }
	  //public
	}
class Circle extends GeometricObject {
	  private double radius;
	  public Circle() {   }
	  public Circle(double radius) {
	    this.radius = radius;  
	  }
	  public double getRadius() {
	    return radius;
	  }
	  public void setRadius(double radius) {
	    this.radius = radius;  
	  }
	  public double getArea() {
	    return radius * radius * Math.PI;
	  }
	  public double getDiameter() {
	    return 2 * radius;
	  }
	  public double getPerimeter() {
	    return 2 * radius * Math.PI;
	  }
	  /* Print the circle info */
	  public void printCircle() {
	    System.out.println("The circle is created " + getDateCreated() +
	      " and the radius is " + radius);
	  }
	}
class Rectangle extends GeometricObject {
	  private double width;
	  private double height;
	  public Rectangle() {  }
	  public Rectangle(double width, double height) {
	    this.width = width;
	    this.height = height;
	  }
	  public double getWidth() {    return width;  }
	  public void setWidth(double width) {     this.width = width;  }
	  public double getHeight() {    return height;  }
	  public void setHeight(double height) {    this.height = height;  }
	  
	  public double getArea() {
	    return width * height;
	  }

	  public double getPerimeter() {
	    return 2 * (width + height);
	  }
	}
