package week5;

import java.util.Scanner;

public class Gradingswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade;
		Scanner Scanner =new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100): ");
		int score=Scanner.nextInt();
		switch(score/10) {
		case 10 :
		case 9 :
			grade="A";
			break;
		case 8 :
			grade ="B";
			break;
		case 7 :
			grade ="C";
			break;
		case 6 :
			grade ="D";
			break;
		default:
			grade ="F";
	}
		System.out.println("학점은"+grade+"입니다.");
		
		Scanner.close();

	}

}
