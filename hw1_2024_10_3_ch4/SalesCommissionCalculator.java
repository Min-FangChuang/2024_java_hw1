package hw1_2024_10_3_ch4;

import java.util.Scanner;

public class SalesCommissionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double [] value= {239.99, 129.75, 99.95, 350.89};
		double  sold = 0;
		int indx;
		
		System.out.printf("The values of items%n%nItem    Value%n");
		for(int i=0; i < value.length; i++) {
			System.out.printf("%d       %6.2f%n", i+1, value[i]);
		}
		
		System.out.printf("%n%nThe items sold for last week: ");
		while(true) {
			indx = sc.nextInt()-1;
			if(indx<0 || indx>=value.length) {
				System.out.printf("Item not exist%n");
				break;
			}
			sold +=value[indx];
			
			sc.nextLine();
			System.out.printf("More?  (y/n) >>");
			if(sc.next().charAt(0) =='n') {break;}
			System.out.printf("next :");
		}
		System.out.printf("%nEarn : %.2f", 200+0.09*sold);
		sc.close();
	}

}
