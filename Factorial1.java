import java.util.Scanner;

class Factorial1
{
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
long factorial=1;
for(int i=1;i<=num;++i)
{
factorial*=i;
}
System.out.println(factorial);
}
}
