import java.util.regex.Pattern;

public class R00_IDS03_J {
    public static void main(String[] args) {
        String username = "User123";
        boolean loginSuccessful = false;

        if (loginSuccessful) {
            System.out.println("User login succeeded for: " + sanitizeUser(username));
        } else {
            System.out.println("User login failed for: " + sanitizeUser(username));
        }
    }

    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9]+", username) ? username : "unauthorized user";
    }
}
