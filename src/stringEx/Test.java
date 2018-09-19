package stringEx;

public class Test {

	public static void main(String[] args) {
		String orgNo = null;
		System.out.println(resetOrgNo(orgNo));
	}

	private static String resetOrgNo(String orgNo) {
		if(orgNo==null){
			orgNo="0";
		}
		StringBuffer buffer = new StringBuffer(orgNo);
		
		//替换北京下面的区
		if(orgNo.startsWith("114")){
			buffer.replace(0,5, "11102");
		}
		//替换天津下面的区
		if(orgNo.startsWith("124")){
			buffer.replace(0,5, "12101");
		}
		//替换重庆下面的区
		if(orgNo.startsWith("314")){
			buffer.replace(0,5, "31102");
		}
		//替换上海下面的区
		if(orgNo.startsWith("504")){
			buffer.replace(0,5, "50101");
		}
		return buffer.toString();
		
	}
}
