package lesson3;


import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        /**
         * Нам пользователь задал пароль
         * Нам нужно напечатать на консоль пароль нам подходит или нет.
         * Пароль подходит если:
         * - он содержит более 8 символов
         * - он содердит цифру с себе
         * - он содержит большую букву
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String inputPassword = scanner.nextLine();

        char[] charsFromPassword = inputPassword.toCharArray();

        if(charsFromPassword.length < 8){
            System.out.println("Длина пароля меньше 8 символов!!!");
            return;
        }

        // sdkjfher

        int countNumbers = 0;
        for(int i = 0; i < charsFromPassword.length; i++){
            if(charsFromPassword[i] == '0' ||
                    charsFromPassword[i] == '1' || charsFromPassword[i] == '2'){
                countNumbers++;
            }
        }

        if(countNumbers == 0){
            System.out.println("В пароле нет чисел!!!");
        }
    }
}
