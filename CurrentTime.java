
package current.time;
 
public class CurrentTime {
    public static void main(String[] args) {
       
       long allMilliseconds= System.currentTimeMillis();
       long allseconds=allMilliseconds/1000;
       long currentseconds=allseconds%60;
       long allMinutes=allseconds/60;
       long currentMinutes=allMinutes%60;
       long allHours=allMinutes/60;
       long currenthour=allHours%24;
        System.out.println("Current time is="+(currenthour)+":"+(currentMinutes)+":"+currentseconds+" GMT");
        
    }
    
}
