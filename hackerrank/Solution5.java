import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Solution5 {

    public static int divisibleSumPairs(int k, List<Integer> ar) {
        int counter =0;
    // Write your code here
    for(int i =0; i< ar.size() - 1;i++){
        for(int j = i + 1; j< ar.size();j++){
            if((ar.get(i)+ar.get(j)) % k == 0)
            counter++;
        }
    }
        return counter;
}

public static void main(String[] args){        
        List<Integer> items = Arrays.asList(1, 3, 2, 6, 1, 2);
        System.out.println(divisibleSumPairs(3,items));
}
}
