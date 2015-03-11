package MostFreeTime;
import java.util.*;

/*
 Using the Java language, have the function MostFreeTime(strArr) read the strArr parameter 
 being passed which will represent a full day and will be filled with events that span from time 
 X to time Y in the day. The format of each event will be hh:mmAM/PM-hh:mmAM/PM. For example, strArr may be
 ["10:00AM-12:30PM","02:00PM-02:45PM","09:10AM-09:50AM"]. Your program will have to output the longest amount of 
 free time available between the start of your first event and the end of your last event in the format: hh:mm. 
 The start event should be the earliest event in the day and the latest event should be the latest event in the day.
 The output for the previous input would therefore be 01:30 (with the earliest event in the day starting at 09:10AM and 
 the latest event ending at 02:45PM).
 The input will contain at least 3 events and the events may be out of order. 
 */
class Function {

    String MostFreeTime(String[] strArr) {

        ArrayList<Integer> activityArrayInMinutes = new ArrayList<>();
        for (String event : strArr) {
            activityArrayInMinutes.add(ConvertTimeToMinutes(event.split("-")[0]));
            activityArrayInMinutes.add(ConvertTimeToMinutes(event.split("-")[1]));
        }
        Collections.sort(activityArrayInMinutes);
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < activityArrayInMinutes.size(); i++) {
            if (i % 2 == 0) {
                int freeTime = activityArrayInMinutes.get(i) - activityArrayInMinutes.get(i - 1);
                max = Math.max(freeTime, max);
            }
        }

        return ConvertMinutesToHours(max);
    }

    int ConvertTimeToMinutes(String time) {
        if (time.substring(time.length() - 2).equalsIgnoreCase("AM")) {
            int hour = Integer.parseInt(time.substring(0, time.indexOf(":")));
            int minute = Integer.parseInt(time.substring(time.indexOf(":")+1, time.length()-2));
            if (hour == 12) {
                return minute;
            }
            return (hour * 60) + minute;
        } else {//PM
            int hour = Integer.parseInt(time.substring(0, time.indexOf(":")));
            int minute = Integer.parseInt(time.substring(time.indexOf(":") + 1, time.length()-2));
            if (hour == 12) {
                return (hour * 60) + minute;
            }
            return ((hour + 12) * 60) + minute;
        }
    }

    String ConvertMinutesToHours(int max) {
        if (max % 60 == 0) {
            int hour = max / 60; 
            return String.format("%02d",hour) + ":00";
        } else {
            int hour = max / 60;
            int minute = max - (hour * 60);
            return String.format("%02d",hour) + ":" + String.format("%02d",minute);
        }
    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.MostFreeTime(s.nextLine())); 
        System.out.print(c.MostFreeTime(new String[]{"12:15PM-02:00PM","09:00AM-12:11PM","02:02PM-04:00PM"}));
    }

}
