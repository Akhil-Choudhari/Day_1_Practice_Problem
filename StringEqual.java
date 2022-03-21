package Day1Program;

import java.util.Scanner;

public class StringEqual {

	public static void main(String[] args) {
		String str1, str2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string value");
		str1 = scanner.nextLine();
		System.out.println("Enter the second string value");
		str2 = scanner.nextLine();
		  if (str1.equals(str2))
	            System.out.print("Strings values are equal");
	        else
	            System.out.print("Strings values are not equal");
	}

}
