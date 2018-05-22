
public class Person implements Observer {

    private AlarmClock alarmClock;
    private int wakeUpHours, wakeUpMinutes, wakeUpSeconds;
    private String name;
	
    public Person(String a_name, AlarmClock alarmClock2) {
        name = a_name;
        alarmClock = alarmClock2;
        setWakeUpTime(alarmClock.getAlarmTime());
    }

    //print observer going to bed
    public void goToBed() {
        System.out.println(name + " is going to bed...");
    }

    //print wake up message
    public void wakeUp() {
        System.out.println("Time: " + alarmClock.getTime() + " and " + name + " has woken up!");
    }

    
    //perform correct function in response to alarm clock
    public void update() {
        if (alarmClock.alarmReached()){
            wakeUp();
        }
        
        if (!alarmClock.getAlarmTime().equals(wakeUpHours + ":" + wakeUpMinutes + ":" + wakeUpSeconds)) {
            setWakeUpTime(alarmClock.getAlarmTime());
    
       }
    }
    
    public void getWakeUpTime() {
        System.out.println(name + " will wake up at the time of: " + wakeUpHours + ":" + wakeUpMinutes + ":" + wakeUpSeconds);
    }
    
    //set the observers wake up time
    public void setWakeUpTime(String wakeUpTime) {
        wakeUpHours = Integer.parseInt(wakeUpTime.split(":")[0]);
        
        wakeUpMinutes = Integer.parseInt(wakeUpTime.split(":")[1]);
        
        wakeUpSeconds = Integer.parseInt(wakeUpTime.split(":")[2]);
    }

}
