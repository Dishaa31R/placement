import java.util.Scanner;
import java.util.Stack;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int index = stack.pop();
                result[index] = i - index;
            }

            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of temperatures: ");
        int n = sc.nextInt();

        int[] temperatures = new int[n];

        System.out.println("Enter temperatures:");

        for (int i = 0; i < n; i++) {
            temperatures[i] = sc.nextInt();
        }

        int[] result = dailyTemperatures(temperatures);

        System.out.print("Output: ");
        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}