import java.util.Arrays;
import java.util.Scanner;

public class MeetingRooms {

    public static boolean canAttendMeetings(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of meetings: ");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];

        System.out.println("Enter start and end time for each meeting:");

        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        boolean result = canAttendMeetings(intervals);

        System.out.println(result);

        sc.close();
    }
}