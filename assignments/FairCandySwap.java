import java.util.*;

public class FairCandySwap {

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;

        for (int a : aliceSizes) {
            sumA += a;
        }

        for (int b : bobSizes) {
            sumB += b;
        }

        int diff = (sumB - sumA) / 2;

        HashSet<Integer> bobSet = new HashSet<>();

        for (int b : bobSizes) {
            bobSet.add(b);
        }

        for (int a : aliceSizes) {
            int target = a + diff;

            if (bobSet.contains(target)) {
                return new int[] {a, target};
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Alice's candies: ");
        int n = sc.nextInt();

        int[] alice = new int[n];

        System.out.println("Enter Alice's candy sizes:");
        for (int i = 0; i < n; i++) {
            alice[i] = sc.nextInt();
        }

        System.out.print("Enter number of Bob's candies: ");
        int m = sc.nextInt();

        int[] bob = new int[m];

        System.out.println("Enter Bob's candy sizes:");
        for (int i = 0; i < m; i++) {
            bob[i] = sc.nextInt();
        }

        int[] result = fairCandySwap(alice, bob);

        System.out.println("Candy to swap:");
        System.out.println("Alice gives: " + result[0]);
        System.out.println("Bob gives: " + result[1]);

        sc.close();
    }
}