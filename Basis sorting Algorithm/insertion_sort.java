public class insertion_sort{
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        insertionSortFun(arr);
        printArray(arr);
    }
    static void insertionSortFun(int arr[]){
        // we have to insert n-1 elements with their proper position to sort
        for(int i =0;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            // now until prev>=0 && arr[prev] > arr[curr] , 
            // push the previous element to previous + 1
            while(prev >=0 && arr[prev]  > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // swap
            arr[prev+1] = curr;
        }
    }
     static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}