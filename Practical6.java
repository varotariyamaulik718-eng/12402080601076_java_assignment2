import java.io.File;

public class Practical6 {

    public static void main(String[] args) {
        File rootDirectory = new File("./"); 

        if (rootDirectory.exists() && rootDirectory.isDirectory()) {
            System.out.println("Scanning directory: " + rootDirectory.getAbsolutePath());            
            displayFiles(rootDirectory, ""); 
        } else {
            System.out.println("Error: The path provided is not a valid directory.");
        }
    }

    public static void displayFiles(File folder, String indent) {
        File[] files = folder.listFiles();

        if (files == null) return; 

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println(indent + "[Folder] " + file.getName());
                displayFiles(file, indent + "    "); 
            } else {
                System.out.println(indent + "- " + file.getName());
            }
        }
    }
}
