package sxinchuan;

public class TestInnerClass {
	
	
	public static void main(String[] args) {
//		new Test().new Test2().print();
//		new Test().new Test2().new Test3().print();
		
		String url = " http://127.0.0.1:9000/ibot-robot-uap/robot-sgcc/services/robotService";
		System.out.println(url.substring(0, url.indexOf("robot-sgcc")));
	}
	
	
	public class Test2{
		public void print() {
			System.out.println("这是一个内部类");
		}
		public class Test3{
			public void print() {
				System.out.println("这是一个内部类的内部类");
			}
		}
	}
}
