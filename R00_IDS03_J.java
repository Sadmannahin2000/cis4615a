// Non-compliant Code: Logging unsanitized user input
/*
import java.util.logging.Logger;

public class R00_IDS03_J {
    private static final Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());

    public static void main(String[] args) {
        String username = "User123";
        boolean loginSuccessful = false;

        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);  // Logging unsanitized input
        } else {
            logger.severe("User login failed for: " + username);  // Logging unsanitized input
        }
    }
}
*/

// Compliant Code: Sanitize user input before logging
import java.util.regex.Pattern;

public class R00_IDS03_J {
    public static void main(String[] args) {
        String username = "User123";
        boolean loginSuccessful = false;

        if (loginSuccessful) {
            System.out.println("User login succeeded for: " + sanitizeUser(username)); // Logging sanitized input
        } else {
            System.out.println("User login failed for: " + sanitizeUser(username));  // Logging sanitized input
        }
    }

    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9]+", username) ? username : "unauthorized user";
    }
}
