https://www.codechef.com/problems/STAR


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=((i*2)-1);j++){
				System.out.print('*');
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(i-1);j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(((n*2)-(i*2)+1));j++){
				System.out.print('*');
			}
			System.out.println();
		}

	}
}
