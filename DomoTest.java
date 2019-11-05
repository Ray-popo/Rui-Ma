import java.util.Scanner;

public class DomoTest{
	public static void main(String []args){
		Document test1 = new Document("My TA is the best.");
		Document test2 = new Document("She is very smart.");

		String test3 ="Java class is the best.";
		String test4 ="My professor is the best.";

		Document email1 = new Email(test3,"haha","lala","Mr");
		Document email2 = new Email(test4,"jojo","yoyo","Miss");

		Document file1 = new File(test3, "family.txt");
		Document file2 = new File(test4, "school.txt");

		System.out.println("--Testing Start--");

		System.out.println("Text Information: ");
		System.out.println(test1.toString());
		System.out.println(test2.toString());

		System.out.println("Email Information: ");
		System.out.println(email1.toString());
		System.out.println(email2.toString());

		System.out.println("File Information: ");
		System.out.println(file1.toString());
		System.out.println(file2.toString());
		

		String testWord = "best";
		if(File.ContainsKeyword(email1, testWord))
			System.out.println("word is in E-mail1");
		else 	
			System.out.println("word is not in E-mail");

		if(File.ContainsKeyword(email2, testWord))
			System.out.println("word is in E-mail1");
		else 	
			System.out.println("word is not in E-mail");

		if(File.ContainsKeyword(test1, testWord))
			System.out.println("word is in E-mail1");
		else 	
			System.out.println("word is not in E-mail");

		if(File.ContainsKeyword(test2, testWord))
			System.out.println("word is in E-mail1");
		else 	
			System.out.println("word is not in E-mail");

		System.out.println("--Testing Finished--");
		}
}