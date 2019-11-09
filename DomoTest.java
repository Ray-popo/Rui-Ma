import java.util.Scanner;

public class DomoTest{
	public static void main(String []args){
		Movie movie1 = new Movie("G",123456,"hahahahahah");
		System.out.println(movie1);
		Action action1 = new Action("PG-13",45646754,"ashjdhaskjhdas");
		System.out.println("--Action Movie1--\n"+action1);
		Comedy comedy1 = new Comedy("R",312312312,"njisdbviasdbc");
		System.out.println("--Comedy Movie--\n"+comedy1);
		Drama drama1 = new Drama("A",312412,"hdjkashdias");
		System.out.println("--Drama Movie"+drama1);
		double lateFee = movie1.calcLateFees(2);
		System.out.println("Late Fees: "+lateFee);
		Action action2 = new Action("PG-13",45646754,"ashjdhaskjhdas");
		lateFee = action2.calcLateFees(4);
		System.out.println("--Action Movie2--\n"+action2
			+"\nLate fees: "+lateFee);
		if (action1.equals(action2))
			System.out.println("Two movies are same.");
		else 
			System.out.println("Two movies are differnt.");
		Comedy comedy2 = new Comedy("V",312312312,"njisdbviadad");
		if (comedy1.equals(comedy2))
			System.out.println("Two movies are same.");
		else 
			System.out.println("Two movies are differnt.");
	}


}