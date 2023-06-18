import java.awt.*;
import java.awt.event.InputEvent;

public class abc {
    public static void main(String[] args) throws AWTException {
        Robot bot = new Robot();
        int x = 750, y = 350;
        bot.mouseMove( x, y );

        bot.mousePress( InputEvent.BUTTON3_MASK);
        bot.mouseRelease( InputEvent.BUTTON3_MASK);

        bot.mouseMove(850, 445);

        bot.mousePress( InputEvent.BUTTON1_MASK);
        bot.mouseRelease( InputEvent.BUTTON1_MASK);

    }
}
