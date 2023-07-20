import java.util.Scanner;

public class randomNumber {

	static int t=3;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Total Try"+" "+t);
		while(t>0)//Loop for continue till condition false
		{
		System.out.println("Remaing try :"+t);
		System.out.println("Enter the number between 1 to 999");
		int unum =sc.nextInt();//User number storing variable
		if(unum <=0 || unum>999)
		{
			System.out.println("Entera valid Number");
		}
		else
		{
			
			randomGenerator(unum);
				
		}
		}
		System.out.println("Remaing Try is "+t+"\n*******Game Over******");

	}
	static void randomGenerator(int num)
	{
		t--;
		double a=Math.random();//Getting A random number from 0-0.9
		long rnum=Math.round(a *999)+1;//Round a random number from 1-999
		System.out.println("The Number is"+" "+rnum);
		if(num == rnum)
		{
			System.out.println("Correct");
		}
		else if(num < rnum)
		{
			System.out.println("Too Low");
		}
		else
		{
			System.out.println("Too High");
		}
	}
}
