package sxinchuan;

public class Test {
	
	
	public static void main(String[] args) {
		new Test().new Test2().print();
		new Test().new Test2().new Test3().print();
	}
	
	
	public class Test2{
		public void print() {
			System.out.println("����һ���ڲ���");
		}
		public class Test3{
			public void print() {
				System.out.println("����һ���ڲ�����ڲ���");
			}
		}
	}
}
