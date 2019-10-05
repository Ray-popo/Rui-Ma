import java.util.Scanner;
import java.util.*;

class InclassExercise7_2{
	
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
		int total=0;
		for (int i=0; i<10;i++){
			if (prime(A[i])){
				total +=A[i];
			}
			else 
				total = total;
		}
		System.out.println("\nthe total prime number is: "+total);

	}
	public static boolean prime(int n){
		int time =0;
		if (n==0||n==1){
			return false;
		}
		if (n==2){
			return true;
		}
		for(int i=2;i<=Math.sqrt(n);i++){
			if (n%i==0){
				time++;
			}
		}
		if (time==0){
			return true;
		}
		else 
			return false;
	}
}