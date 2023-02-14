import java.util.Scanner;

//5
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Task 1: ");
        System.out.println("Enter x(double) and y(double): ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        
        System.out.println("Result(double): " + (( (x + y) * (x + y) * (x + y) * (x - y)) / (x*x + y*y)) + x*y );

        System.out.println("Enter x(int) and y(int): ");
        int x_i = in.nextInt();
        int y_i = in.nextInt();

        System.out.println("Result(double): " + (double) (( (x_i + y_i) * (x_i + y_i) * (x_i + y_i) * (x_i - y_i)) / (x_i*x_i + y_i*y_i)) + x_i*y_i );

        System.out.println("Enter x(int) and y(int): ");
        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Result(int): " + (int) ( (( (x + y) * (x + y) * (x + y) * (x - y)) / (x*x + y*y)) + x*y) );
        in.close(); 
    }
}
