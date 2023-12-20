public class diagonal_sum{
    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,4},
            {4,5,6,7},
            {7,8,9,10},
            {11,12,13,14}
        };
        System.out.println(diagonalSumCalculation(matrix));
        System.out.print(diagonalOptSum(matrix));
    }
    static int diagonalSumCalculation(int matrix[][]){
        int sum =0;
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }else if(i+j == matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
    return sum;
    }
    static int diagonalOptSum(int matrix[][]){
        int sum =0;
        for(int i =0;i<matrix.length;i++){
            // primary diagonal sum
            sum += matrix[i][i];
            // secoundary diagonal sum
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
}