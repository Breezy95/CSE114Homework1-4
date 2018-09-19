import java.util.Scanner;
public class HW2part3 {
	
	
	public static String sortCities(String[] city) {
		String cityString = "";
		for(int i = 0;i<city.length;i++) {
			for(int j =0; j<city[i].toLowerCase().length()-1;j++) {
				if ((city[i].charAt(j)) >= 33 && (city[i].charAt(j) <= 47) || (city[i].charAt(j)) >= 58 && (city[i].charAt(j)) <= 64
						|| (city[i].charAt(j)) >= 91  && (city[i].charAt(j)<= 96) || (city[i].charAt(j) >='0') && (city[i].charAt(j) <= 9))
											return "Invalid String Entered";
										}
			}
		
		String temp;
		for(int i = 0; i<100;i++) {
			for(int j = 0;i<100;i++) {
				for(int k=0;k<9;k++ ) {
				if(city[k].toLowerCase().compareTo(city[k+1].toLowerCase())>0) {
					temp = city[k+1];
					city[k+1] = city[k];
					city[k] = temp;
				}
				}
				
			}
					
				}
			for(int i=0;i<city.length;i++)
				cityString += city[i] + ", ";
			return cityString;

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
String city[] = new String[10];
System.out.println("enter cities (no punctuation besides periods for abbreviations)");
for(int i = 0; i<10; i++) {
	String enter = input.nextLine();
	city[i] = enter;
}
	System.out.println(sortCities(city));
}


}

