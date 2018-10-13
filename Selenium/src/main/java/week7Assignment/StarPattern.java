package week7Assignment;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		int temp1 = num;
		if ((num%2) != 0)
		{
			for (int i = 1 ; i <= (num / 2)+1; i++) 
			{
				int spacesCount = temp1/2;

				for(int s = 0 ; s < spacesCount; s++)
					System.out.print(" ");
				for(int x = 1; x <= ((2*i) -1); x++)
					System.out.print(x );
				temp1 = temp1 - 2;
				System.out.println();
			}
			temp1 = (num/2);
			for (int i = 1; i <= (num/2); i++)	
			{		
				int spacesCount = temp1/2;

				for(int s = 0 ; s < spacesCount; s++)
					System.out.print(" ");
				for(int x = 1; x <= (2*((num/2)-i)+1 ); x++)
					System.out.print(x );

				temp1 = temp1 + 2 ;
				System.out.println();
			}
		}
		else
			System.out.println("Cannot print the star pattern for an even number. Please retry with an odd number.");
		scan.close();
	}

}
