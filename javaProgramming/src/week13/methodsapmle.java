package week13;

public class methodsample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodsample a = new methodsample();
		int i= a.getsum(1,2);
		int j= a.getsum(1,2,3);
		double k = a.getsum(1.1,2.2);
		   String s =a.getsum(1.1,2);
	}
	
	public int getsum(int i, int j) {
			return i+j;
	}
	public int getsum(int i, int j, int k) {
			return i+j+k;
	}
	public double getsum(double i,int j) {
			return i+j;

	}
}

	
