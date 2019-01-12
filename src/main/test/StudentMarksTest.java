import com.stackroute.pe3.StudentMarks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;

public class StudentMarksTest
{
    int noOfStudents=4;
     String[] studentGrades ={"80","70","60","50"};
    @Before
    public void setUp()
    {
     studentMarks=new StudentMarks();
    }
    @After
    public void tearDown()
    {
        studentMarks=null;
    }
    StudentMarks studentMarks;
    //pass case for sample input
    @Test
    public void testStudentMarksSuccess()
    {
        String expectedValue="80 70 60 50 ";
        String actualValue;
        actualValue=studentMarks.studentGrades(studentGrades,noOfStudents);
        assertEquals(expectedValue,actualValue);
    }
    String[] studentGrades1 ={"80","70","60","90"};
    //failure case for samle input
    @Test
    public void testStudentMarksFailure()
    {
        String expectedValue="80 70 60 50 ";
        String actualValue;
        actualValue=studentMarks.studentGrades(studentGrades1,noOfStudents);
        assertNotEquals(expectedValue,actualValue);
    }
    String[] studentGrades2 ={"a","70","60","90"};
    //pass case for char input
    @Test
    public void testStudentCharInput()
    {
        String expectedValue="Enter a Invalid Input";
        String actualValue;
        actualValue=studentMarks.studentGrades(studentGrades2,noOfStudents);
        assertEquals(expectedValue,actualValue);
    }
    //for special character input
    String[] studentGrades3 ={"a","70","60","90"};
    @Test
    public void testStudentSpecialCharecter()
    {
        String expectedValue="Enter a Invalid Input";
        String actualValue;
        actualValue=studentMarks.studentGrades(studentGrades3,noOfStudents);
        assertEquals(expectedValue,actualValue);
    }
}