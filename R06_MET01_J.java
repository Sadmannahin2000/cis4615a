// Non-compliant Code: Using assertions to validate method arguments
/*
public class R06_MET01_J {
    public static int getAbsAdd(int x, int y) {
        assert x != Integer.MIN_VALUE;
        assert y != Integer.MIN_VALUE;
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        assert absX <= Integer.MAX_VALUE - absY;
        return absX + absY;
    }
}
*/

// Compliant Code: Throw IllegalArgumentException to validate method arguments
public class R06_MET01_J {
    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Arguments out of range");
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > Integer.MAX_VALUE - absY) {
            throw new IllegalArgumentException("Integer overflow");
        }
        return absX + absY;
    }
}
