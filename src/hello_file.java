import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class hello_file {
    public static void main(String[] args) {
        rFile("Hello.txt");

    }

    public static void rFile(String fileName){
        Path filePath = Paths.get(fileName);
        Charset charset = Charset.forName("ISO-8859-1");
        try {
            List<String> lines = Files.readAllLines(filePath, charset);
            for (String line : lines) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }


}





