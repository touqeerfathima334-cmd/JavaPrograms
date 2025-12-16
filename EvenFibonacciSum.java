import java.util.Scanner;
public class EvenFibonacciSum{
	public static void main(String[] args){
	int n,first=0,second=1,sum=0,next;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the range:");
	n=sc.nextInt();
	System.out.println("Fibonacci sequence up to " + n + ":");
	if(first<=n){
	System.out.print(first+" ");
	}
	if(second<=n){
	System.out.print(second+" ");
	}
	while(true){
	next=first+second;
	if(next>n){
	break;
	}
	System.out.print(next+" ");
	if(next%2==0){
	sum+=next;
	}
	first=second;
	second=next;
	}
	System.out.println("\nSum of even Fibonacci number up to " + n + " = " + sum);
	}
	}