package lesson3;

public class Main3 {
    public static void main(String[] args) {
        /**
         * Есть массив символов, вывести на консоль весь массив в
         * обратном порядке
         */

        char[] simbols = {'&', 'd', 'e', 'g', 'r', '3', 'g', '8'};

//        System.out.println(simbols[7]);
//        System.out.println(simbols[6]);
//        System.out.println(simbols[5]);
//        System.out.println(simbols[4]);
//        System.out.println(simbols[3]);
//        System.out.println(simbols[2]);
//        System.out.println(simbols[1]);
//        System.out.println(simbols[0]);

        for(int i = simbols.length; i >= 0; i--){
            System.out.println(simbols[i]);
        }

    }
}
