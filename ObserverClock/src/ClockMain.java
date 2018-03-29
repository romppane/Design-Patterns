
public class ClockMain {

	public static void main(String[] args) {

		DigitalClock digitalclock = new DigitalClock();
		ClockTimer clocktimer = new ClockTimer(digitalclock);
		
		for(int i = 0; i<86401; i++) {
			clocktimer.tick();
		}
	}

}
