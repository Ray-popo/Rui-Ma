import java.util.Scanner;
import java.util.*;

class InclassExercise7_3{
	
	static Scanner inPut= new Scanner(System.in);

	public static void InPut(int[] A){
		System.out.println("Enter 10 elements: ");
		for(int i=0;i<=9;i++)
			A[i]= inPut.nextInt();
	}

	public static void main(String[] args){

		int [] A = new int [10];
		InPut(A);
		System.out.println("the original elements in array are:");
		System.out.println("---------------------------------------------------");
		for(int i=0;i<10;i++){
			System.out.print(A[i]+ "  | ");
		}
		System.out.println("\n---------------------------------------------------");

		System.out.print("Enter Original number: ");
		int oriG = inPut.nextInt();
		System.out.print("Enter replacement number: ");
		int repL = inPut.nextInt();
		for(int i=0; i<10;i++){
			if(A[i]==oriG){
				A[i]=repL;
			}
		}
		System.out.println("the Replacement elements in array are:");
		System.out.println("---------------------------------------------------");
		for(int i=0;i<10;i++){
			System.out.print(A[i]+ "  | ");
		}
		System.out.println("\n---------------------------------------------------");
	}
}

