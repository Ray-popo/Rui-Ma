import java.util.Scanner;

public class Document{
	private String text;

	public Document(){
		text = " ";
	}
	public Document(String n){
		setText(n);
	}
	public void setText(String a){
		text =a;
	}
	public String toString(){
		return text;
	}
}