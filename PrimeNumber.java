import java.util.Scanner;
class PrimeNumber
{
	public static void main(String args[])
	{
		int i,num;
		Boolean isPrime=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		num=sc.nextInt();
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}	
		}
		if(isPrime==true)
		{
			System.out.println("The  given number " + num +	" is a prime"); 
		}
		else
		{
			System.out.println("The given number" + num + " is not a prime");
		}
	}
}