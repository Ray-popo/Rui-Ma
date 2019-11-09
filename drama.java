import java.util.Scanner;

public class Drama extends Movie{
	public Drama(){
		super();
	}
	public Drama(String a, int b, String t){
		super(a,b,t);
	}
	public double calcLateFees(int day){
		return (2.0*day);
	}
}