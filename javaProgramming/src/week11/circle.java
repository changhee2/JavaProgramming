package week11;

public class circle {

	
		// TODO Auto-generated method stub
		int radius;
		String name;
		public circle(){}
		
		public double getArea() {
			return 3.14*radius*radius;
		}
		public static void main(String[] args) {
			circle pizza;
			pizza= new circle();
			pizza.radius=10;
			pizza.name="자바피자";
			double area=pizza.getArea();
			System.out.println(pizza.name+"의 면적은 "+area);
			
			circle donut= new circle();
			donut.radius=2;
			donut.name="자바도넛";
			area=donut.getArea();
			System.out.println(donut.name+"의 면적은 "+area);
			
		}
		
	}
			
	

