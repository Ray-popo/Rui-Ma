import java.util.Scanner;

public class File extends Document{
	private String pathname;

	public File(){
		pathname = " ";
	}
	public File(String d, String f){
		super(d);
		pathname = f;
	}
	public void setPathname(String a){
		pathname = a;
	}
	public String getFile(){
		return pathname;
	}
	public String getText(){
		return super.toString();
	}
	public String toString(){
		return ("Pathname: "+pathname+"\t"+super.toString());
	}
	public static boolean ContainsKeyword(Document docObject, String keyword)
	{
		if (docObject.toString().indexOf(keyword,0) >= 0)
			return true;
		return false;
	}
}	