import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Driving{
	public static void main(String [] args){
		final int Max_judges=7;
		double scores [] = new double[Max_judges];
		double difficultyR = 0.0;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a difficulty number(1.2-3.8): ");
		difficultyR = input.nextDouble();
		while (difficultyR>3.8||difficultyR<1.2){
			System.out.println("------You have entered a invaild number,-------- \npls enter a number within range (1.2-3.8)");
			difficultyR = input.nextDouble();
		}		

		System.out.println("------Enter the Score for 7 times(1-10): -------");
		for (int i=0; i<Max_judges;i++){
			System.out.println("Score on "+(i+1)+" times");
			scores[i] = input.nextDouble();
			while(scores[i]<0 || scores[i]>10){
				System.out.println("Sorry, invalid enter.");
				System.out.println("Please enter a valid score (0-10): ");
				scores[i] = input.nextDouble();
			}
		}
		double total =0.0;
		double min=scores[0];
		double max=scores[0];
		for(int i=0; i<Max_judges;i++){
			if(scores[i]>max)
				max=scores[i];
			if(scores[i]<min)
				min=scores[i];
			total= total+scores[i];
		}
		double totalF = (total - max - min)*difficultyR*0.6;

		System.out.println("----------Final socer is: --------\n"+totalF);
	}
}