import java.util.Scanner;

public class Email extends Document{
	private String sender;
	private String recipient;
	private String title;

	public Email(){
		sender = " ";
		recipient= " ";
		title=" ";
	}
	public Email(String a, String b,String c,String d){
		super(a);
		sender=b;
		recipient=c;
		title=d;
	}
	public void setSender(String a){
		sender =a;
	}
	public void setRecipient(String r){
		recipient = r;
	}
	public void setTitle(String t){
		title = t;
	}
	public String getSender(){
		return sender;
	}
	public String getRecipient(){
		return recipient;
	}
	public String getTitle(){
		return title;
	}
	public String getText(){
		return super.toString();
	}
	public String toString(){
		return ("Sender: "+sender
			+"\nRecipient: "+recipient
			+"\nTitle: "+title
			+super.toString());
	}
}