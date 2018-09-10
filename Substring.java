import java.util.Scanner;
class CheckingSubstring2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        String string1 = input.next();
       
        String string2 = input.next();
        if (isSubstring(string2, string1)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }   
    public static boolean isSubstring(String string1, String string2) {
        char c;
        char d;
        boolean match = true;
        for (int i = 0; i < string1.length(); i++) {
            c = string1.charAt(i);
            for (int j = 0; i < string2.length(); i++) {
                d = string2.charAt(i);
                if (c == d) {
                    match = true;
                } else {
                    match = false;
                }   
            }
        }
        return match;
    }
}
