public class bubble_sort{
    public static void main(String args[]){
        int arr[] = {1,4,2,3,5,6};
        bubbleSortFunc(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // If the given array  is sorted in assending order now let's optimize the code for better time complexcity
    static void bubbleSortFunc(int arr[]){
        boolean swaped = false;
        for(int i = 0;i< arr.length-1; i++){
            for(int j =0; j < arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp; 
                    // chenge the swap flag to true which idicate that swap was made
                    swaped = true;
                }
            }
           if(!swaped){
                System.out.print("break the loop the array is already sorted");
                break;
           }
        }
    }
}