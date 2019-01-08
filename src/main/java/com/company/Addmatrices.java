package com.company;

public class Addmatrices {

    public String add(int row, int col, String[] firstMatrix, String[] secondMatrix) {
        StringBuilder result = new StringBuilder();
        int[][] add = new int[row][col];
        int[][] first = new int[row][col];
        int[][] second = new int[row][col];
        if (firstMatrix == null || secondMatrix == null) {
            return "Null Input Not Expected";
        } else {
            int k = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (firstMatrix[k].matches("-?[0-9]+") && secondMatrix[k].matches("-?[0-9]+")) {
                        first[i][j] = Integer.parseInt(firstMatrix[k]);
                        second[i][j] = Integer.parseInt(secondMatrix[k]);
                        k++;
                        add[i][j] = first[i][j] + second[i][j];
                        result.append(add[i][j] + " ");
                    } else {
                        return "Number is Expected";
                    }
                }
            }
            return result.toString();
        }
    }
}