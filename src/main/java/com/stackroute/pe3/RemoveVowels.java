/*
Write a program to set up an array of places, Loop round and remove the vowels. Display the new words in console
 Input:
    India
    United States
    Germany
     Egypt
     czechoslovakia

 */
package com.stackroute.pe3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;public class RemoveVowels
{
    public static List<String> removeVowel(String[] place)
    {
        List<String> pl = new ArrayList();
        for (int i = 0; i < place.length; i++)
        {
            for (int j = 0; j < place[i].length(); j++) //remoeving vowels
            {
                if (place[i].charAt(j) == 'a' || place[i].charAt(j) == 'e' || place[i].charAt(j) == 'i' || place[i].charAt(j) == 'o' || place[i].charAt(j) == 'u')
                {
                place[i] = place[i].substring(0, j) + place[i].substring(j + 1);
                j--;
                }
            }
        pl.add(place[i]);
        }
       return pl;
    }
}