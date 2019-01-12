/*
Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier, assume the digits are a string and use split()
 Input: 98,96,95,94,93
 Output: 98,96,95,94,93 non consecutive numbers

 Input: 54,53,52,51,50,49,48
 Output : 54,53,52,51,50,49,48 are consecutive numbers

 */
package com.stackroute.pe3;
import java.util.Scanner;
public class ConsecutiveNumbers
{
    public static String isConsecutive(String string)
    {
        if (string == null)
        {
            return "Null Input Not Expected";
        }
        else
            {
                boolean flag = true;
                String[] numbers = string.split(",");
                int[] numberArray = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++)
                 {
                    if (numbers[i].matches("-?[0-9]+"))
                    {
                        numberArray[i] = Integer.parseInt(numbers[i]);
                    }
                    else
                        {
                        return "Number is expected";
                         }

                 }
                for (int j = 0; j < numberArray.length - 1; j++)
                 {
                    if (Math.abs((numberArray[j]) - (numberArray[j + 1])) != 1)
                    {
                        flag = false;
                        break;
                    }
                 }
                if (flag)
                {
                    return string + " are consecutive numbers";
                }
                else
                     {
                    return string + " are non consecutive numbers";
                     }
           }
    }
}