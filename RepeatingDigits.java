import java.util.Scanner;
class RepeatingDigits
{
public static void main(String args[]) throws IOException
{
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
PrintWriter p = new PrintWriter(System.out, true);
int freq[] = new int[10];
int i, d, c=0;
for(i=0; i<10; i++)
{
freq[i] = 0;
}

int num = Integer.parseInt(in.readLine());
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
p.println("yes");
else
p.println("no");
}
}
