import java.util.Scanner;

public class DemoDoctor{
	public static void main(String []args){
		Doctor D1 = new Doctor("AAAAA", "Pediatrician",1000);
		Doctor D2 = new Doctor("BBBBB"," Obstetrician",500);
		D1.displayInfor();
		D2.displayInfor();
		Doctor S1 = new Doctor();
		S1.set("AAAAA","General ",400);
		S1.displayInfor();
		System.out.println("Doctor 1 and 2 are same? "+D1.Docequals(D2));
		System.out.println("Doctor 1 and 3 are same? "+D1.Docequals(S1));
	}
}