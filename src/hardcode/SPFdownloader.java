package hardcode;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SPFdownloader {
    public static void main(String[] args) throws AWTException, IOException {
        // Creates instance of Robot Class
        Robot bot = new Robot();
//        int x = 1920, y = 1080;
//        bot.mouseMove( x, y );
//
//        bot.mousePress( InputEvent.BUTTON1_MASK );
//        bot.mouseRelease( InputEvent.BUTTON1_MASK );
//
//        System.out.println( "Mouse clicked at: " + x + " : " + y );

        // Opens Chrome and goes to MxToolbox SuperTool address
        Runtime.getRuntime().exec("cmd /c start firefox https://mxtoolbox.com/SuperTool.aspx");
        bot.delay(2000);
        // Writes spf: to search bar
        bot.keyPress(KeyEvent.VK_S);
        bot.keyRelease(KeyEvent.VK_S);
        bot.keyPress(KeyEvent.VK_P);
        bot.keyRelease(KeyEvent.VK_P);
        bot.keyPress(KeyEvent.VK_F);
        bot.keyRelease(KeyEvent.VK_F);
        bot.keyPress(KeyEvent.VK_SHIFT);
        bot.keyPress(KeyEvent.VK_SEMICOLON);
        bot.keyRelease(KeyEvent.VK_SEMICOLON);
        bot.keyRelease(KeyEvent.VK_SHIFT);
        bot.delay(4000);

        //filepath of domain addresses file
        //Path domainlist = Path.of("C:\\Users\\mabus\\Desktop\\list.txt");
        //pulls domain address from .txt file to string
        String domain = "socar.az";

        // writes the domian address
        for(int i = 0; i < domain.length(); i++){
            switch (domain.charAt(i)) {
                case 'a': bot.keyPress(KeyEvent.VK_A); break;
                case 'b': bot.keyPress(KeyEvent.VK_B); break;
                case 'c': bot.keyPress(KeyEvent.VK_C); break;
                case 'd': bot.keyPress(KeyEvent.VK_D); break;
                case 'e': bot.keyPress(KeyEvent.VK_E); break;
                case 'f': bot.keyPress(KeyEvent.VK_F); break;
                case 'g': bot.keyPress(KeyEvent.VK_G); break;
                case 'h': bot.keyPress(KeyEvent.VK_H); break;
                case 'i': bot.keyPress(KeyEvent.VK_I); break;
                case 'j': bot.keyPress(KeyEvent.VK_J); break;
                case 'k': bot.keyPress(KeyEvent.VK_K); break;
                case 'l': bot.keyPress(KeyEvent.VK_L); break;
                case 'm': bot.keyPress(KeyEvent.VK_M); break;
                case 'n': bot.keyPress(KeyEvent.VK_N); break;
                case 'o': bot.keyPress(KeyEvent.VK_O); break;
                case 'p': bot.keyPress(KeyEvent.VK_P); break;
                case 'q': bot.keyPress(KeyEvent.VK_Q); break;
                case 'r': bot.keyPress(KeyEvent.VK_R); break;
                case 's': bot.keyPress(KeyEvent.VK_S); break;
                case 't': bot.keyPress(KeyEvent.VK_T); break;
                case 'u': bot.keyPress(KeyEvent.VK_U); break;
                case 'v': bot.keyPress(KeyEvent.VK_V); break;
                case 'w': bot.keyPress(KeyEvent.VK_W); break;
                case 'x': bot.keyPress(KeyEvent.VK_X); break;
                case 'y': bot.keyPress(KeyEvent.VK_Y); break;
                case 'z': bot.keyPress(KeyEvent.VK_Z); break;
                case '0': bot.keyPress(KeyEvent.VK_0); break;
                case '1': bot.keyPress(KeyEvent.VK_1); break;
                case '2': bot.keyPress(KeyEvent.VK_2); break;
                case '3': bot.keyPress(KeyEvent.VK_3); break;
                case '4': bot.keyPress(KeyEvent.VK_4); break;
                case '5': bot.keyPress(KeyEvent.VK_5); break;
                case '6': bot.keyPress(KeyEvent.VK_6); break;
                case '7': bot.keyPress(KeyEvent.VK_7); break;
                case '8': bot.keyPress(KeyEvent.VK_8); break;
                case '9': bot.keyPress(KeyEvent.VK_9); break;
                case '-': bot.keyPress(KeyEvent.VK_MINUS); break;
                case '=': bot.keyPress(KeyEvent.VK_EQUALS); break;
                //case '~': bot.keyPress(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_QUOTE); break;
                case '!': bot.keyPress(KeyEvent.VK_EXCLAMATION_MARK); break;
                case '@': bot.keyPress(KeyEvent.VK_AT); break;
                case '#': bot.keyPress(KeyEvent.VK_NUMBER_SIGN); break;
                case '$': bot.keyPress(KeyEvent.VK_DOLLAR); break;
                //case '%': bot.keyPress(KeyEvent.VK_SHIFT, KeyEvent.VK_5); break;
                case '^': bot.keyPress(KeyEvent.VK_CIRCUMFLEX); break;
                case '&': bot.keyPress(KeyEvent.VK_AMPERSAND); break;
                case '*': bot.keyPress(KeyEvent.VK_ASTERISK); break;
                case '(': bot.keyPress(KeyEvent.VK_LEFT_PARENTHESIS); break;
                case ')': bot.keyPress(KeyEvent.VK_RIGHT_PARENTHESIS); break;
                case '_': bot.keyPress(KeyEvent.VK_UNDERSCORE); break;
                case '+': bot.keyPress(KeyEvent.VK_PLUS); break;
                case '\t': bot.keyPress(KeyEvent.VK_TAB); break;
                case '\n': bot.keyPress(KeyEvent.VK_ENTER); break;
                case '[': bot.keyPress(KeyEvent.VK_OPEN_BRACKET); break;
                case ']': bot.keyPress(KeyEvent.VK_CLOSE_BRACKET); break;
                case '\\': bot.keyPress(KeyEvent.VK_BACK_SLASH); break;
                //case '{': bot.keyPress(KeyEvent.VK_SHIFT, KeyEvent.VK_OPEN_BRACKET); break;
                //case '}': bot.keyPress(KeyEvent.VK_SHIFT, KeyEvent.VK_CLOSE_BRACKET); break;
                //case '|': bot.keyPress(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_SLASH); break;
                case ';': bot.keyPress(KeyEvent.VK_SEMICOLON); break;
                case ':': bot.keyPress(KeyEvent.VK_COLON); break;
                case '\'': bot.keyPress(KeyEvent.VK_QUOTE); break;
                case '"': bot.keyPress(KeyEvent.VK_QUOTEDBL); break;
                case ',': bot.keyPress(KeyEvent.VK_COMMA); break;
                case '<': bot.keyPress(KeyEvent.VK_LESS); break;
                case '.': bot.keyPress(KeyEvent.VK_PERIOD); break;
                case '>': bot.keyPress(KeyEvent.VK_GREATER); break;
                case '/': bot.keyPress(KeyEvent.VK_SLASH); break;
                //case '?': bot.keyPress(KeyEvent.VK_SHIFT, KeyEvent.VK_SLASH); break;
                case ' ': bot.keyPress(KeyEvent.VK_SPACE); break;
                default:
                    throw new IllegalArgumentException("Cannot type character " + domain.charAt(i));
            }
        }
        // hits enter to search and saves .html file to destination path
        bot.keyPress(KeyEvent.VK_ENTER);
        bot.keyRelease(KeyEvent.VK_ENTER);
        bot.delay(15000);
//        bot.keyPress(KeyEvent.VK_CONTROL);
//        bot.keyPress(KeyEvent.VK_S);
//        bot.keyRelease(KeyEvent.VK_S);
//        bot.keyRelease(KeyEvent.VK_CONTROL);
        int x = 750, y = 350;
        bot.mouseMove( x, y );

        bot.mousePress( InputEvent.BUTTON3_MASK);
        bot.mouseRelease( InputEvent.BUTTON3_MASK);

        bot.mouseMove(820, 445);

        bot.mousePress( InputEvent.BUTTON1_MASK);
        bot.mouseRelease( InputEvent.BUTTON1_MASK);

        bot.delay(2000);
        // writes domain name as file name
        for(int i = 0; i < domain.length(); i++){
            switch (domain.charAt(i)) {
                case 'a': bot.keyPress(KeyEvent.VK_A); break;
                case 'b': bot.keyPress(KeyEvent.VK_B); break;
                case 'c': bot.keyPress(KeyEvent.VK_C); break;
                case 'd': bot.keyPress(KeyEvent.VK_D); break;
                case 'e': bot.keyPress(KeyEvent.VK_E); break;
                case 'f': bot.keyPress(KeyEvent.VK_F); break;
                case 'g': bot.keyPress(KeyEvent.VK_G); break;
                case 'h': bot.keyPress(KeyEvent.VK_H); break;
                case 'i': bot.keyPress(KeyEvent.VK_I); break;
                case 'j': bot.keyPress(KeyEvent.VK_J); break;
                case 'k': bot.keyPress(KeyEvent.VK_K); break;
                case 'l': bot.keyPress(KeyEvent.VK_L); break;
                case 'm': bot.keyPress(KeyEvent.VK_M); break;
                case 'n': bot.keyPress(KeyEvent.VK_N); break;
                case 'o': bot.keyPress(KeyEvent.VK_O); break;
                case 'p': bot.keyPress(KeyEvent.VK_P); break;
                case 'q': bot.keyPress(KeyEvent.VK_Q); break;
                case 'r': bot.keyPress(KeyEvent.VK_R); break;
                case 's': bot.keyPress(KeyEvent.VK_S); break;
                case 't': bot.keyPress(KeyEvent.VK_T); break;
                case 'u': bot.keyPress(KeyEvent.VK_U); break;
                case 'v': bot.keyPress(KeyEvent.VK_V); break;
                case 'w': bot.keyPress(KeyEvent.VK_W); break;
                case 'x': bot.keyPress(KeyEvent.VK_X); break;
                case 'y': bot.keyPress(KeyEvent.VK_Y); break;
                case 'z': bot.keyPress(KeyEvent.VK_Z); break;
                case '0': bot.keyPress(KeyEvent.VK_0); break;
                case '1': bot.keyPress(KeyEvent.VK_1); break;
                case '2': bot.keyPress(KeyEvent.VK_2); break;
                case '3': bot.keyPress(KeyEvent.VK_3); break;
                case '4': bot.keyPress(KeyEvent.VK_4); break;
                case '5': bot.keyPress(KeyEvent.VK_5); break;
                case '6': bot.keyPress(KeyEvent.VK_6); break;
                case '7': bot.keyPress(KeyEvent.VK_7); break;
                case '8': bot.keyPress(KeyEvent.VK_8); break;
                case '9': bot.keyPress(KeyEvent.VK_9); break;
                case '-': bot.keyPress(KeyEvent.VK_MINUS); break;
                case '=': bot.keyPress(KeyEvent.VK_EQUALS); break;
                //case '~': bot.keyPress(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_QUOTE); break;
                case '!': bot.keyPress(KeyEvent.VK_EXCLAMATION_MARK); break;
                case '@': bot.keyPress(KeyEvent.VK_AT); break;
                case '#': bot.keyPress(KeyEvent.VK_NUMBER_SIGN); break;
                case '$': bot.keyPress(KeyEvent.VK_DOLLAR); break;
                //case '%': bot.keyPress(KeyEvent.VK_SHIFT, KeyEvent.VK_5); break;
                case '^': bot.keyPress(KeyEvent.VK_CIRCUMFLEX); break;
                case '&': bot.keyPress(KeyEvent.VK_AMPERSAND); break;
                case '*': bot.keyPress(KeyEvent.VK_ASTERISK); break;
                case '(': bot.keyPress(KeyEvent.VK_LEFT_PARENTHESIS); break;
                case ')': bot.keyPress(KeyEvent.VK_RIGHT_PARENTHESIS); break;
                case '_': bot.keyPress(KeyEvent.VK_UNDERSCORE); break;
                case '+': bot.keyPress(KeyEvent.VK_PLUS); break;
                case '\t': bot.keyPress(KeyEvent.VK_TAB); break;
                case '\n': bot.keyPress(KeyEvent.VK_ENTER); break;
                case '[': bot.keyPress(KeyEvent.VK_OPEN_BRACKET); break;
                case ']': bot.keyPress(KeyEvent.VK_CLOSE_BRACKET); break;
                case '\\': bot.keyPress(KeyEvent.VK_BACK_SLASH); break;
                //case '{': bot.keyPress(KeyEvent.VK_SHIFT, KeyEvent.VK_OPEN_BRACKET); break;
                //case '}': bot.keyPress(KeyEvent.VK_SHIFT, KeyEvent.VK_CLOSE_BRACKET); break;
                //case '|': bot.keyPress(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_SLASH); break;
                case ';': bot.keyPress(KeyEvent.VK_SEMICOLON); break;
                case ':': bot.keyPress(KeyEvent.VK_COLON); break;
                case '\'': bot.keyPress(KeyEvent.VK_QUOTE); break;
                case '"': bot.keyPress(KeyEvent.VK_QUOTEDBL); break;
                case ',': bot.keyPress(KeyEvent.VK_COMMA); break;
                case '<': bot.keyPress(KeyEvent.VK_LESS); break;
                case '.': bot.keyPress(KeyEvent.VK_PERIOD); break;
                case '>': bot.keyPress(KeyEvent.VK_GREATER); break;
                case '/': bot.keyPress(KeyEvent.VK_SLASH); break;
                //case '?': bot.keyPress(KeyEvent.VK_SHIFT, KeyEvent.VK_SLASH); break;
                case ' ': bot.keyPress(KeyEvent.VK_SPACE); break;
                default:
                    throw new IllegalArgumentException("Cannot type character " + domain.charAt(i));
            }
        }
        bot.keyPress(KeyEvent.VK_PERIOD);
        bot.keyRelease(KeyEvent.VK_PERIOD);
        //IF .HTML FORMAT IS WANTED
//        bot.keyPress(KeyEvent.VK_H);
//        bot.keyRelease(KeyEvent.VK_H);
//        bot.keyPress(KeyEvent.VK_T);
//        bot.keyRelease(KeyEvent.VK_T);
//        bot.keyPress(KeyEvent.VK_M);
//        bot.keyRelease(KeyEvent.VK_M);
//        bot.keyPress(KeyEvent.VK_L);
//        bot.keyRelease(KeyEvent.VK_L);
        bot.keyPress(KeyEvent.VK_T);
        bot.keyRelease(KeyEvent.VK_T);
        bot.keyPress(KeyEvent.VK_X);
        bot.keyRelease(KeyEvent.VK_X);
        bot.keyPress(KeyEvent.VK_T);
        bot.keyRelease(KeyEvent.VK_T);
        bot.delay(1000);
        bot.keyPress(KeyEvent.VK_ENTER);
        bot.keyRelease(KeyEvent.VK_ENTER);
        bot.delay(7000);
        Scanner scanner = new Scanner(new File("C:\\Users\\mabus\\Desktop\\spfrecords\\" + domain + ".txt"));
        while(scanner.hasNext()){
            String line = scanner.nextLine().toString();
            if(line.contains("No SPF Record found")) System.out.println("Found! " + line);
        } scanner.close();

        FileWriter newWriter = new FileWriter("C:\\Users\\mabus\\Desktop\\NoSPF.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(newWriter);
        bufferedWriter.write("\n");
        bufferedWriter.write(domain);
        bufferedWriter.close();
        System.out.println("Successfully appended. Check the file!");


    }
}
