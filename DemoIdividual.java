import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DemoIdividual{
	public static void main(String []args){
		Scanner input= new Scanner(System.in);
		phoneList list = new phoneList();
		Individual call1 = new Individual();
		call1.setName("JOJO");
		call1.setPhoneNumber("12312312312321");
		list.addRecord(call1);
		Individual call2 = new Individual();
		call2.setName("HAHA");
		call2.setPhoneNumber("45645645645645");
		list.addRecord(call2);
		Individual call3=new Individual("BOBO","787978979897");
		list.addRecord(call3);
		String  choice ="";
		while(!choice.equalsIgnoreCase("n")){
			System.out.println(" Search person from Phone List?(y/n): ");
			choice=input.nextLine();
			if (choice.equalsIgnoreCase("y")){
				System.out.println("Enter a Name: ");
				String name = input.nextLine();
				Individual result= list.searchName(name);
				if (result!=null){
					System.out.println("The name: "+name+" was found. ");
					System.out.println(result);
				}
				else 
					System.out.println("The name: "+name+" wasn't in our record.");
			}
		}

	}



}