package sxinchuan;

public class Test {
	public static void main(String[] args) {
		String consNo = "1102034012";
		String consNo4Des = DesensitizeUtil.around(consNo, 3, 3);
		System.out.println(consNo4Des);
	}
}
