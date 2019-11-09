import java.util.Scanner;

public class Movie{
	private String rating;
	private int numID;
	private String title;
	
	public Movie(){
		rating = " ";
		numID = 0;
		title = " ";
	}
	public Movie(String a, int b, String c){
		this.rating = a;
		this.numID = b;
		this.title =c;
	}
	public void setRating(String r){
		this.rating = r;
	}
	public String getRating(){
		return rating;
	}
	public void setnumID(int i){
		this.numID = i;
	}
	public int getnumID(){
		return numID;
	}
	public void setTitle(String t){
		this.title = t;
	}
	public String getTitle(){
		return title;
	}
	public int calcLateFees(int d){
	
		if(d==0){
			return 0;
		}
		else
			return (2*d);
	}
	public boolean equals(Movie other){
		if (this.rating.equalsIgnoreCase(other.rating)
			&&this.numID == other.numID
			&&this.title.equalsIgnoreCase(other.title)){
			return true;
		}
		else 
			return false;
		
	}
	public String toString(){
		return ("Rating: "+rating
			+"\nID Number: "+numID
			+"\nMovie title: "+title);
	}
}