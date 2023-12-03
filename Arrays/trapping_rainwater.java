public class trapping_rainwater{
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.print(trappingRainwaterCalculation(height));
    }
    static int trappingRainwaterCalculation(int height[]){
        int n = height.length;
        int trappedWater = 0;
        // Helper array 
        // 1. LeftMaxArray 
        int leftMaxArray[] = new int[n];
        leftMaxArray[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMaxArray[i] = Math.max(height[i],leftMaxArray[i-1]);
        }
        // 2. RightMaxArray
        int rightMaxArry[] = new int[n];
        rightMaxArry[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightMaxArry[i] = Math.max(height[i],rightMaxArry[i+1]);
        }
        // calculate the waterlevel
        for(int i =0;i < n ;i++){
            int waterlevel = Math.min(leftMaxArray[i],rightMaxArry[i]);
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }
}