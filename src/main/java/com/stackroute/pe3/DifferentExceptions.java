/*Write a program that will generate exceptions of type NegativeArraySizeException,
 IndexOutOfBoundsException, NullPointerException. Record the catching of each exception
 by displaying the message stored in the exception object.
*/
package com.stackroute.pe3;
public class DifferentExceptions
{

    public static void main(String[] args)
    {
        try
          {
           String[] string= new String[-2];
          }
        catch(NegativeArraySizeException b)
             {
             System.out.println("\n"+"Negative array exception has been caught");
             }
        finally
             {
             System.out.println("\n"+"finally has been executed in Negative array exception");
             }
        int[] arr= new int[3];
        try
           {
           int number = arr[3];
           }
        catch(IndexOutOfBoundsException c)
           {
            System.out.println("\n"+"Index out of bound exception has been caught");
           }
        finally
            {
            System.out.println("\n"+"finally has been executed in Index out of bound exception");
            }
            String string1=null;
        try
        {
            if(string1.equals("uday"))
            string1="uday";
            else
            string1=null;
        }
         catch(NullPointerException c)
          {
            System.out.println("\n"+"Null pointer exception has been caught");
           }
        finally
           {
            System.out.println("\n"+"finally has been executed in null pointer exception");
           }
     }
}