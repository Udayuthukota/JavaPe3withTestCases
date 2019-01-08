import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;

public class StudentMarksTest {

    int i=4;
     String[] a ={"80","70","60","50"};
    @Before
    public void setUp()
    {
     studentMarks=new StudentMarks();
    }

    @After
    public void tearDown(){}

    StudentMarks studentMarks;


    @Test
    public void testStudentMarksSuccess()
    {
        String expectedValue="80 70 60 50 ";
        String actualValue;
        actualValue=studentMarks.studentGrades(a,i);
        assertEquals(expectedValue,actualValue);
    }



}