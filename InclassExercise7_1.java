import java.util.Scanner;
import java.util.*;

class InclassExercise7_1{
	
	static Scanner inPut= new Scanner(System.in);


	public static void InPut(int[] A){
		System.out.println("Enter 10 elements: ");
		for(int i=0;i<=9;i++)
			A[i]= inPut.nextInt();
	}

	public static void main(String[] args){

		int [] A = new int [10];
		InPut(A);
		System.out.println("the elements in array are:\n");
		for(int i=0;i<10;i++){
			System.out.print(A[i]+ "  ");
		}
		System.out.println("\nThe largest element=" + maxNum(A));
		System.out.println("The smallest element=" + minNum(A));
	}

	public static int maxNum(int []A){
		int max = A[0];
		for(int i=0; i<9; i++)
			if(A[i]>max)
				max = A[i];
			else 
				max = max;
		return max;
	}
	public static int minNum(int []A){
		int min = A[0];
		for(int i=0; i<9; i++)
		{
			if(A[i]<min){
				min = A[i];
			}
			else 
				min = min;
		}
		return min;

	}
	
}