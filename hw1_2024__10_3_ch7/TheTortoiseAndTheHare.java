package hw1_2024__10_3_ch7;

import java.security.SecureRandom;
public class TheTortoiseAndTheHare {

	public static void main(String[] args) {
			SecureRandom randomNumbers = new SecureRandom();
			int tortoise = 1, hare = 1, percentage;
			while(true) {
				//tortoise
				percentage = randomNumbers.nextInt(10) + 1;
				if(percentage>=1 && percentage<=5) {tortoise += 3;}
				if(percentage>=6 && percentage<=7) {tortoise -= 6;}
				if(percentage>=8 && percentage<=10) {tortoise += 1;}
				if(tortoise < 1) {tortoise = 1;}
				//hare
				percentage = randomNumbers.nextInt(10) + 1;
				if(percentage>=1 && percentage<=2) {hare += 0;}
				if(percentage>=3 && percentage<=4) {hare += 9;}
				if(percentage==5) {hare -= 12;}
				if(percentage>=6 && percentage<=8) {hare += 1;}
				if(percentage>=9 && percentage<=10) {hare -= 2;}
				if(hare < 1) {hare = 1;}
				//70-position line
				for(int i=1;i<71;i++) {
					if(tortoise == hare && hare == i) {
						System.out.printf("OUCH");
						break;
					}else if(tortoise == i) {System.out.printf("T");}
					else if(hare == i) {System.out.printf("H");}
					else {System.out.printf("-");}
				}
				System.out.printf("%n");
				//winner
				if(tortoise >= 70 && hare >= 70) {
					System.out.printf("It's a tie.%n");
				}
				if(tortoise>=70) {
					System.out.printf("TORTOISE WINS!!! YAY!!!%n");
					break;
				}
				if(hare >= 70) {
					System.out.printf("Hare wins. Yuch.%n");
					break;
				}
			}
		}

}
