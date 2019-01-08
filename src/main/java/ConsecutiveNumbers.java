import java.util.Scanner;

public class ConsecutiveNumbers
     {

         public static String isConsecutive(String string) {
             if (string == null) {
                 return "Null Input Not Expected";
             }
             else {

                 boolean flag = true;
                 String[] numbers = string.split(",");
                 int[] numberArray = new int[numbers.length];
                 for (int i = 0; i < numbers.length; i++) {
                     if(numbers[i].matches("-?[0-9]+")) {
                         numberArray[i] = Integer.parseInt(numbers[i]);
                     }
                     else
                     {
                         return "Number is expected";
                     }

                 }
                 for (int j = 0; j < numberArray.length - 1; j++) {
                     if (Math.abs((numberArray[j]) - (numberArray[j + 1])) != 1) {
                         flag = false;
                         break;
                     }
                 }
                 if (flag) {
                     return string + " are consecutive numbers";
                 } else {
                     return string + " are non consecutive numbers";
                 }
             }

             }


             public static void main (String[]args)
             {
                 Scanner scan = new Scanner(System.in);
                 String numbers = scan.nextLine();
                 System.out.println(isConsecutive(numbers));
             }


}