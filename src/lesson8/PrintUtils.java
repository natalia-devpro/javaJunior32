package lesson8;

import java.util.Scanner;

public class PrintUtils {

    public static void printQuestion(Question question){
        System.out.println(question.getQuestion());
        Option[] options = question.getOptions(); //
        for(int i = 0; i < options.length; i++){
            if(options[i] != null){
                System.out.println("  " + (i + 1) + " - " + options[i].getOption());
            }
        }
    }

    public static int[] getAnswers(){
        // lkxksdjfsv    1 3 34    1    -4
        System.out.println("Выберите варианты: ");
        Scanner scanner = new Scanner(System.in);
        String inputAnswer = scanner.nextLine(); // "1  2  3"
        String[] nums = inputAnswer.split(" "); //  [ "1" , "2" , "3"]
        int[] result = new int[nums.length]; // [ 0 , 0 , 0]   [ 1 , 2 , 3]

        for(int i = 0; i < nums.length; i++){
            result[i] = Integer.parseInt(nums[i]);
        }

        return result;
    }
}
