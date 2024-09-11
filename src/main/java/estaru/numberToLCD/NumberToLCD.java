package estaru.numberToLCD;

import java.util.HashMap;
import java.util.Map;

public class NumberToLCD {

    // Map each digit to its LCD - hashmap
    private static final Map<Character, String[]> digitToLCD = new HashMap<>();

    static {
        digitToLCD.put('0', new String[]{
                " _ ",
                "| |",
                "|_|"
        });
        digitToLCD.put('1', new String[]{
                "   ",
                "  |",
                "  |"
        });
        digitToLCD.put('2', new String[]{
                " _ ",
                " _|",
                "|_ "
        });
        digitToLCD.put('3', new String[]{
                " _ ",
                " _|",
                " _|"
        });
        digitToLCD.put('4', new String[]{
                "   ",
                "|_|",
                "  |"
        });
        digitToLCD.put('5', new String[]{
                " _ ",
                "|_ ",
                " _|"
        });
        digitToLCD.put('6', new String[]{
                " _ ",
                "|_ ",
                "|_|"
        });
        digitToLCD.put('7', new String[]{
                " _ ",
                "  |",
                "  |"
        });
        digitToLCD.put('8', new String[]{
                " _ ",
                "|_|",
                "|_|"
        });
        digitToLCD.put('9', new String[]{
                " _ ",
                "|_|",
                " _|"
        });
    }

    //
    public static Map<Character, String[]> getDigitToLCD() {
        return digitToLCD;
    }


}