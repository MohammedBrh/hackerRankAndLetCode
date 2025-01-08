class Solution3 {
    public static int reverse(int x) {
        if(x >= Integer.MAX_VALUE || x < Integer.MIN_VALUE)
        return 0;
     boolean isNegativ = (x<0);
        int num =Math.abs(x);
        
        String rev = new StringBuilder(Integer.toString(num)).reverse().toString();
        try {
        int reversedNum = Integer.parseInt(rev);
        return isNegativ ? -reversedNum : reversedNum;
            } catch (NumberFormatException e) {
                return 0;
            }
    }
    public static void main(String[] args){
        System.out.println(reverse(-5123));
    }
}