import java.util.Scanner;

public class AverageCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for A");
        int a = sc.nextInt();
        System.out.println("Enter value for B");
        int b = sc.nextInt();
        double average = a / b;
        System.out.println(average);
        sc.close();
    }
}
