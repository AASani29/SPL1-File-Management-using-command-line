
import java.util.Scanner;


public class FileManager {
    private static String currentDirectory = ".";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the File Manager!");
        displayHelp();

        while (true) {
            System.out.print("Enter a command (or 'help' for available commands): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            String[] commandParts = input.split(" ", 2);
            String action = commandParts[0].toLowerCase();
            String argument = commandParts.length > 1 ? commandParts[1] : "";

            executeFullCommand(action, argument);
        }
    }

    public static void setCurrentDirectory(String directory) {
        currentDirectory = directory;
    }

    public static String getCurrentDirectory() {
        return currentDirectory;
    }

    private static void executeFullCommand(String action, String argument) {
        switch (action) {
            case "createfile":
                CreateFileCommand.createFile(argument);
                break;

            default:
                System.out.println("Invalid command. Enter 'help' to see available commands.");
        }
    }

    private static void displayHelp() {
        System.out.println("----------------------Available commands------------------------");
        System.out.println("1.createfile <file_name>");
        System.out.println("Type 'exit' to exit the File Manager.");
    }
}
