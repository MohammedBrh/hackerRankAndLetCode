import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Solution1 {
    
    public static void miniMaxSum(List<Integer> arr) {
    int maxSum =0;
    int minSum = arr.stream()
                     .mapToInt(Integer::intValue)
                     .sum();;
    for(int i =0;i< arr.size();i++){
        int indexToSkip = i;
        List<Integer> newList = IntStream.range(0, arr.size())
        .filter(j -> j != indexToSkip)
        .mapToObj(arr::get)
        .collect(Collectors.toList());;
        int sum = newList.stream()
                     .mapToInt(Integer::intValue)
                     .sum();
            System.err.println("arr :"+i+"**"+arr.get(i)+" ="+sum);
                     if(sum > maxSum)
                     maxSum = sum;
                     if(sum < minSum)
                     minSum = sum;
        }
    System.out.print(minSum +" "+ maxSum);
    }
    public static void main(String[] args){
        List<Integer> items = Arrays.asList(1 ,2 ,3 ,4 ,5);
        miniMaxSum(items);
    }
}
