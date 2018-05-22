import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
	
    List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer o){
        observerList.add(o);
    }

    public void deleteObserver(Observer o){
        observerList.remove(o);
    }

    public void notifyObserver(){
        for (Observer observer: observerList){
            observer.update();
        }
    }
}
