public class rotated_sorted_array_search{
    public static void main(String args[]){
        int nums[] = {4,5,6,7,8,9,1,2,3};
        int target = 12;
        int targetIndex = search(nums,target);
        System.out.print(targetIndex);
    }
    static int search(int nums[],int target){
        int min = searchSmallest(nums);
        // now let's find the element in sorted left array where start = min , end = nums.length-1
        if(nums[min] <= target && target <= nums[nums.length-1]){
           return search(nums,min,nums.length-1,target);
        }else{
           return search(nums,0,min,target);
        }
    }
    static int searchSmallest(int nums[]){
        int start = 0;
        int end = nums.length -1;
        while (start < end){
            int mid = start + (end -start)/2;
            if(nums[mid] > nums[end]){
                start = mid + 1;
            }else end = mid;
        }
        return start;
    }
    static int search(int nums[], int start, int end,int target){
            while(start<=end){
                int mid = (start + end) / 2;
                if(nums[mid] == target){
                    return mid;
                }else if(nums[mid] > target){
                    end = mid -1;
                }else{
                start = mid + 1;
            }
                   
        }
     return -1;
    }
}