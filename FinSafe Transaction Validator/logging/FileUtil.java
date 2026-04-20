package logging;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil{

    public static void log(String message) {
        try {
            FileWriter fw =new FileWriter("audit_log.txt", true);
            fw.write(message + "\n");
            fw.close();
        } catch(IOException e){
            System.out.println("Logging failed: " + e.getMessage());
        }
    }
}