package estaru.numberToLCD;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LCDNumberTest {

    private String generateLCDOutput(String number) {
        StringBuilder line1 = new StringBuilder();
        StringBuilder line2 = new StringBuilder();
        StringBuilder line3 = new StringBuilder();

        for (char digit : number.toCharArray()) {
            String[] lcd = NumberToLCD.getDigitToLCD().get(digit);
            if (lcd != null) {
                line1.append(lcd[0]);
                line2.append(lcd[1]);
                line3.append(lcd[2]);
            }
        }

        return line1.toString() + "\n" + line2.toString() + "\n" + line3.toString() + "\n";
    }

    // 0
    @Test
    public void testSingleDigit0() {
        String expected =
                " _ \n" +
                        "| |\n" +
                        "|_|\n";
        assertEquals(expected, generateLCDOutput("0"));
    }

    // 1
    @Test
    public void testSingleDigit1() {
        String expected =
                "   \n" +
                        "  |\n" +
                        "  |\n";
        assertEquals(expected, generateLCDOutput("1"));
    }

    //
    @Test
    public void testSingleDigit2() {
        String expected =
                " _ \n" +
                        " _|\n" +
                        "|_ \n";
        assertEquals(expected, generateLCDOutput("2"));
    }

    //0123
    @Test
    public void testMultiDigitNumber() {
        String expected =
                " _     _  _ \n" +
                        "| |  | _| _|\n" +
                        "|_|  ||_  _|\n";
        assertEquals(expected, generateLCDOutput("0123"));
    }

    // 14738
    @Test
    public void testAnotherMultiDigitNumber() {
        String expected =
                "       _  _  _ \n" +
                        "  ||_|  | _||_|\n" +
                        "  |  |  | _||_|\n";
        assertEquals(expected, generateLCDOutput("14738"));
    }

    @Test
    public void testEmptyInput() {
        // 3 empty lines
        String expected = "\n\n\n";
        assertEquals(expected, generateLCDOutput(""));
    }

}