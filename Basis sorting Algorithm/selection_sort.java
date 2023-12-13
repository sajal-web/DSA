public class selection_sort{
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        selectionSortFunc(arr);
        printArray(arr);
        
    }
    static void selectionSortFunc(int arr[]){
        // outer loop for calculating the turn
       for(int i =0;i<arr.length-1;i++){
            int minPos = i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
       
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}