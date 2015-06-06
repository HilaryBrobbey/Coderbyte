package OptimalAssignments;

import java.util.*;
import java.io.*;

class Function {
    String OptimalAssignments(String[] strArr) {

        StringBuilder strAssignments = new StringBuilder();
        int[][] matrix = arrayToMatrix(strArr);
        int row = 0;
        while (row < matrix.length) {
            int min = Integer.MAX_VALUE;
            int minValueColIndex = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                    minValueColIndex = col;
                }
            }
            if (IsColumnMinimum(matrix, row, minValueColIndex)) {
                //NULL out row
                for (int k = 0; k < matrix[row].length; k++) {
                    matrix[row][k] = Integer.MAX_VALUE;
                }
                //NULL out column
                for (int z = 0; z < matrix.length; z++) {
                    matrix[z][minValueColIndex] = Integer.MAX_VALUE;
                }
                strAssignments.append(String.format("(%s-%s)", row + 1, minValueColIndex + 1));
                row++;

            } else {
                // If not column minimum, "NULL" value and loop over row again
                matrix[row][minValueColIndex] = Integer.MAX_VALUE;
            }
        }

        return strAssignments.toString();
    }

    private int[][] arrayToMatrix(String[] strArr) {
        int[][] matrix = new int[strArr.length][strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            String[] temp = strArr[i].replace("(", "").replace(")", "").split(",");
            for (int j = 0; j < strArr.length; j++) {
                matrix[i][j] = Integer.parseInt(temp[j]);
            }
        }
        return matrix;
    }

    private boolean IsColumnMinimum(int[][] matrix, int row, int col) {

        int value = matrix[row][col];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] < value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.OptimalAssignments(s.nextLine())); 
        System.out.print(c.OptimalAssignments(new String[]{"(13,4,7,6)","(1,11,5,4)","(6,7,2,8)","(1,3,5,9)"}));
    }

}
