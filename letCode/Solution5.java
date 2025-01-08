import java.util.*;
class Solution5 {
    public static int[][] setZeroes(int[][] matrix) {
       List<String> indexList = new ArrayList<>();
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j] == 0)
            indexList.add((i+","+j));
        }
       }
       String[] indexs = indexList.toArray(new String[0]);
       for(int o =0;o<indexs.length ; o++){
        String[] parts = indexs[o].split(",");
        int k = Integer.parseInt(parts[0].trim());
        int l = Integer.parseInt(parts[1].trim());
        
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            if(i == k || j == l)
            matrix[i][j] = 0;
        }
       }
       }
       return matrix;
    }
    public static void main(String[] args){
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        matrix = setZeroes(matrix);
        for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
        System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
       }
    }

}