import java.util.Scanner;

public class ConvertFahrenheit {
    public static void main(String[] args){

        System.out.println("Enter Fahrenheit value");
        Scanner sc = new Scanner(System.in);
        double F = sc.nextDouble();
        double C = (5.0/9.0)*(F-32);
        System.out.println("Fahrenheit to celsius for " + C);
        sc.close();

    }
    
}
