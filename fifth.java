import java.util.*;

class prime
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Please insert any number");
        int num=in.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=num;i++)
        {
            if(num%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(num+" is not a prime number");
        }
        else
        {
            System.out.println(num+" is a prime number");
        }
    }
}
