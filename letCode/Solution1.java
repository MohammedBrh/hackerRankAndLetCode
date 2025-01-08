class Solution1 {
    public static String longestPalindrome(String s) {
        String result = "";
        if(s.length() >1000)
        return "##";
        if(s.length() < 2 || s.equals(new StringBuilder(s).reverse().toString()))
        return s;
        for(int i = 0; i < s.length();i++){
            for(int j = i+1; j < s.length()+1 ; j++ ){
                String subStr = s.substring(i,j);
                String r = new StringBuilder(subStr).reverse().toString();
               if(subStr.equals(r) && result.length() < subStr.length())
                result = subStr;
            }
        }
        return result;
    }
    public static void main(String[] args ){
        System.out.println(longestPalindrome("ac"));
    }
}