package com.company;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class checkAddmatrices {

    Addmatrices addmatrices;

    @Before
    public void setUp() {
        addmatrices = new Addmatrices();
    }

    @After
    public void tearDown() {
        addmatrices = null;

    }


    String[] firstMatrix = {"1", "2", "3", "4", "5", "6"};
    String[] secondMatrix = {"9", "8", "7", "6", "5", "4"};

    @Test
    public void testAddMatricesSuccess() {
        String actualValue;
        String expectedValue = "10 10 10 10 10 10 ";
        actualValue = addmatrices.add(3, 2, firstMatrix, secondMatrix);
        assertEquals(expectedValue, actualValue);
    }

    String[] getFirstMatrix1 = {"1", "2", "3", "4", "5", "6"};
    String[] secondMatrix2 = {"9", "8", "7", "6", "5", "4"};

    @Test
    public void testAddMatricesFailure() {
        String actualValue;
        String expectedValue = "null";
        actualValue = addmatrices.add(3, 2, getFirstMatrix1, secondMatrix2);
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    public void testAddMatriceNullInput() {
        String actualValue;
        String expectedValue = "Null Input Not Expected";
        actualValue = addmatrices.add(3, 2, null, secondMatrix);
        assertEquals(expectedValue, actualValue);
    }
    String[]firstMatrix3={"*","2","3","4","5","6"};

    @Test
    public void testAddMatriceSpecialCharecter() {
        String actualValue;
        String expectedValue = "Number is Expected";
        actualValue = addmatrices.add(3, 2, firstMatrix3, secondMatrix);
        assertEquals(expectedValue, actualValue);
    }

    String[]firstMatrix4={" ","2","3","4","5","6"};

    @Test
    public void testAddMatriceEmptyString() {
        String actualValue;
        String expectedValue = "Number is Expected";
        actualValue = addmatrices.add(3, 2, firstMatrix4, secondMatrix);
        assertEquals(expectedValue, actualValue);
    }
    String[]firstMatrix5={"a","2","3","4","5","6"};

    @Test
    public void testAddMatriceCharInput() {
        String actualValue;
        String expectedValue = "Number is Expected";
        actualValue = addmatrices.add(3, 2, firstMatrix5, secondMatrix);
        assertEquals(expectedValue, actualValue);
    }
}
