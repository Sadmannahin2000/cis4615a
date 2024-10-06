import java.io.File;

public class R02_EXP00_J {
    public void deleteFile() {
        File someFile = new File("someFileName.txt");
        if (!someFile.delete()) {
            System.out.println("Failed to delete the file: " + someFile.getName());
        }
    }
}
