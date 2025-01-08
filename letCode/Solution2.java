class Solution2 {
    public static int maxArea(int[] height) {
        int maxResult = 0;
        for(int i=0;i<height.length - 1;i++){
            for(int j=i+1;j<height.length;j++){
                int fac = (height[i] > height[j]) ? height[j] : height[i];
                int newVal = fac*(j-i);
                maxResult = (newVal > maxResult)? newVal: maxResult;
            }
        }
        return maxResult;
    }
    public static void main(String[] args){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}