package Day1Program;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		
		int x, y, sum;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the first number: ");  
		x = sc.nextInt();  
		System.out.print("Enter the second number: ");  
		y = sc.nextInt();  
		sum = sum(x, y);  
		System.out.println("The sum of two numbers is: " + sum);  
		}  
		//method that calculates the sum  
		public static int sum(int a, int b)  
		{  
		int sum = a + b;  
		return sum;  
}
	}

