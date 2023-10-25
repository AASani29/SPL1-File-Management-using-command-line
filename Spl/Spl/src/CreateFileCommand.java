import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileCommand {
    public static void createFile(String fileName) {
        try {
            String fullPath = FileManager.getCurrentDirectory() + File.separator + fileName;
            FileWriter writer = new FileWriter(fullPath);
            writer.close();
            System.out.println("File created: " + fullPath);
        } catch (IOException e) {
            System.out.println("Error creating the file: " + e.getMessage());
        }
    }
}
