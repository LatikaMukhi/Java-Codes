import java.io.File;

public class FileExistenceChecker {
    public static void main(String[] args) {
        String filePath = "path_to_file_or_directory"; // Replace with the actual file path
    
        File file = new File(filePath);
    
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The given path corresponds to a file.");
            } else if (file.isDirectory()) {
                System.out.println("The given path corresponds to a directory.");
            } else {
                System.out.println("The given path does not correspond to a valid file or directory.");
            }
        } else {
            System.out.println("The given path does not exist.");
        }
    }
}
