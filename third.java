//program for matric addition

import java.util.*;
class matrix {
public static void main(String[] args) 
{
    Scanner in=new Scanner(System.in);
        int r=3, c=3, i, j;
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};
//matrix addition
        int sum[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
// Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
