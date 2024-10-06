// Non-compliant Code: Ignoring return values from a method call
/*
import java.io.File;

public class R02_EXP00_J {
    public void deleteFile() {
        File someFile = new File("someFileName.txt");
        someFile.delete();  // Ignoring the return value of delete()
    }
}
*/

// Compliant Code: Check the return value of delete() and handle accordingly
import java.io.File;

public class R02_EXP00_J {
    public void deleteFile() {
        File someFile = new File("someFileName.txt");
        if (!someFile.delete()) {
            System.out.println("Failed to delete the file: " + someFile.getName());
        }
    }
}
