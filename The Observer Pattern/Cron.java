public class Cron implements Observer{

	private AlarmClock alarmClock;
    private int alertTimeHours, alertTimeMinutes, alertTimeSeconds;

    Cron(AlarmClock an_alarmClock){
        alarmClock = an_alarmClock;
        
        alertTimeHours = 1;
        alertTimeMinutes = 23;
        alertTimeSeconds = 45;
    }

    //update method just like person class
    public void update() {
        if (alarmClock.getTime().equals(getAlertTime())){
            doTask();
            
        }
    }

    //return string of time Cron is set to do task
    private String getAlertTime(){
        return alertTimeHours + ":" 
        		+ alertTimeMinutes + ":" 
        		+ alertTimeSeconds;
    }

    //print task message
    private void doTask(){
        System.out.println("Time: "+ getAlertTime() +" is reached and Cron is doing something.");
    }
}
