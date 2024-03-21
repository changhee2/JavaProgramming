package week3;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름,도시,나이,체중,독신여부");
		Scanner Scanner = new Scanner(System.in);
		
		String name = Scanner.next();
		System.out.print("이름은"+ name + "김창희");
		
		String city = Scanner.next();
		System.out.print("도시는"+ city + "천안");
		
		int age = Scanner.nextInt();
		System.out.print("나이는"+ age + "24");
		
		double weight= Scanner.nextDouble();
		System.out.print("체중은"+ weight + "73");
		
		boolean isSingle = Scanner.nextBoolean();
		System.out.println("독신 여부는 "+ isSingle+ "f");
		Scanner.close();
		
	}

}
