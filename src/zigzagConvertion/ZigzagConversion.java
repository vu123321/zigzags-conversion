package zigzagConvertion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ZigzagConversion {
    public static void main(String[] args) {

        System.out.println("outCome : " + convert(generate(100), 10).equals((generate(100))));
    }

    public static String generate(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    private static String convert(String s, int numRows) {
        if (numRows < 1) {
            return s;
        }

        List<StringBuffer> rows = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuffer());
        }


        int curRow = 0;
        boolean goingDown = false;
        for (char character : s.toCharArray()) {
            rows.get(curRow).append(character);
            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }

            curRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuffer row : rows) {
            result.append(row);

        }
        return result.toString();
    }
}