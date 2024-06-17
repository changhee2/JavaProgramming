package week11;

public class Books {


		String title;
		String author;
		
		void show() {System.out.println(title + " " + author); }
		
		public Books() {
			this("", "");
			System.out.println("생성자 호출됨");
		}
		
		public Books(String title) {
			this(title, "작자미상");
		}
		
		public Books(String title, String author) {
			this.title = title;
			this.author = author;
		}
			
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Books littleprince = new Books("어린왕자","생텍쥐페리");
			Books lovestory =new Books("춘향전");
			Books emptystory =new Books();
			lovestory.show();
	}

}
