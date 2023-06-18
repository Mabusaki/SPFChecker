package withmethods;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AWTException, IOException {
        Robot bot = new Robot();
        Methods start = new Methods(bot);

        FileInputStream fis = new FileInputStream("C:\\Users\\mabus\\Desktop\\list.txt");
        Scanner sc = new Scanner(fis);
        while(sc.hasNextLine()){
            String domain = sc.nextLine().toString();
            start.openChromeAndGoToURL();
            start.clearAllSearchBar();
            start.switchToSpfLookupMode();
            start.writeDomainAddressToSearchBar(domain);

            bot.mousePress( InputEvent.BUTTON1_MASK);
            bot.mouseRelease( InputEvent.BUTTON1_MASK);

            start.clickSaveThisPage();
            start.changeFileNameAsDomainAddress(domain);
            start.categorizeDomainsInSeparateFiles(domain);
        }sc.close();
    }
}
