import java.util.Scanner;

public class Action extends Movie{
	public Action(){
		super();
	}
	public Action(String a, int b, String t){
		super(a,b,t);
	}
	public double calcLateFees(int day){
		return (3.0*day);
	}

}