//Fabrice Benoit
//109108791
import java.util.*;
public class Problem2 {

	// do bug testing now
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean incorrectInput = false;
		Scanner input = new Scanner(System.in);
		double a,b,c,d,e,f;
		a = b=c=d=e=f=0;
		while(!incorrectInput) {
		try {
		System.out.println("Enter radius of circle");
		a = input.nextDouble();
		System.out.println("Enter size of edge");
		b = input.nextDouble();
		System.out.println("Enter size of edge of triangle");
		c = input.nextDouble();
		System.out.println("Enter size of edge of Cube");
		d = input.nextDouble();
		System.out.println("Enter size of radius of sphere");
		e = input.nextDouble();
		System.out.println("Enter size of edge of Tetrahedron");
		f = input.nextDouble();
		if(a>=0 && b>=0 && c>=0 &&d>=0 &&e>=0 &&f>=0)
			incorrectInput=true;
		else 
			System.out.println("do not enter a negative number, try again\n");
		
		
		} catch(InputMismatchException ex) {
			
			System.out.println("Entered invalid input\n");
			input.next();
			
		}
		catch(Exception exc) {
			System.out.println("wrong input");
		}
		}
	
		Shape[] shapes = {new Circle(a), new Square(b), new Triangle(c), new Cube(d), new Sphere(e), new Tetrahedron(f)};
		for(int i = 0;i<shapes.length;i++) {
			System.out.println(shapes[i].toString());
			if(shapes[i] instanceof TwoDimensionalShape) {
				System.out.printf("The area is %.2f\n ", ((TwoDimensionalShape)shapes[i]).calcArea());
			}
			else if(shapes[i] instanceof ThreeDimensionalShape) {
				System.out.printf("The Volume is %.2f\n ", ((ThreeDimensionalShape)shapes[i]).calcVolume());
				System.out.printf("The area is %.2f\n ", ((ThreeDimensionalShape)shapes[i]).calcArea());
			}
				
		}
		
	}
}



 abstract class Shape{
	 public String toString() {
		return String.format("\n%s\n",getClass().getName()); 
	 }
	 }
 
 abstract class TwoDimensionalShape extends Shape{
	 public abstract double calcArea();
	 
 }
 //---------------CIRCLE CLASS-----------------------------
 class Circle extends TwoDimensionalShape{
	 private double radius;
	 public Circle(double s) {
	this.radius = s;
	 }
	 public Circle() {
		 this.radius = 0;
	 }
	 public void setRadius(double r) {
		 radius = r;
	 }
	 
	 public double getRadius() {
		 return radius;
	 }
	
	 public double calcArea() {
		 return Math.PI*Math.pow(radius,2);
	 }
	 public String toString() {
		 return String.format("%sRadius: %.2f",super.toString(),getRadius());
	 }
 }
 //--------------------------SQUARE CLASS--------------------------
 class Square extends TwoDimensionalShape{
	 private double side;
	 public Square() {
		 this.side = 0;
	 }
	 public Square(double side) {
		 this.side = side;
	 }
	 public void setSide(double len) {
		 side = len;
	 }
	 public double getSide() {
		 return side;
	 }
	 public double calcArea() {
		 return side*side;
	 }
	 
	 public String toString() {
		 return String.format("%sSide: %.2f",super.toString(),getSide());
	 }
 }
 //-------------------------------- Triangle class ----------------------------------
 class Triangle extends TwoDimensionalShape{
 private double side;
 public Triangle() {
	 this.side = 0;
 }
 public Triangle(double s) {
	 side = s;
 }
 public double getSide() {
	 return side;
 }
 public void setSide(double h) {
	 side = h;
 }
 
 public double calcArea() {
	 return (Math.sqrt(3)*Math.pow(side,2))/4;
 }
 public String toString() {
	 return String.format("%sSide: %.2f\n",super.toString(), getSide()); 
 }
 }
//------------------------------Three-Dimensional Shape---------------------------
 abstract class ThreeDimensionalShape extends Shape{
	 public abstract double calcVolume();
	 public abstract double calcArea();
 }
 
 //------------------------------------Cube----------------------------------------------
 class Cube extends ThreeDimensionalShape{
 double side;
	 public Cube() {
	 this.side = 0;
 }
	 public Cube(double side) {
		 this.side = side;
	 }
	 public double calcVolume() {
		 return side*side*side;
	 }
	 public void setSide(double s) {
		 side = s;
	 }
	 public double getSide() {
		 return side;
	 }
	 public double calcArea() {
		 return 6*Math.pow(side,2);
	 }
	 public String toString() {
		 return String.format("%sEdge: %.2f\n", super.toString(),side);
	 }
 }
 
 //---------------------------- Sphere----------------------------------------------------
 class Sphere extends ThreeDimensionalShape{
	 private double radius;
	 public Sphere() {
		 this.radius = 0;
	 }
	 public Sphere(double rad) {
		 this.radius = rad;
	 }
	 public double calcVolume() {
		 return ((4)*Math.PI*Math.pow(radius,3))/3;
	 }
	 public double calcArea() {
		 return 4*Math.PI* Math.pow(radius,2);
	 }
	 public String toString() {
		 return String.format("%sRadius: %.2f", super.toString(),radius);
	 }
 }
 //----------------------------------------Tetrahedron-------------------------------
 class Tetrahedron extends ThreeDimensionalShape{
	 private double edge;
	 public Tetrahedron() {
		 edge = 0;
	 }
	 public Tetrahedron(double edge) {
		 this.edge = edge;
	 }
	 
	 public double calcVolume() {
		 return Math.pow(edge,3)/(6*Math.pow(2,.5));
	 }
	 public double calcArea() {
		 return Math.sqrt(3) * Math.pow(edge,2);
	 }
	 public String toString() {
		 return String.format("%sEdge: %.2f", super.toString(),edge);
	 }
	 
 }
