import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


//16
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size n(<=20): ");
        int size = in.nextInt();
        while(size > 20 || size <= 0) {
            System.out.println("Incorrect value (" + size + ')');
            System.out.println("Enter n(<=20): ");
            size = in.nextInt();
        }

        double[][] arrA = new double[size][size];

        System.out.println("Input matrix: ");

        for(int i=0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                arrA[i][j] = in.nextDouble();
            }
        }

        System.out.println("matrix: ");

        for(int i = 0; i < size; i++)
        {
            System.out.println(Arrays.toString(arrA[i]));
        }
        
        double[] vector = new double[size];

        for(int i=0; i < size; i++)
        {
            Arrays.sort(arrA[i]);
            vector[i] = (Math.abs(arrA[i][0]) + Math.abs(arrA[i][arrA.length-1])) / 2;
        }
        
        System.out.println("vector: " + Arrays.toString(vector));
    }
}