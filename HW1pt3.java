//Fabrice Benoit 109108791
import java.util.Scanner;
public class HW1pt3 {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String word = input.nextLine();
		int vowel = 0;
		int cons = 0;
		for( int i = 0; i<word.length(); i++)
		{
			if ((word.charAt(i) <= 90 && word.charAt(i) >= 65) || ((word.charAt(i) >= 97 && word.charAt(i) <= 122 )))
			{
				
			
			switch(word.charAt(i)) 
				{
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vowel++;
					break;
					default:
						cons++;
		}
	}

}
		System.out.println("The number of vowels is " + vowel);
		System.out.println("The number of consonants is " + cons);
		input.close();
		
}
}