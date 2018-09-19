//Fabrice Benoit
//109108791
import java.io.*;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();

		try {								// 1st part of question, creates file  
			File f = new File("integerFile.txt");
			FileWriter fw = new FileWriter(f, false);
			PrintWriter pw = new PrintWriter(fw);
			for(int i = 0; i<100;i++) {
			pw.print((int)(Math.random()*101) + " ");
			pw.flush();
			}
			}
		catch(IOException ex) { System.out.println("Cannot create the file");}
		catch(Exception exc) { System.out.println("Error Occurred at file reading");}
		
		try {
			File f = new File("integerFile.txt");
			Scanner input = new Scanner(f);
			while(input.hasNext()) {
			arr.add(input.nextInt());
		}
			} catch(IOException ex) {
			System.out.println("scanner error");
		}
			  catch(Exception excep){ System.out.println("Error in file reading");}
		arr.sort(null);
		//Collections.sort(arr);
		System.out.println(arr.toString().substring(1, arr.toString().length()-1));
}

	
}

