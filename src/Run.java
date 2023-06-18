import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws AWTException, IOException {
        Robot bot = new Robot();
        Break start = new Break(bot);

        FileInputStream fis = new FileInputStream("C:\\Users\\mabus\\Desktop\\list.txt");
        Scanner sc = new Scanner(fis);
        while(sc.hasNextLine()){
            String domain = sc.nextLine().toString();
            start.categorizeDomainsInSeparateFiles(domain);
        }sc.close();
    }
}
