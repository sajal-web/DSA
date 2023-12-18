public class spiral_matrix{
    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        spiralPrint(matrix);
    }
    static void spiralPrint(int matrix[][]){
        // step - 1
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length -1;
        int endCol = matrix[0].length -1;
        // step - 2 -> Run the loop until startRow <= endRow && startCol <= endCol
        while(startRow<=endRow && startCol<=endCol){
            // print top boundary
            for(int j = startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+"  ");
            }
            // print right part of the matrix constant endCol
            for(int i = startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+"  ");
            }
            // print the bottom of the matrix constant endRow
            for(int j =endCol-1;j>=startCol;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+"  ");
            }
            // print the left part of the matrix constant start col
            for(int i =endRow-1;i>=startRow+1;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+"  ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
        
    }
}