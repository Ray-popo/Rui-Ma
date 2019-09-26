import java.util.Scanner;

public class BlogEntry
{
	private String userName;
	private String textEntry;
	private Date dateEntry = new Date();

	public BlogEntry(String userName, String textEntry, String month, int day, int year)
	{
		this.userName = userName;
		this.textEntry = textEntry;
		dateEntry.set_date(month,day, year);
	}
	public String displayEntry()
	{
		System.out.print(userName);
		System.out.print(textEntry);
		System.out.print(dateEntry);
		return textEntry;
	}
	public String getSummary()
	{
		String display = "";
		for (int i=0;i<=9&&i< textEntry.length();i++){
			display += textEntry.charAt(i);
		}
		System.out.println(display);
		return display;
	}

	public String toString()
	{
		return ("User Name = " + userName +"Text = "+ textEntry + "Date = " + dateEntry);
	}

	public static void main(String []args){

		BlogEntry test = new BlogEntry("popo", "hava a good day!", "02",02,2001);
		
		String a = test.toString();
		System.out.println(a);

	}	
}