//Fabrice Benoit
//109108791

import java.util.Scanner;
public class Hw2q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter input string");
		String sent = input.nextLine();
		String sentence = sent;
		sentence = sentence.replaceAll("\\s+", "");
		sentence = sentence.toLowerCase();
		String reverse = "";
		for(int i = sentence.length()-1;i>=0;i--)
			reverse += sentence.charAt(i);
		System.out.println(reverse + '\n' + sentence);
		if (sentence.equals(reverse))
			System.out.println(sent + " is a palindrome");
		else
			System.out.println(sent + " is not a palindrome");
}
}