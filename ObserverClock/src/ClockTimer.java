import java.util.Observable;
import java.util.Observer;

public class ClockTimer extends Observable{
	int hour = 0, minute = 0, second = 0;



	public ClockTimer(Observer o) {
		this.addObserver(o);
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void tick() {

		if(second<59) {
			second += 1;
		}
		else {
			second = 0;
			if(minute < 59) {
				minute += 1;
			}
			else {
				minute = 0;
				if(hour < 23) {
					hour += 1;
				}
				else {
					hour = 0;
				}
			}

		}
		this.setChanged();
		this.notifyObservers();
	}

}
