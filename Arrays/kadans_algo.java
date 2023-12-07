public class kadans_algo{
    public static void main(String args[]){
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.print(kadansAlgoFunc(nums));
    }
    static int kadansAlgoFunc(int nums[]){
       int currSum = 0;
       int maxSum = Integer.MIN_VALUE;
       for(int i =0;i< nums.length;i++){
        currSum += nums[i];
        if(currSum<0){
            currSum = 0;
        }
        maxSum = Math.max(currSum,maxSum);
       }
       return maxSum;
    }
}