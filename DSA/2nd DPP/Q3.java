https://www.naukri.com/code360/problems/star-pattern_893204


import java.util.* ;
import java.io.*; 
public class Solution {
	public static void printPattern(int n){
		
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
	}
}
