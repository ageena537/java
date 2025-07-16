package ageena;

import java.util.Scanner;

public class multiply {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		System.out.println("Enter another number:");
		int number2=sc.nextInt();
		System.out.println("Enter an operation:");
		char operator = sc.next().charAt(0);
		{if(operator=='*')
		System.out.println("The product is:"+(number*number2));
		else if(operator=='/')
		System.out.println("The quotient is:"+(number/number2));
		else if(operator=='+')
		System.out.println("The sum is:"+(number+number2));
		else if(operator=='-')
		System.out.println("The difference is:"+(number-number2));
		else if(operator=='%')
		System.out.println("The remainder is:"+(number%number2));
		}
	}

}
