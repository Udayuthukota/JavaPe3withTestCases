/* Create a class called StudentMarks, which prompts user for the number of students,
reads it from the keyboard, and saves it in an int variable called numOfStudents.
It then prompts user for the grades of each of the students and saves them in an int array called stuGrades.
 Your program shall check that the grade is between 0 and 100 else has to trow an error message.

*/
package com.stackroute.pe3;
import java.util.Scanner;
public class StudentMarks
{
   public String studentGrades(String[] a,int number)
     {
          StringBuilder result=new StringBuilder();
            for(int i=0;i<number;i++)
            {
                if(a[i].matches("-?[0-9]+") && number>0 && number<500)
                {
                if(Integer.parseInt(a[i])<100)
                    result.append(a[i]+" ");
                }
                else
                    return "Enter a Invalid Input";
            }
        return result.toString();
    }
}
