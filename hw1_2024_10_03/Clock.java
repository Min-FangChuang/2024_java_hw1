package hw1_2024_10_03;

public class Clock {
	private int hour, minute, second;

	public Clock(int hour, int minute, int second) {
		if(hour > 23) {hour=0;}
		if(minute >59) {minute=0;}
		if(second > 59) {second=0;}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour > 23) {hour=0;}
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute >59) {minute=0;}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second > 59) {second=0;}
		this.second = second;
	}
	
	public void displayTime() {
		if(hour < 10) {System.out.printf("%d", 0);}
		System.out.printf("%d:", hour);
		if(minute < 10) {System.out.printf("%d", 0);}
		System.out.printf("%d:", minute);
		if(second < 10) {System.out.printf("%d", 0);}
		System.out.printf("%d", second);
		
	}

}
