import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for base");
        double b = sc.nextDouble();
        System.out.println("Enter the height");
        double h = sc.nextDouble();

        double area = (0.5)*b*h;
        System.out.println("Area of the triangle is "+area);

        sc.close();
    }
}
