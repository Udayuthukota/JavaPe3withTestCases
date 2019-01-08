package com.company;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class AddmatricesTest {

    Addmatrices addmatrices;

    @Before
    public void setUp() {
        addmatrices = new Addmatrices();
    }

    @After
    public void tearDown() {
        addmatrices = null;

    }


    String[] first1 = {"1", "2", "3", "4", "5", "6"};
    String[] second1 = {"9", "8", "7", "6", "5", "4"};

    @Test
    public void testAddMatricesSuccess() {
        String actualValue;
        String expectedValue = "10 10 10 10 10 10 ";
        actualValue = addmatrices.add(3, 2, first1, second1);
        assertEquals(expectedValue, actualValue);
    }

    String[] first = {"1", "2", "3", "4", "5", "6"};
    String[] second = {"9", "8", "7", "6", "5", "4"};

    @Test
    public void testAddMatricesFailure() {
        String actualValue;
        String expectedValue = "null";
        actualValue = addmatrices.add(3, 2, first, second);
        assertNotEquals(expectedValue, actualValue);
    }

}
