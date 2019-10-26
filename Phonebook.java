import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Phonebook{
	String firstName;
	String lastName;
	String phoneNumber;
	String email;

	public Phonebook(){
		this.firstName = "";
		this.lastName = "";
		this.phoneNumber = "";
		this.email = "";
	}

	public Phonebook(String a, String b, String c, String d){
		this.firstName = a;
		this.lastName = b;
		this.phoneNumber = c;
		this.email = d;
	}
	public void setFirstName(String a){
		this.firstName = a;
	}
	public void setLastName(String b){
		this.lastName = b;
	}
	public void setNumber(String c){
		this.phoneNumber = c;
	}
	public void setEmail(String e){
		this.email = e;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getNumber(){
		return this.phoneNumber;
	}
	public String getEmail(){
		return this.email;
	}
	public String toString(){
		return ("Name: " + firstName + " " + lastName + "\nPhone: " + phoneNumber + "\nE-mail: " +email);
	}	
}


