import java.util.Scanner;
import java.util.ArrayList;

public class Doctor extends Person{
	private double visitFee;
	private String specialty;

	public Doctor(){
		super();
		specialty = " ";
	}
	public Doctor(String n, String spe){
		super(n);
		specialty = spe;
	}
	public Doctor(String n, String s, int f){
		super(n);
		specialty=s;
		visitFee=f;
	}
	
	public void set(String n, String spe, int num){
		set(n);
		specialty =spe;
		visitFee =num;
	}
	public void setSpecialty(String nspe){
		specialty=nspe;
	}
	public String getSpecialty(){
		return specialty;
	}
	public void setVisitFee(double fee)
	{
		visitFee = fee;
	}
	public double getVisitFee(){
		return visitFee;
	}
	public boolean Docequals(Doctor other){
		return this.equals(other) || this.specialty==other.specialty&& this.visitFee==other.visitFee;
	}
	public void displayInfor(){
		System.out.println("Name: "+get());
		System.out.println("Specialty: "+specialty);
		System.out.println("Visit Fee: "+visitFee);

	}
}