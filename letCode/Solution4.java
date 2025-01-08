import java.util.Arrays;
class Solution4 {
    public static int maximumGap(int[] nums) {
        if (1 > nums.length || nums.length > 105) {
            return 0;
        }
         Arrays.sort(nums);
        int maxDifr = 0;
        for(int i=0;i< nums.length-1;i++){ 
            int newDifr =(nums[i+1] -nums[i]);
            maxDifr = ( newDifr> maxDifr )? newDifr :maxDifr;
        }
        return maxDifr;
    }
    public static void main(String[] args){
        int[] data = {3};
        System.out.println(maximumGap(data));
    }
}