// Non-compliant Code: Catching NullPointerException directly
/*
public class R03_ERR08_J {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());  // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
    }
}
*/

// Compliant Code: Avoid catching NullPointerException by checking for null
public class R03_ERR08_J {
    public static void main(String[] args) {
        String str = null;

        if (str != null) {
            System.out.println(str.length());
        } else {
            System.out.println("String is null. Cannot proceed.");
        }
    }
}
