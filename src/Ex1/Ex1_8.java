package Ex1;

import java.util.ArrayList;
import java.util.List;

public class Ex1_8 {
    
    public static class Pair {
        public int row;
        public int col;
        
        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static int[][] zeroMatrix(int[][] input) {
        
        int rows = input.length;
        int cols = input[0].length;
        
        List<Pair> pairList = new ArrayList<Pair>();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (input[i][j] == 0) {
                    pairList.add(new Pair(i, j));
                }
            }
        }
        
        for (Pair pair : pairList) {
            // clear row
            for (int j = 0; j < cols; j++) {
                input[pair.row][j] = 0;
            }
            
            // clear col
            for (int i = 0; i < rows; i++) {
                input[i][pair.col] = 0;
            }
        }
        
        return input;
    }

    public static void main(String[] args) {
        int[][] matrix1 = { {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12} };
        
        zeroMatrix(matrix1);
        
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        int[][] matrix2 = { {1, 2, 0, 4},
                            {5, 6, 7, 8},
                            {9, 0, 11, 12} };     
        
        zeroMatrix(matrix2);
        
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
