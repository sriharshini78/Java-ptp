import java.io.File;

public class DirectoryLister {
     public static void listAllFiles(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getAbsolutePath());
                    listAllFiles(file);
                } else {
                    System.out.println("File: " + file.getAbsolutePath());
                }
            }
        }
    }
    public static void main(String[] args) {
        // Specify the directory path here
        File f= new File("/path/to/your/directory");
        if (!f.exists() || !f.isDirectory()) {
            System.out.println("Invalid directory path.");
            return;
        }
        System.out.println("Listing files in: " + f.getAbsolutePath());
        listAllFiles(f);
    }

   
}