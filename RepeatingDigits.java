import java.util.Scanner;
class RepeatingDigits
{
public static void main(String args[])
{
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
int freq[] = new int[10];
int i, d, c=0;
for(i=0; i<10; i++)
{
freq[i] = 0;
}

int num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(num>0)
{
d = num%10;
freq[d]++;
num = num/10;
}
for(i=0; i<10; i++)
{
if(freq[i]>1)
{
c++;
break;
}
}
if(c==1)
System.out.println("yes");
else
System.out.println("no");
}
}
