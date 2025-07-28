import java.util.*;

class SpiralMatrix{
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol) {
            // top  
            for (int j = startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right side

            for (int i = startRow + 1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom
            for (int j = endCol-1; j>=startCol; j--){
                System.out.print(matrix[endRow][j]+" ");
            }

            // left

            for (int i = endRow-1; i>=startRow+1; i--){
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
        return result;
        
        
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] { 
            { 1, 2, 3 }, 
            { 4, 5, 6 }, 
            { 7, 8, 9 } 
        };
        SpiralMatrix obj = new SpiralMatrix();
        List<Integer> result = obj.spiralOrder(matrix);
        // System.out.println("Spiral Order: " + result);

    }
}