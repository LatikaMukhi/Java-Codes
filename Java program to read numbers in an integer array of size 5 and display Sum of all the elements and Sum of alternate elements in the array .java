import java.util.*;

public class Sumofele {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        int alrsum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elemnets of array");
        int arr[] = new int[5];
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < 5; i++) {
            sum = sum + arr[i];

        }
        for (i = 0; i < 5; i++) {
            alrsum = alrsum + arr[i];
            i++;
        }
        System.out.println("Sum of elements = " + sum);
        System.out.println("Sum of alt elements = " + alrsum);
    }
