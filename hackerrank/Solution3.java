import java.io.*;
class Solution3 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    String[] times = s.split(":");
    int hour = Integer.parseInt(times[0]);
    int minutes = Integer.parseInt(times[1]);
    int second = Integer.parseInt(times[2].substring(0,2));
    if(s.contains("PM")){
        if(hour != 12)
        hour+= 12;
    }else{
        hour = (hour == 12) ? 00: hour;
    }
    return String.format("%02d:%02d:%02d", hour, minutes, second);
    }

public static void main(String[] args){
    System.out.println("12:45:54PM ==> "+timeConversion("12:45:54PM"));
    System.out.println("12:40:22AM ==> "+timeConversion("12:40:22AM"));
    System.out.println("07:05:45PM ==> "+timeConversion("07:05:45PM"));
}
}
