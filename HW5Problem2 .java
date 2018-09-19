import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
int[] arr = new int[8];
int i = 0;
System.out.println("Enter number for array");
while(i<8) {
	arr[i++] = input.nextInt();
	
}
System.out.println(maxList(arr,0,0));
	}
public static int maxList(int[] arr, int i, int large) {
	if(i == arr.length)
		return large;
	if(large<arr[i])
		large = arr[i];
	return maxList(arr, i+1,large);
}
}
