package assignment.acadgild23;

import java.util.Scanner;

public class Patternabc {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of rows. ");
		n = scr.nextInt();

		char c;

		// For Upper Triangle
		for (int i = 1; i <= n; ++i) // FOR LOOP FOR NUMBER OF ROWS
		{
			c = 'A';
			for (int j = i; j < n; ++j) // FOR LOOP FOR PRINTING SPACES
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; ++k) // FOR LOOP FOR PRINTING ALPHABETS IN
											// DESCENDING ORDER
			{
				System.out.print(c);
				++c;
			}
			c -= 2;
			for (int l = 1; l < i; ++l) // FOR LOOP FOR PRINTING ALPHABETS IN
										// ASCENDING ORDER
			{
				System.out.print(c);
				--c;
			}
			System.out.println(); // INTRODUCING NEW LINE

		}

		// For lower triangle
		for (int i = n - 1; i >= 1; --i) // FOR LOOP FOR NUMBER OF ROWS
		{
			c = 'A';
			for (int j = n; j > i; --j) // FOR LOOP FOR PRINTING SPACES
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; ++k) {
				System.out.print(c);
				++c;
			}
			c -= 2;
			for (int l = 1; l < i; ++l) {
				System.out.print(c);
				--c;
			}
			System.out.println(); // INTRODUCING NEW LINE

		}

	}
}
