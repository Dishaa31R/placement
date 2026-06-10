import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidIPException extends Exception {
    public InvalidIPException(String message) {
        super(message);
    }
}

class IPValidator {

    public static void log(String message) {
        System.out.println("[LOG] " + message);
    }

    public static void validateIPv4(String ip) throws InvalidIPException {

        String regex =
                "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}" +
                "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";

        log("Validating IP Address: " + ip);

        if (!Pattern.matches(regex, ip)) {
            throw new InvalidIPException("Invalid IPv4 Address");
        }

        log("IPv4 Address is valid");
    }
}

public class IPv4Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IPv4 Address: ");
        String ip = sc.nextLine();

        try {
            IPValidator.validateIPv4(ip);
            System.out.println("Valid IPv4 Address");
        } catch (InvalidIPException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}