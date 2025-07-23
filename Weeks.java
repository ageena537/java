package ageena;
import java.util.Scanner;
public class Weeks {
	
public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number (1 to 7): ");
	        int day = scanner.nextInt();

	        switch(day) {
	            case 1:
	                System.out.println("Day is Monday");
	                break;
	            case 2:
	                System.out.println("Day is Tuesday");
	                break;
	            case 3:
	                System.out.println("Day is Wednesday");
	                break;
	            case 4:
	                System.out.println("Day is Thursday");
	                break;
	            case 5:
	                System.out.println("Day is Friday");
	                break;
	            case 6:
	                System.out.println("Day is Saturday");
	                break;
	            case 7:
	                System.out.println("Day is Sunday");
	                break;
	            default:
	                System.out.println("Invalid input! Please enter a number between 1 and 7.");
	                break;
	        }

	        scanner.close();
	}}

