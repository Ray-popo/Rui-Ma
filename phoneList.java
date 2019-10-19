import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class phoneList{

	private List<Individual> L= new ArrayList<Individual>();

	public phoneList(){
		L= new ArrayList<Individual>();
	}
	public int addRecord(Individual people){
		Individual n = searchName(people.getName());
		if (n==null){
			L.add(people);

			return 1;
		}
		return -1;
	}
	public Individual searchName(String s){
		for(Individual i:L){
			if (i.getName().equalsIgnoreCase(s)){
				return i;
			}
		}
		return null;
	}
	public void Display()
    {     
        
        System.out.println("The List has " + L.size() + " records");
        for(Individual x:L)
            System.out.println(x);
        System.out.println(L);
    }
}

	/*private Scanner input = new Scanner(System.in);
	private ArrayList <Individual> L=new ArrayList<Individual>();

	public void phoneList(){
		int repeat;
		do
		{
			Individual temp = new Individual();
			String n;
			int num;
			System.out.println("Enter a name to Phone Book: ");
			n = input.next();
			System.out.println("Enter the number: ");
			num = input.nextInt();
			temp.set(n,num);
			L.add(temp);
			System.out.printlnb("Do you want ro enter more record(y/n)");
			repeat = input.next();
		}while(repeat.euqals("y"));

	}
	public void addRecord(int a){
		String n;
		int num;
		Individual temp =new Individual();
		System.out.println("Enter a name to Phone Book: ");
		n = input.next();
		System.out.println("Enter the number: ");
		num = input.next();
		temp.set(n,num);
		L.add(a,temp);
		System.out.println(L.contains(temp));
	}
	public void deleteRecord(int n ){
		Individual temp = L.remove(n);
		System.out.println("The deleted record is: ");
		System.put.printlnb(temp);
	}
	public Individual search(String name){
		for(Individual i:phoneInfor)
			if(i.getName().equalsIgnoreCase(name))
				return i;
		return null;


	}*/
