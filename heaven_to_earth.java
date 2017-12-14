package stringmanipulation;
import java.util.*;
import java.math.*;
public class heaven_to_earth
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			System.out.println("Enter the floor number");
			int n=sc.nextInt();
			System.out.println("Enter Chef's velocity");
			int v1=sc.nextInt();
			System.out.println("Enter Elevator's velocity");
			int v2=sc.nextInt();
			double tc=(Math.sqrt(2)*n*1000)/v1;
			double te=(2*n*1000)/v2;
			if(tc>te)
			{
				System.out.println("Elevator");
			}
			else if(tc<te)
			{
				System.out.println("Stairs");
			}
		}
	}
}
