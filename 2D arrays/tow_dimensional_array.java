import java.util.*;
public class tow_dimensional_array{
    public static void main(String args[]){
        int matrix[][] = new int[4][3];
        Scanner sc = new Scanner(System.in);
        // Input in tow dimensional array
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // output in tow dimensional array
        for(int i = 0 ;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        searchElement(matrix);
       
    }
    static void searchElement(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j] == 12){
                    System.out.print("Target found at index ...");
                    return;
                }else{
                    System.out.print("Target not found");
                    return;
                }
            }
        }
    }
}