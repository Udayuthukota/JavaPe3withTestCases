/*
Write a java program to calculate first and last date of a week.
  Output:
  First Date of Week:             Mon 24/07/2017
  Last date of the week:          Sun 30/07/2017
 */
package com.stackroute.pe3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class FirstandLastDate
{
    public static void main(String []args)
    {
        Calendar calendar= Calendar.getInstance();
         // Set the calendar to monday of the current week
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        // Print dates of the current week starting on Monday
        DateFormat dateformat = new SimpleDateFormat("E DD/MMMM/yyyy");
        System.out.println(dateformat.format(calendar.getTime()));
        for (int i = 0; i <6; i++) {
            calendar.add(Calendar.DATE,1);
        }
       // System.out.println(dateformat.format(calendar.getTime()));
        //System.out.println();
    }
}