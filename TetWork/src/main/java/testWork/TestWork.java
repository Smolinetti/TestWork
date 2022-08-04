package testWork;

import java.util.Arrays;

public class TestWork {

    public static void main(String[] args) {

        countWords();
    }

    public static void countWords() {
        String[] arrayBase = new String[]{"hello", "2", "world", ":-)"};
        String[] arrayTotal = new String[4];
        int count = 0;

        System.out.println(Arrays.toString(arrayBase));

        for (int i = 0; i < arrayBase.length; i++) {
            if (arrayBase[i].length() <= 3) {
                arrayTotal[i] = arrayBase[i];
            }
        }

        for (int i = 0; i < arrayTotal.length; i++) {
            if (arrayTotal[i] != null) {
                count++;
            }
        }
        String[] arrayEnd = new String[count];

        for (int i = 0; i < arrayTotal.length; i++) {
            if (arrayTotal[i] != null) {
                arrayEnd[arrayEnd.length - count] = arrayTotal[i];
                count--;
            }

        }
        System.out.println(Arrays.toString(arrayEnd));

    }


}
