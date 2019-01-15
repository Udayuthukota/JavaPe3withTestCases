/*
Write a program to create a ChessBoard pattern with the help of multidimensional array, where WWrepresents white color and BB represents Black color.
 Output:
 My Chess Board
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|

 */
package com.stackroute.pe3;
public class ChessBoardPattern
{
     public static String chessPattern(int a, int b)
     { //loop for rows
        String result = "WW|";
        String pattern = "";
        for (int i = 0; i < a; i++)
        {
                switch (result)
                {
                    case "WW|":
                        result = "BB|";
                        break;
                    case "BB|":
                        result = "WW|";
                        break;
                }
            pattern = pattern + "\n";
            for (int j = 0; j < b; j++)
            {   //loop for iterating across coloums
                switch (result)
                {
                    case "WW|":
                        result = "BB|";
                        pattern = pattern + result;
                        break;
                    case "BB|":
                        result = "WW|";
                        pattern = pattern + result;
                        break;
                }
            }
        }
        return pattern;
    }
}