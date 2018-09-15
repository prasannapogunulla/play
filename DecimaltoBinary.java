import java.util.Scanner;
class DecimaltoBinary 
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        if(no > 0) {
           
            System.out.print(Integer.toBinaryString(no));
        }
    }
    static void convertToBinary(int no){
        int container[] = new int[100];
        int i=0;
                while (no > 0){
            container[i] = no%2;
            i++;
            no = no/2;
        }
        for (int j = i -1 ; j >= 0 ; j--){
            System.out.print(container[j]);
        }
    }
    static void convertToBinaryUsingString(int no){
        StringBuilder result = new StringBuilder();
        int i=0;
        
        while (no > 0){
            result.append(no%2);
            i++;
            no = no/2;
        }
        System.out.println(result.reverse());
    }
}
