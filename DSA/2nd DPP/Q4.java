https://www.hackerearth.com/problem/algorithm/pattern/



import java.util.*;

 
class TestClass {
    public static void main(String args[] ) throws Exception {
      
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
 for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++){
            if(i==1||i==n)
            {
             System.out.print('*');
            }
            else if(j==((n-i)+1)){
                System.out.print('*');
                }
            
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
 
       
    }
}
