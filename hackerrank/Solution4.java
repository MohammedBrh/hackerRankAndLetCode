import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution4 {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        for(int i=0; i< grades.size();i++){
            int grade = grades.get(i);
            if(grade>=38){
                if (((grade+1) % 5) == 0)
                    grade += 1;
                
                if(((grade+2) % 5) == 0)
                grade += 2; 
            }
            grades.set(i, grade);
        }
        return grades;
    }
    public static void main(String[] args){
        
        List<Integer> items = Arrays.asList(73,67,38,33);
        System.out.println(gradingStudents(items));
    }

}
