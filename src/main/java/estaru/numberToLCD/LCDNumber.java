package estaru.numberToLCD;


public class LCDNumber {
    public static void LCDNumber(String number) {
        StringBuilder line1 = new StringBuilder();
        StringBuilder line2 = new StringBuilder();
        StringBuilder line3 = new StringBuilder();

        for (char digit : number.toCharArray()) {
            String[] lcd = NumberToLCD.getDigitToLCD().get(digit);
            line1.append(lcd[0]);
            line2.append(lcd[1]);
            line3.append(lcd[2]);
        }

        // Print the three lines for the entire number
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
    }
}