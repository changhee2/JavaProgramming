package week5;

import java.util.Scanner;

public class successorfail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오.");
		int score =Scanner.nextInt();
		if(score>=80) {
		 System.out.println("축하합니다! 합격입니다.");
		}else {
		System.out.println("아쉽습니다! 불합격입니다.");
		}
		Scanner.close();
		

	}

}
