//program for fibonacci series

import java.util.*;

class series
{
    public static void main(String args[])
    {
        int i,a=0,b=1,c;
        System.out.print(a+" "+b);
        for(i=1;i<=10;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
