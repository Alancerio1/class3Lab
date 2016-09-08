/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author alancerio18
 */
public class WelcomeService {
private String time(){
    Calendar cal = Calendar.getInstance();

    String time = "Didn't get a time";
    
    if(cal.get(Calendar.HOUR_OF_DAY )<= 24 && cal.get(Calendar.HOUR_OF_DAY) >= 16){
        time ="evening";
    }else if(cal.get(Calendar.HOUR_OF_DAY )<= 15 && cal.get(Calendar.HOUR_OF_DAY) >= 9){
        time="afternoon";
    }else if(cal.get(Calendar.HOUR_OF_DAY )<= 8 && cal.get(Calendar.HOUR_OF_DAY) >= 1){
        time="morning";
    }
    return time;
  }
     
     public String calculatedTime(String name){
         return "Good" + time() +  " " + name;
     }
}
