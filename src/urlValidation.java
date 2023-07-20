import java.util.*;
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class urlValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in); System.out.println("Enter a Url");
		  String url =sc.next(); 
		  validation(url);
		 
		
	}
	static public void  validation(String url)
	{
		System.out.println(url);
		Pattern pattern =Pattern.compile("^(http:|https:|fts:)?(www.)?\\/\\/[.a-zA-Z0-9+&@#/%?=~_|!:,.;](?)[a-z]{2}");
		Matcher matcher =pattern.matcher(url);
		if(matcher.find())
		{
			System.out.println("Valid URL");
		}
		else
		{
			System.out.println("Invaild URL");
		}
		
	}
	
	
}
