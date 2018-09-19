//Fabrice Benoit 109108791
import java.util.Scanner;
public class HW1pt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upper = 0;
Scanner input = new Scanner(System.in);
System.out.println("Enter String");
String sent = input.nextLine();
for(int i = 0; i<sent.length(); i++) {
	if (sent.charAt(i) <= 90 && sent.charAt(i) >= 65) {
		upper += 1;
	}
}
System.out.println("The number of Capital letters is " + upper );

	}

}
