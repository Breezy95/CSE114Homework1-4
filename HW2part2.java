//Fabrice Benoit
//109108791
import java.util.Arrays;
import java.util.Scanner;
public class HW2part2 {
	
	public static boolean isAnagram(char[] a, char[] b) {
		int[] chars = new int[256];
		int [] chars2 = new int[256];
		if(a.length != b.length)
			return false;
		
		for(int i = 0;i<a.length;i++) {
			chars[(int)(a[i])]++;
			chars2[(int)(b[i])]++;
		}
	
	for(int i = 0; i< 256;i++) {
		if(chars[i] != chars2[i]) {
			return false;
		}
	
}
return true;	
}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter 1st string");
String sent = input.nextLine();
System.out.println("Enter 2nd string");
String sent2 = input.nextLine();
String sentence = sent;
String sentence2 = sent2;

sentence = sentence.replaceAll("\\s+", "");
sentence2 = sentence2.replaceAll("\\s+", "");
sentence = sentence.toLowerCase();
sentence2 = sentence2.toLowerCase();
char sentence1chars[] = sentence.toCharArray();
char sentence2chars[] = sentence2.toCharArray();
if(isAnagram(sentence1chars, sentence2chars))
	System.out.println(sent + " and " + sent2 + " are anagrams");
else
	System.out.println(sent + " and " + sent2 + " are NOT anagrams");
	

}
}
