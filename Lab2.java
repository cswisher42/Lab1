/*
	Chuck Swisher - Extra Credit Included
	Lab 2
	Program reads in value of test scores for different sections and returns the high score, low score, and average.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab2
{
	public static void main(String [] args)
	{
		double [] testScores = new double [50];
		
		Scanner s = new Scanner(System.in);
		
		double highScore = 0.0, lowScore = 100.0, overalHS = 0.0, overalLS = 100.0, average = 0.00, collector = 0.0, counter = 0.0;
		char sectionLetter, runAgain;
		
		DecimalFormat df = new DecimalFormat(".00");
		
		/*for(int i = 0; i < testScores.length; i++)
		{
			System.out.print("Enter in score " + (i+1) + ": ");
			testScores[i] = s.nextDouble();
			
			while(testScores[i] < 0 || testScores[i] > 100)
			{
				System.out.print("Your score is out-of-bounds! Enter a new score: ");
				testScores[i] = s.nextDouble();
			}
			
			if(highScore < testScores[i])
			{
				highScore = testScores[i];
			}
			
			if(lowScore > testScores[i])
			{
				lowScore = testScores[i];
			}
			
			collector += testScores[i];
		} //end for*/
		
		do
		{
			highScore = 0.0; 
			lowScore = 100.0;
			average = 0.0;
			collector = 0.0;
			counter = 0;
			
			System.out.print("Enter the section letter: ");
			sectionLetter = s.nextLine().toUpperCase().charAt(0);
			
			System.out.println("Enter up to 50 grades (enter 999 to end):");
			double temp = 0;
			int index = 0;
			
			do
			{
				temp = Double.parseDouble(s.nextLine());
				
				if(temp != 999)
				{
					testScores[index] = temp;
					
					while(testScores[index] < 0 || testScores[index] > 100)
					{
						System.out.print("Your score is out-of-bounds! Enter a new score: ");
						testScores[index] = Double.parseDouble(s.nextLine());
					}
			
					if(highScore < testScores[index])
					{
						highScore = testScores[index];
					}
			
					if(lowScore > testScores[index])
					{
						lowScore = testScores[index];
					}
			
					collector += testScores[index];
					
					index++;
					counter++;
				}
			
			} while(index < testScores.length && temp != 999); //end do read in values
		
				System.out.println("The high score for section " + sectionLetter + " is: " + highScore);
				System.out.println("The low score for section " + sectionLetter + " is: " + lowScore);
		
				average = collector/counter;
		
				System.out.print("The average for section " + sectionLetter + " is: " + df.format(average));
				
				if(overalHS < highScore)
				{
					overalHS = highScore;
				}
				
				if(overalLS > lowScore)
				{
					overalLS = lowScore;
				}
				
				System.out.print("\nDo you want to enter in another section? (y/n): ");
				runAgain = s.nextLine().toLowerCase().charAt(0);
				
		}while(runAgain == 'y'); //end do whole section
		
		System.out.println("The highest overal score is: " + overalHS);
		System.out.println("The lowest overal score is: " + overalLS);
		
		
		System.out.println("This is a test of the merging features.");
	} //end main
} //end class
