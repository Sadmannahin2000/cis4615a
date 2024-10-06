// Non-compliant Code: Improper encoding of noncharacter data
/*
import java.math.BigInteger;

public class R04_STR03_J {
    public static void main(String[] args) {
        BigInteger x = new BigInteger("530500452766");
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);  // Using String constructor may result in corrupted data
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);
    }
}
*/

// Compliant Code: Proper encoding and decoding of noncharacter data
import java.math.BigInteger;

public class R04_STR03_J {
    public static void main(String[] args) {
        BigInteger x = new BigInteger("530500452766");
        String s = x.toString(); // Valid character data
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray);
        x = new BigInteger(ns);
    }
}
