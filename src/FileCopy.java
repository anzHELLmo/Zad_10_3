import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCopy {
    public static void main(String[] args) {
        String inputFilePath = "D:\\Dokument.txt";
        String outputFilePath = "D:\\Dokument_new.txt";

        try {
            System.out.println("Reading the input file: " + inputFilePath);
            String content = new String(Files.readAllBytes(Paths.get(inputFilePath))).replace(" ", "-");
            System.out.println("File successfully read.");

            System.out.println("Creating the new file: " + outputFilePath);
            Files.write(Paths.get(outputFilePath), content.getBytes(), StandardOpenOption.CREATE);
            System.out.println("New file successfully created.");
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}