import java.util.Scanner;

public class AcceptNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value A");
        int a = sc.nextInt();
        System.out.println("Enter value B");
        int b = sc.nextInt();
        int product = a *b;
        int sum = a + b;
        System.out.println("Sum  " + sum + " product "+ product);
        sc.close();
    }
    
}
