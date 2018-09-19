import java.util.Scanner;
public class Rational {
private int num,den;
public Rational() {
}
public Rational(int a, int b) {
	if (b==0)
		throw new ArithmeticException("Divide by zero");
	this.num = a;
	this.den = b;
}

public int getNumerator() {
	return num;
}
public int getDenominator() {
	return den;
}

public void redFraction(int num, int den) {
	
}



public String Add(Rational a, Rational b) {
	Rational c = new Rational();
	 if(a.den == b.den) {
		c.num = a.num + b.num;
		c.den = a.den;
		if(c.num == c.den)
			return "Addition of the rational numbers is: " + 1;
		else
			return "Addition of the rational numbers is: " + c.num +"/"+c.den;
	}
		else {
			int n = 1;
			while(!(n/a.den == b.den)) {
				n++;
			}
			c.den = n;
			c.num = (a.num * (n/b.num));
		}
	return c.toString();
			
	}
public String Divide(Rational a, Rational b) {
	Rational c = new Rational();
			c.num = a.num / b.num;
			c.den = a.den / b.den;
			return c.toString(c);
}
public String Subtract(Rational a, Rational b) {
	Rational c = new Rational();
	 if(a.den == b.den) {
		c.num = a.num - b.num;
		c.den = a.den;
		if(c.num == c.den)
			return "Subtraction of the rational numbers is: " + 1;
		else
			return "Subtraction of the rational numbers is: " + c.num +"/"+c.den;
	}
		else {
			int n = 1;
			while(!(n/a.den == b.den)) {
				n++;
			}
			c.den = n;
			c.num = (a.num * (n/b.num));
		}
	return c.toString(c);
	
}

public String Multiply(Rational a, Rational b) {
	Rational c = new Rational();
	c.num = a.num * b.num;
	c.den = a.den * b.den;
	return c.toString(c);
}
public String toString(Rational num) {
	return "" + num.num+"/"+num.den;
}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter numerator for the first rational number:");
int num1 = input.nextInt();
System.out.println("Enter a non-zero denominator for the first rational number");
int den1 = input.nextInt();
System.out.println("Enter numerator for the second rational number: ");
int num2 = input.nextInt();
System.out.println("Enter a non-zero denominator for the second rational number");
int den2 = input.nextInt();
Rational test = new Rational();
Rational one = new Rational(num1,den1);
Rational two = new Rational(num2,den2);
System.out.println("First rational number is " + one.toString(one));
System.out.println("Second rational number is " + two.toString(two));
System.out.println(test.Add(one, two));
System.out.println(test.Subtract(one,two));
System.out.println(test.Multiply(one, two));
System.out.println(test.Divide(one, two));
	}

}