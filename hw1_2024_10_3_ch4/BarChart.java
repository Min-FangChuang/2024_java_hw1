package hw1_2024_10_3_ch4;

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] num = new int [5];
		int err = -1;
		System.out.printf("Enter five numbers between 1 and 30:");
		for(int i=0; i<5;i++) {
				num[i]=sc.nextInt();
				if(num[i]>0 && num[i]<=30) {continue;}
				err = 1;
		}
		
		if(err == -1) {
			for(int i=0;i<5;i++) {
				for(int j=0;j<num[i];j++) {
					System.out.printf("*");
				}
				System.out.printf("%n");
			}
		}else {
			System.out.printf("Error: have number not in the allow area");
		}
		sc.close();
	}
	
}
