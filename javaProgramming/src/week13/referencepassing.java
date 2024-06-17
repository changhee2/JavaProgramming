package week13;

public class referencepassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circles pizza =new Circles(10);
		
		increase(pizza);
		
		System.out.println(pizza.radius);
	}
		static void increase(Circles m) {
		
		m.radius++;
		
		
	}

}
    class Circles {
    double radius;
    Circles(double radius) {
        this.radius = radius;
    }
}