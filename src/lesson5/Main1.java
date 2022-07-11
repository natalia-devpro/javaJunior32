package lesson5;

public class Main1 {
    public static void main(String[] args) {
        /**
         *
         */

        int[] numbers = {3, 5, 6, 8, 4, 6, 8, 44, 234};

        for (int i = 0; i < numbers.length; i++) {
            //    3     "3"
            String currentNumFromMassive = Integer.toString(numbers[i]);

            // "3"
            // fhdj4    234     e4e4e4   skdfgd
            int startIndex4 = currentNumFromMassive.indexOf('4');
            if (startIndex4 != -1) {
                System.out.println(currentNumFromMassive);
            }

        }

    }
}
