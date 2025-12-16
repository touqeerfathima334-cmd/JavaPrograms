import java.util.Scanner;
public class ArmstrongNumber{
	public static void main(String[] args){
	int num,sum=0,digits=0,temp;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number:");
	num=sc.nextInt();
	temp=num;
	while(temp>0){
	digits++;
	temp/=10;
	}
	temp=num;
	while(temp>0){
	int remainder=temp%10;
		sum+=Math.pow(remainder,digits);
	temp/=10;
	}
	if(sum==num){
	System.out.println(num + "is an Armstrong Number.");
	}
	else{
	System.out.println(num + "is not an Armstrong Number.");
	}
	}
	}