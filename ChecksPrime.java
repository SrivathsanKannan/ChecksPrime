package ChecksPrime;
import java.util.Scanner;

class ChecksPrime {
	public static void main (String[] args) {
	int i;
  boolean ip = true;
  Scanner s = new Scanner(System.in);
  System.out.println("Please Enter any number");
	int n = s.nextInt();
	for(i = 2; i < n; i++)
	{
	 if(n%i == 0)
	 {
	  ip = false;
		break;
	 }
	}
	if(ip)
	{
	 System.out.println(n+" is a prime number");
	}
	else
	System.out.println(n+" is not a prime number");
}
}
