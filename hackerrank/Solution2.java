import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Solution2 {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    // Wr// Find the maximum element
        Optional<Integer> maxElement = candles.stream().max(Integer::compareTo);
        int count = 0;
        // Count the occurrences of the maximum element
        if (maxElement.isPresent()) {
            count = (int) candles.stream()
            .filter(number -> number.equals(maxElement.get()))
            .count();
            }
            return count ;
    }
    public static void main(String[] args){
        List<Integer> items = Arrays.asList(1 ,5,5 ,3 ,4 ,5);
        System.out.println(birthdayCakeCandles(items));
    }

}
