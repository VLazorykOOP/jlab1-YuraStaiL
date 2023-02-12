import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

//14
public class Task2 {
    public static boolean contains(int[] values, int target) {
        return Arrays.stream(values).anyMatch(i -> i == target);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n(<=400): ");
        int n = in.nextInt();
        while(n > 400 || n < 0) {
            System.out.println("Incorrect value (" + n + ')');
            System.out.println("Enter n(<=400): ");
            n = in.nextInt();
        }

        int[] arrA = new int[n];

        System.out.println("Input array 1: ");

        for(int i=0; i < arrA.length; i++)
        {
            arrA[i] = in.nextInt();
        }

        System.out.println("Enter m(<=200): ");
        int m = in.nextInt();
        while(m > 200 || m < 0) {
            System.out.println("Incorrect value (" + m + ')');
            System.out.println("Enter m(<=200): ");
            m = in.nextInt();
        }

        int[] arrB = new int[m];

        System.out.println("Input array 2: ");

        for(int i=0; i < arrB.length; i++)
        {
            arrB[i] = in.nextInt();
        }

        
        System.out.println("A: " + Arrays.toString(arrA));

        int countNotIncludedToB = 0;
        for(int i = 0; i < arrA.length; i++)
        {
            if(!contains(arrB, arrA[i]))
            {
               countNotIncludedToB++;
            }
        }

        int[] arrNotIncluded = new int[countNotIncludedToB];

        for(int i = 0, j = 0; i < arrA.length; i++)
        {
            if(!contains(arrB, arrA[i]))
            {
               arrNotIncluded[j++] = arrA[i];
            }
        }


        System.out.println(Arrays.toString(arrNotIncluded));
        Arrays.sort(arrNotIncluded);
        System.out.println(Arrays.toString(arrNotIncluded));

        System.out.println("The smallest element among those elements of the array 1 that are not contained in the array 2 : " + arrNotIncluded[0]);
    }
}