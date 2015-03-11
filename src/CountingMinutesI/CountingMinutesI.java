package CountingMinutesI;
import java.util.*; 


/**
 *
 * @author Hilary Brobbey
 * Have the function CountingMinutesI(str) take the str parameter being passed 
 * which will be two times (each properly formatted with a colon and am or pm) 
 * separated by a hyphen and return the total number of minutes between the two times. The time will be in a 12 hour clock format. 
 * For example: if str is 9:00am-10:00am then the output should be 60. If str is 1:00pm-11:00am the output should be 1320. 
 */


class Function {  
  int CountingMinutesI(String str) { 
      
      String startTime = (str.split("-"))[0].trim();
      String endTime = (str.split("-"))[1].trim();
      
      //System.out.println(startTime);
      //System.out.println(endTime);      
      //System.out.println(ConvertToMinutes(endTime));
      //System.out.println(ConvertToMinutes(startTime));
      
      return ConvertToMinutes(endTime) > ConvertToMinutes(startTime) ? 
              ConvertToMinutes(endTime) - ConvertToMinutes(startTime) : (ConvertToMinutes(endTime) + 1440) - ConvertToMinutes(startTime);
      
    
  }
  
  int ConvertToMinutes(String t){
      //System.out.println(t.substring(t.length()-2));
      //System.out.println(t.substring(0, t.indexOf(":")));
      //System.out.println(t.substring(t.indexOf(":")+1,t.length()-2));
      if ((t.substring(t.length()-2)).equals("pm")){
           if ((t.substring(0,2)).equals("12")){
               return (Integer.parseInt(t.substring(0, t.indexOf(":")))) * 60 + Integer.parseInt(t.substring(t.indexOf(":")+1, t.length()-2));
           } 
          
          return (Integer.parseInt(t.substring(0, t.indexOf(":"))) + 12) * 60 + Integer.parseInt(t.substring(t.indexOf(":")+1, t.length()-2));
      }
      else{
          if ((t.substring(0,2)).equals("12")){
              return Integer.parseInt(t.substring(t.indexOf(":")+1, t.length()-2));
          }
          return Integer.parseInt(t.substring(0, t.indexOf(":"))) * 60 + Integer.parseInt(t.substring(t.indexOf(":")+1, t.length()-2));
      }
      
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.CountingMinutesI(s.nextLine())); 
    System.out.print(c.CountingMinutesI("1:00pm-11:00am")); 
  }   
  
}           
