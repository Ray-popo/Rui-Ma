import java.util.Scanner;

public class Comedy extends Movie{
	public Comedy(){
		super();
	}
	public Comedy(String a, int b, String t){
		super(a,b,t);
	}
	public double calcLateFees(int day){
		return (2.5*day);
	}
}