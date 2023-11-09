import java.io.File;

public class ChangeDirectoryCommand {
    public static void changeDirectory(String directoryName) {
        try {
            String fullPath = FileManager.getCurrentDirectory() + File.separator + directoryName;
            File directory = new File(fullPath);

            if (directory.isDirectory()) {
                FileManager.setCurrentDirectory(fullPath);
                System.out.println("Changed working directory to: " + fullPath);
            } else {
                System.out.println("The provided path is not a directory.");
            }
        } catch (SecurityException e) {
            System.out.println("Permission denied: " + e.getMessage());
        }
    }
}