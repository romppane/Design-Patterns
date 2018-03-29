import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
	private ClockTimer clocktimer;

	@Override
	public void update(Observable o, Object arg) {
		clocktimer = (ClockTimer) o;
		draw();
	}

	public void draw() {
		int hour = clocktimer.getHour();
		int minute = clocktimer.getMinute();
		int second = clocktimer.getSecond();

		System.out.println("The time is: "+hour+":"+minute+":"+second);



	}

}
