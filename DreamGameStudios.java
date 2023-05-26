package coding1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DreamGameStudios {
public static void main(String[] args)
{
	// Prime numbers
	// A number is said to be a prime number if it is divisible by itself and 1, only. It is not divisible by any other number
	// find the nth prime number "n" being a user input
	// Eg: user input 7 , output : should be "17" since the series is 2, 3, 5, 7, 11, 13, 17
	Scanner n=new Scanner(System.in);
	int d=n.nextInt();
	int number=1,count=0,i;
	while(count<d)
	{
		number=number+1;
	 for(i=2;i<=number;i++)
	 {
		 if(number%i==0)
		 {
			 break;
		 }
	 }
	 if(i==number)
	 {
		count=count+1;
	 }
	}
System.out.println("prime number:"+number);
	 n.close();
}
}
