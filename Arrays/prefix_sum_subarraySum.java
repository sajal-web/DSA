public class prefix_sum_subarraySum{
    public static void main(String args[]){
        int nums[] = {1,3,-1,4,2,-5,6,7};
        System.out.print(prefixSumFunctoin(nums));
    }
    static int prefixSumFunctoin(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // Calculate the prefix array
        int prefixArray[] = new int[nums.length];
        prefixArray[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
            prefixArray[i] = prefixArray[i-1] + nums[i];
        }


        for(int i =0; i< nums.length;i++){
            for(int j = i;j<nums.length;j++){
                currSum = i == 0 ? prefixArray[j] : prefixArray[j] - prefixArray[i-1];
                if(maxSum < currSum){
                    maxSum = currSum ;
                }
            }
        }
        return maxSum;
    }

}