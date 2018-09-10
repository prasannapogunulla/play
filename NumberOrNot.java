import java.util.Scanner;
class NumberOrNot
{

    public static void main(String[] args) {

        String string;
        boolean numeric = true;
        Scanner sc=new Scanner(System.in);
        string=sc.nextLine();

        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
