import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        int o = 0;
        int e = 0;
        int j;

        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter elements of array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                e++;
            } else {
                o++;
            }

        }
        System.out.println("number of even are " + e);
        System.out.println("number of odd are " + o);
        int even[] = new int[n];
        j = 0;
        for (int i = 0; i < n; i++) {

            if (e == 0) {
                break;
            }

            if (arr[i] % 2 == 0) {

                even[j] = arr[i];
                j++;
            }

        }
        int odd[] = new int[o];
        j = 0;

        for (int i = 0; i < n; i++) {

            if (o == 0) {
                break;
            }

            if (arr[i] % 2 != 0) {

                odd[j] = arr[i];
                j++;
            }
        }
        System.out.print("For even= ");
        for (j = 0; j < e; j++) {
            System.out.print((even[j]));
        }
        System.out.println();
        System.out.print("For odd = ");
        for (j = 0; j < o; j++) {
            System.out.print(odd[j]);
        }

    }

}
