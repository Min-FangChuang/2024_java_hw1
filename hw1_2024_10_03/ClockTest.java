package hw1_2024_10_03;

import java.util.Scanner;

public class ClockTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Clock clock = new Clock(23,59,59);
		clock.displayTime();
		System.out.printf("%nEnter the time (hh mm ss)>>");
		int h = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt();
		clock.setHour(h);
		clock.setMinute(m);
		clock.setSecond(s);
		clock.displayTime();
		sc.close();
	}
	
}
