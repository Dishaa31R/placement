import java.util.Scanner;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println("Valid Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}