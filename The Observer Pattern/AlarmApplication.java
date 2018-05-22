public class AlarmApplication {
	
    public static final int SECONDS_IN_DAY = 86400;
	
    public static void main(String[] args) {
            	
    	AlarmClock alarmClock = new AlarmClock();
        alarmClock.setAlarmTime(7, 30, 0);
        
        
        //Step 1
        //Set new person objects
        Person greg = new Person("Greg", alarmClock);
        Person mel = new Person("Mel", alarmClock);
        Person jack = new Person("Jack", alarmClock);
        Cron cron = new Cron(alarmClock);

        //step 2, 3, 4 
        //Greg to bed and set time
        alarmClock.addObserver(greg);
        greg.goToBed();
        greg.getWakeUpTime();

        //Mel to bed and set time
        alarmClock.addObserver(mel);
        mel.goToBed();
        mel.getWakeUpTime();

        //Jack to bed and set time
        alarmClock.addObserver(jack);
        jack.goToBed();
        jack.getWakeUpTime();

        //step 5
        alarmClock.addObserver(cron);

        alarmClock.setAlarmTime(5, 30, 30);

        for (int i=1; i<=SECONDS_IN_DAY; i++){
            alarmClock.tick();
            
        }

        alarmClock.deleteObserver(mel);
        alarmClock.deleteObserver(jack);
        
        alarmClock.deleteObserver(greg);

        alarmClock.deleteObserver(cron);
    }
}