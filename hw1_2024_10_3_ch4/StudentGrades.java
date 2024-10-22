package hw1_2024_10_3_ch4;

import java.util.Scanner;
public class StudentGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numStu = 5;
		String []names = new String[numStu];
		char []grade = new char [numStu];
		int []count = {0,0,0,0};
		
		System.out.printf("Enter five pair of students' names and grades%n");
		for(int i=0;i<numStu;i++) {
			System.out.printf("%nName: ");
			names[i] = sc.next();
			System.out.printf("Grade: ");
			grade[i] = sc.next().charAt(0);
			//System.out.printf("%s %c", names[i], grade[i]);
			switch(grade[i]) {
			case 'A':
				count[0]++;
				break;
			case 'B':
				count[1]++;
				break;
			case 'C':
				count[2]++;
				break;
			case 'D':
				count[3]++;
				break;
			default:
				System.out.printf("Error: grade formal error%n");
				System.exit(0);
				break;
			}
		}
		
		System.out.printf("%nThere have %d student got A%nThere have %d student got B%n", count[0], count[1]);
		System.out.printf("There have %d student got C%nThere have %d student got D%n", count[2], count[3]);
		sc.close();
	}

}
