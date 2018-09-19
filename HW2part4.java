import java.util.Scanner;
public class HW2part4 {
	
	public static double[][] multiplyMatrix( double[][] a, double[][] b){
		double [][] c = new double[3][3];
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				for(int k = 0; k<3;k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double [][] a = new double[3][3];
		double[][] b = new double[3][3];
		System.out.println("Matrix 1");
for(int i = 0; i<3;i++) {
	if(i ==0)
			System.out.println("Enter digits for first row");
		if(i ==1)
			System.out.println("Enter digits for second row");
		if(i ==2)
			System.out.println("Enter digits for third row");
		for(int j = 0;j<3;j++) {
		
		a [i][j] = input.nextDouble();
	}
}
System.out.println("Matrix 2");
for(int i = 0; i<3;i++) {
	if(i ==0)
			System.out.println("Enter digits for first row");
		if(i ==1)
			System.out.println("Enter digits for second row");
		if(i ==2)
			System.out.println("Enter digits for third row");
		for(int j = 0;j<3;j++) {
		double digit = input.nextDouble();
		b [i][j] = digit;
	}
		
	}

for(int i = 0;i<3;i++) {
	for(int j =0;j<3;j++) {
		System.out.printf("%f1", multiplyMatrix( a,  b)[i][j]);
		System.out.print(" ");
	}
	System.out.println();;
}

}
}
