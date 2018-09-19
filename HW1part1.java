//Fabrice Benoit 109108791
import java.util.Scanner;
public class HW1part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side");
		String side1 = input.nextLine();
			System.out.println("Enter side");
			String side2 = input.nextLine();
			System.out.println("Enter side 3");
			String side3 = input.nextLine();
		String array[] = new String[3];
		array[0] = side1;
		array[1] = side2;
		array[2] = side3;
		double edge1;
		double edge2;
		double edge3;
		double dubarray[] = new double[3];
		boolean badInput = false;
		Outer: 
			for(int q = 0; q< array.length;q++) {
				for (int i = 0; i<array[q].length();i++) {
					if (array[q].charAt(i)<'9' && array[q].charAt(i)>'0') {
						continue;
					}
					else
						System.out.println("input is invalid ");
						badInput = true;
						break Outer;
				}
				dubarray[q] = Double.parseDouble(array[q]);
			}
				
			input.close();
			if(badInput == false) {
			edge1 = dubarray[0];
			edge2 = dubarray[1];
			edge3 = dubarray[2];

			if ((edge1 + edge2 > edge3) && (edge3 + edge2 > edge1) && (edge3 + edge1 > edge2))
 			{
			
						System.out.println(edge1 + edge2 + edge3);	
					}
					else
						System.out.println("input is invalid ");
				}
			}
}


	
	
	


