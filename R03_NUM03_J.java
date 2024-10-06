// Non-compliant Code: Using signed integer to read an unsigned value
/*
import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J {
    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt();  // Does not handle the full range of unsigned data
    }
}
*/

// Compliant Code: Use long type to handle the full range of unsigned values
import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J {
    public static long getInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bit to handle unsigned values
    }
}
