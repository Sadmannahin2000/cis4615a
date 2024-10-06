// Non-compliant Code: Using new String(byteArray) without specifying encoding
/*
public class R02_STR02_J {
    public static void main(String[] args) {
        byte[] byteArray = { 104, 101, 108, 108, 111 };
        String s = new String(byteArray);  // May cause issues with encoding
        System.out.println(s);
    }
}
*/

// Compliant Code: Specify charset encoding when converting byte array to String
import java.nio.charset.StandardCharsets;

public class R02_STR02_J {
    public static void main(String[] args) {
        byte[] byteArray = { 104, 101, 108, 108, 111 };
        String s = new String(byteArray, StandardCharsets.UTF_8);  // Specify encoding explicitly
        System.out.println(s);
    }
}
