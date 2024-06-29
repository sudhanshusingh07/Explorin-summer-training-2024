https://www.hackerearth.com/problem/golf/print-the-pattern/?purpose=login&source=pro
blem-page&update=google


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
            if(i%2==0)
            {
                System.out.print(k++ +" ");
            }
            else{
             k++;}
            }
            int p=k-1;
            if(i%2!=0){
                for(int j=1;j<=i;j++)
                {
                    System.out.print(p-- +" ");
                }
            }
            System.out.println();
        }
    }
}
