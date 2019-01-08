import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no. of places");
        int length = scan.nextInt();
        String[] places = new String[length];
        for(int i= 0;i<length;i++){
            places[i]=scan.next();
        }
        System.out.println(removeVowel(places));
    }



    public static List<String> removeVowel(String[] place) {
        List<String> pl = new ArrayList();
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length(); j++)  {
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