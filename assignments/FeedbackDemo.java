import java.io.*;
import java.util.*;

class Feedback implements Serializable {
    private String trainerName;
    private String batchId;
    private String studentUsn;
    private double rating;
    private String comments;

    public Feedback(String trainerName, String batchId, String studentUsn,
                    double rating, String comments) {
        this.trainerName = trainerName;
        this.batchId = batchId;
        this.studentUsn = studentUsn;
        this.rating = rating;
        this.comments = comments;
    }

    public String getStudentUsn() {
        return studentUsn;
    }

    @Override
    public String toString() {
        return "Trainer Name: " + trainerName +
               "\nBatch ID: " + batchId +
               "\nStudent USN: " + studentUsn +
               "\nRating: " + rating +
               "\nComments: " + comments + "\n";
    }
}

public class FeedbackDemo {

    public static void main(String[] args) {

        List<Feedback> feedbackList = new ArrayList<>();

        feedbackList.add(new Feedback(
                "Anita",
                "B101",
                "4NM22IS001",
                4.5,
                "Good training"));

        feedbackList.add(new Feedback(
                "Rahul",
                "B102",
                "4NM22IS002",
                4.8,
                "Excellent session"));

        feedbackList.add(new Feedback(
                "Priya",
                "B103",
                "4NM22IS003",
                4.2,
                "Very informative"));

        // Store feedback objects into file
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("feedback.dat"));

            oos.writeObject(feedbackList);
            oos.close();

            System.out.println("Feedbacks stored successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Read feedback by USN
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN to search: ");
        String usn = sc.nextLine();

        try {
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("feedback.dat"));

            List<Feedback> list =
                    (List<Feedback>) ois.readObject();

            boolean found = false;

            for (Feedback f : list) {
                if (f.getStudentUsn().equals(usn)) {
                    System.out.println("\nFeedback Found:");
                    System.out.println(f);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No feedback found for USN: " + usn);
            }

            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}