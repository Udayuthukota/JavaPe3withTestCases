import java.util.Scanner;

public class StudentMarks {

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


    public static void main(String[] args)
    {

        System.out.print("Enter the Number of Students:");
        Scanner scan=new Scanner(System.in);
        int numOfStudents;
        numOfStudents=scan.nextInt();
        Scanner grades=new Scanner(System.in);
        System.out.println("Enter the grades");
        String studentGrades[]=new String[numOfStudents];
        for(int i=0;i<numOfStudents;i++)
        {
            System.out.print("Enter the Grade of the student:");
            studentGrades[i]=grades.nextLine();

            if(Integer.parseInt(studentGrades[i])>100)
            {
                System.out.println("Error");
                break;
            }

        }
     //   studentGrades(null,null);

    }


}
