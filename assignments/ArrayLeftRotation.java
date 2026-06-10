import java.util.*;

public class ArrayLeftRotation {

    public static int[] rotateLeft(int d, int[] arr) {

        int n = arr.length;
        d = d % n;

        int[] result = new int[n];

        int index = 0;

        for (int i = d; i < n; i++) {
            result[index++] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            result[index++] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        System.out.print("Enter number of left rotations: ");
        int d = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = rotateLeft(d, arr);

        System.out.println("Array after left rotation:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}