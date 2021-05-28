//program to convert minutes into years and days

import java.util.*;
class convert
{
public static void main(String args[])
{
int min;
int yrs=0,day=0;
Scanner sc=new Scanner(System.in);
System.out.println("Input the number of minutes: ");
min=sc.nextInt();
yrs=min/525600;     //60*24*365
day=((min/60)/24)%365;
System.out.println(+min+ " minutes is approximately " +yrs+ " years and " +day+ " days");
}
}
