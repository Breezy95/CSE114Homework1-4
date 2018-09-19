import java.util.*;
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string");
		String a = input.nextLine();
System.out.println(reverse(a));
	}
public static String reverse(String a) {
	if (a.length() ==0)
		return a;
	return reverse(a.substring(1)) + a.charAt(0);
}
}
