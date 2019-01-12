import com.stackroute.pe3.ConsecutiveNumbers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class checkConsecutiveNumbers
{

        @Before
        public void setUP()
        {
            consecutiveNumbers=new ConsecutiveNumbers();
        }
        ConsecutiveNumbers consecutiveNumbers;
        @After
        public void tearDown()
        {
            consecutiveNumbers=null;
        }
        //pass case
        @Test
        public void testConsecutiveNumbersSuccess()
        {
            String expectedValue="21,22,23,24,25,26,27 are consecutive numbers",actualValue;
            actualValue=consecutiveNumbers.isConsecutive("21,22,23,24,25,26,27");
            assertEquals(expectedValue,actualValue);
        }
            //Failure case
        @Test
        public void testConsecutiveNumbersFailure()
        {
            String expectedValue="21,22,23,24,25,26,27,28 are consecutive numbers",actualValue;
            actualValue=consecutiveNumbers.isConsecutive("21,22,23,24,25,26,27,29");
            assertNotEquals(expectedValue,actualValue);
        }
      //for null input
        @Test
        public void CondecutiveNumbersNullInput()
        {
            String expectedValue="Null Input Not Expected";
            String actualValue=consecutiveNumbers.isConsecutive(null);
            Assert.assertEquals(expectedValue,actualValue);
            Assert.assertNotNull(actualValue);
        }
        //for empty string input
        @Test
        public void CondecutiveNUmbersForEmptyString()
        {
            String expectedValue="Number is expected";
            String actualValue=consecutiveNumbers.isConsecutive(" ");
            Assert.assertEquals(expectedValue,actualValue);
            Assert.assertNotNull(actualValue);
        }
        //pass case for char input
        @Test
        public void testConsecutiveNumbersForCharInput()
        {
            String expectedValue="Number is expected",actualValue;
            actualValue=consecutiveNumbers.isConsecutive("a,22,23,24,25,26,27,28");
            assertEquals(expectedValue,actualValue);
        }
        //pass case for Special charatcter input
        @Test
        public void testConsecutiveNumberForSpecialCharecters()
        {
            String expectedValue="Number is expected",actualValue;
            actualValue=consecutiveNumbers.isConsecutive("_,22,23,$,25,26,27,28");
            assertEquals(expectedValue,actualValue);
        }

}