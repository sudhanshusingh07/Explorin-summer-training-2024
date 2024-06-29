https://www.geeksforgeeks.org/problems/double-triangle-pattern-1662664259/1


class Solution {

    void printTriangle(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j +" ");
            
            
            for(int j=1;j<=2*n-2*i;j++)
               System.out.print("  "); 
            
            
            for(int j=i;j>0;j--)
                System.out.print(j +" ");
            
            
            System.out.println();
        }
    }
}
