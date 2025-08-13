package ageena;
import java.util.Scanner;
public class Srtingarray {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of strings: ");
	        int n = scanner.nextInt();
	        scanner.nextLine();  
	        String[] strings = new String[ n];
	        System.out.println("Enter " + n + " strings:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("String " + (i + 1) + ": ");
	            strings[i] = scanner.nextLine();
	        }
	        System.out.println("The string:");
	        for (String str : strings) {
	            System.out.println(str);
	        }
	        }

}
