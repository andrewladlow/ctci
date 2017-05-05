package Ex1;

public class Ex1_7 {

    public static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][n - i - 1] = matrix[i][j];
            }
        }    
        return result;
    }
    
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12},
                           {13, 14, 15, 16} };
    
        int[][] rotatedMatrix = rotateMatrix(matrix);
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
