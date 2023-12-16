public class counting_sort{
    public static void main(String args[]){
        int arr[] = { 1,4,1,3,2,4,3,7};
        countingSortAlgorithm(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void countingSortAlgorithm(int arr[]){
        // step-1 --> get the max value of the array to calculate the range of count array
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        // step-2 --> declare the count array
        int count[] = new int[largest+1];
        // step-3 --> define the array count
        for(int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }
        // step-4 --> now let's sort the array
        int j =0;
        for(int i =0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}