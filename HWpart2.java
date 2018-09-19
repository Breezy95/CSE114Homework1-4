//Fabrice Benoit 109108791
import java.util.Scanner;
public class HWpart2 {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.print("type in letter");
			String x = input.nextLine();
			String y = x.toUpperCase();
			char z = y.charAt(0);
		if(x.length() == 1) {
				
			if (z >= 65 && z<= 90)
			{
				switch(z) 
				{
				case 'A':
					//System.out.println(x +" is a Vowel");
					//break;
				case 'E':
					//System.out.println(x +" is a Vowel");
					//break;
				case 'I':
					//System.out.println(x +" is a Vowel");
					//break;
				case 'O':
					//System.out.println(x +" is a Vowel");
					//break;
				case 'U':
					System.out.println(x +" is a Vowel");
					break;
					default:
						System.out.println(x + " is a Consonant");
				}
				}
			else
				System.out.println(x + " is an Invalid input");
		}
		else
			System.out.println(x + " is an Invalid input");

			
		}

	}



