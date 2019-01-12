/*Write a program to compute the addition of two matrix, Read the number of rows and columns as input, also the values of each matrix
  Output:
  Input number of rows of matrix: 3
  Input number of columns of matrix: 2
  Input elements of first matrix: 1 2 3 4 5 6
  Input the elements of second matrix: 9 8 7 6 5 4
  Sum of the matrices:-
                     10        10
                     10        10
                     10        10
*/
package com.stackroute.pe3;
public class Addmatrices
{
    public String add(int matrixRow, int MatrixCol, String[] firstMatrix, String[] secondMatrix)
    {
        StringBuilder result = new StringBuilder();
        int[][] add = new int[matrixRow][MatrixCol];
        int[][] first = new int[matrixRow][MatrixCol];
        int[][] second = new int[matrixRow][MatrixCol];
        if (firstMatrix == null || secondMatrix == null) {
            return "Null Input Not Expected";
        }
        else
            {
            int k = 0;
            for (int i = 0; i < matrixRow; i++)
            {
                for (int j = 0; j < MatrixCol; j++)
                {
                    if (firstMatrix[k].matches("-?[0-9]+") && secondMatrix[k].matches("-?[0-9]+")) //using regular expression to remove special characters
                    {
                        first[i][j] = Integer.parseInt(firstMatrix[k]);
                        second[i][j] = Integer.parseInt(secondMatrix[k]);
                        k++;
                        add[i][j] = first[i][j] + second[i][j];
                        result.append(add[i][j] + " ");
                    }
                    else
                        {
                        return "Number is Expected";
                        }
                }
            }
            return result.toString();
        }
    }
}