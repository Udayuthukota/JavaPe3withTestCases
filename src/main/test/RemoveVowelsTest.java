import com.stackroute.pe3.RemoveVowels;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
public class RemoveVowelsTest
{
    RemoveVowels removeVowels = new RemoveVowels();
    @Before
    public void setUp()
    {
        removeVowels=new RemoveVowels();
    }
    @After
    public void tearDown()
    {
        removeVowels=null;
    }

    String[] places={"uday","bangalore","mangalore"};
     //pass case for sample input
    @Test
    public void checkRemoveVowelsSuccess()
    {
        List<String> expectedValue = new ArrayList<String>();
        expectedValue.add("dy");
        expectedValue.add("bnglr");
        expectedValue.add("mnglr");
        List<String> actualValue = new ArrayList<String>();
        actualValue=removeVowels.removeVowel(places);
        assertEquals(expectedValue,actualValue);

    }
    //fail case for sample input
    @Test
    public void checkRemoveVowelsFailure()
    {
        List<String> expectedValue = new ArrayList<String>();
        expectedValue.add("b");
        expectedValue.add("bnglr");
        expectedValue.add("mnglr");
        List<String> actualValue = new ArrayList<String>();
        actualValue=removeVowels.removeVowel(places);
        assertNotEquals(expectedValue,actualValue);

    }
}