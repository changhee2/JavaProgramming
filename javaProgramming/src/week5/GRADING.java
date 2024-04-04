package week5;

import java.util.Scanner;

public class GRADING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade;
		Scanner Scanner =new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100): ");
		int score=Scanner.nextInt();
		if(score>=90)
		grade="A";
		else if(score>=80)
		grade ="B";
		else if(score>=70)
		grade ="C";
		else
		grade ="F";
		System.out.println("학점은"+grade+"입니다.");
		
		Scanner.close();
		

	}

}
