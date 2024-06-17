package week15;
class point{
	private int x,y;
	public void set(int x, int y) {
		this.x=x; this.y=y;
	}
	public void showpoint() {
		System.out.println("("+x+","+y+")");
	}
}

class colorpoint extends point{
	private String color;
	public void setcolor(String color) {
		this.color= color;
	}
	public void showcolorpoint() {
		System.out.print(color);
		showpoint();
	}
}
public class classpointEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point p=new point();
		p.set(1,2);
		p.showpoint();
		
		colorpoint cp=new colorpoint();
		cp.set(3,4);
		cp.setcolor("red");
		cp.showcolorpoint();
	}
}
		
		
		

	


