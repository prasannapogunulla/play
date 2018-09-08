import java.util.Scanner;
class AppendPeriod
{

    public static void main(String[] args)
    {
        String str1 ;
        Scanner sc=new Scanner(System.in);
        str1=sc.nextLine();
        String str2 =".";
        String str3 = str1.concat(str2);
        System.out.println(str3);
    }
}
