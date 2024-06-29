https://www.geeksforgeeks.org/problems/print-the-pattern-set-1/1


class GfG
{
    void printPat(int n)
    {
         // Your code here
         for(int i=1;i<=n;i++)
         {
             for(int j=1;j<=n;j++)
             {
                 for(int k=1;k<=(n-i)+1;k++)
                 {
                     System.out.print((n-j)+1 +" ");
                 }
                
             }
              System.out.print('$');
         }
    }
}
