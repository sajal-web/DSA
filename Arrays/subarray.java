public class subarray{
    public static void main(String args[]){
        int num[] = {1,3,-1,4,2,-5,6,7};
       System.out.print(printSubArray(num));
    }
    static int printSubArray(int num[]){
      int currSum =0;
      int maxSum = Integer.MIN_VALUE;
      for(int i =0;i<num.length;i++){
        for(int j =i;j<num.length;j++){
            currSum =0;
            for(int k = i;k<=j;k++){
                System.out.print(num[k]+", ");
                currSum += num[k];
            }
            System.out.println();
        }
        System.out.println();
        if(maxSum<currSum){
            maxSum = currSum;
        }
      }
      return maxSum;
    }
}