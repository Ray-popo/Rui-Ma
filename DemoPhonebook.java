import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DemoPhonebook{
	public static void main(String args[]){
		ArrayList<Phonebook> Book = new ArrayList<Phonebook>();
		while(true){
			System.out.println("-------------Phone Book menu---------------");
			System.out.println("-------------------------------------------");
			System.out.println("1: Add a new contact.");
			System.out.println("2: Display all contacts.");
			System.out.println("3: Seach contacts.");
			System.out.println("4: Delete a contact.");
			System.out.println("5: Exit menu.");
			System.out.println("-------------------------------------------");
			System.out.println("Please Enter the number(1-5): ");
			Scanner keyboard = new Scanner(System.in);
			int input = keyboard.nextInt();
			if(input==5)
				break;
			switch(input){
				case 1:		
							Phonebook B = new Phonebook();
							System.out.println("Enter the first name: ");
							B.firstName = keyboard.next();
							System.out.println("Enter the last name: ");
							B.lastName = keyboard.next();
							System.out.println("Enter the phone number: ");
							B.phoneNumber = keyboard.next();
							System.out.println("Enter the e-mail address: ");
							B.email = keyboard.next();
							Book.add(B);
							break;
				case 2:
							for(Phonebook A: Book)
							{
								System.out.println("Name: " + A.firstName + " " + A.lastName + "\nPhone: " + A.phoneNumber + "\nE-mail: " +A.email);
							}
							break;
				case 3:		
							System.out.println("Enter the contact name or phone number or email address of person you wish to search for: ");
							String str = keyboard.next();
							int found=0;
							for (Phonebook A : Book)
							{
								if (A.firstName.indexOf(str) != -1)
								{
									System.out.println(A);
									found=1;
									break;
								}
								else if(A.lastName.indexOf(str) != -1)
								{
									System.out.println(A);
									found=1;
									break;
								}
								else if(A.email.indexOf(str) != -1)
								{
									System.out.println(A);
									found=1;
									break;
								}
								else if(A.phoneNumber.indexOf(str) != -1)
								{	
									System.out.println(A);
									found=1;
									break;
								}
							}
							if(found==0)
								System.out.println("No results.");
							break;
				case 4:
							System.out.println("Enter the contact name or phone number or email address of person you wish to delete: ");
							str = keyboard.next();
							found=0;
							for ( Phonebook A : Book)
							{
								if (A.firstName.indexOf(str) != -1)
								{
									System.out.println(A);
									found=1;
								}
								else if(A.lastName.indexOf(str) != -1)
								{
									System.out.println(A);
									found=1;
								}
								else if(A.email.indexOf(str) != -1)
								{
									System.out.println(A);
									found=1;
								}
								else if(A.phoneNumber.indexOf(str) != -1)
								{
									System.out.println(A);
									found=1;
								}
								if(found==1)
								{
									System.out.println("Are you sure you want to delete? (y/n)");
									String deletion = keyboard.next();
									if(deletion.compareToIgnoreCase("y")==0)
									{
										Book.remove(A);
									}
									else
									{
										System.out.println("The contact was not removed.");
									}
									break;
								}
							}
							if(found==0)
								System.out.println("No results.");
								break;
						}
			}
		}
}