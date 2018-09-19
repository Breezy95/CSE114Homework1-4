import java.util.Scanner;
public class Location {
	public int row,col;
	public double maxValue;
	public Location (int row, int col, double maxValue) {
		this.row = row;
		this.col = col;
		this.maxValue = maxValue;
	}
	public static Location locateLargest(double [][] a) {
		int row = 0,col=0;
		double maxValue=0;
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				if(a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					col = j;
				}
			}
		}
		Location loc = new Location(row, col, maxValue);
		return loc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter number of rows and then number of columns");
int a = input.nextInt();
int b = input.nextInt();

double[][] matrix = new double[a][b];
for(int i = 0;i<a;i++) {
	for(int j = 0;j<b;j++) {
		System.out.println("Enter element");
		matrix[i][j] = input.nextDouble();
}
	


}
System.out.println("The location of the largest element " + Location.locateLargest(matrix).maxValue + " is at " + "(" + Location.locateLargest(matrix).row + "," + Location.locateLargest(matrix).col + ")" );
}
}
