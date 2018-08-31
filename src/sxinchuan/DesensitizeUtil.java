package sxinchuan;

import org.apache.commons.lang.StringUtils;
public class DesensitizeUtil {
	 /**
	  * ֻ��ʾ��һ�����֣���������Ϊ2���Ǻ�<���ӣ���**>
	  * @param fullName
	  * @param  index 1 Ϊ��indexλ
	  * @return
	  */
    public static String left(String fullName,int index) {
        if (StringUtils.isBlank(fullName)) {
            return "";
        }
        String name = StringUtils.left(fullName, index);
        return StringUtils.rightPad(name, StringUtils.length(fullName), "*");
    }

    /**
     * [���֤��] 110****58��ǰ�汣��3λ���ģ����汣��2λ����
     *
     * @param name
     * @param index 3
     * @param end 2
     * @return
     */
    public static String around(String name,int index,int end) {
        if (StringUtils.isBlank(name)) {
            return "";
        }
        if (StringUtils.length(name)<6) {
            return name;
        }
        return StringUtils.left(name, index).concat(StringUtils.removeStart(StringUtils.leftPad(StringUtils.right(name, end), StringUtils.length(name), "*"), "***"));
    }

    /**
     * [�̶��绰] ����λ����������<���ӣ�****1234>
     *
     * @param num
     * @return
     */
    public static String right(String num,int end) {
        if (StringUtils.isBlank(num)) {
            return "";
        }
        return StringUtils.leftPad(StringUtils.right(num, end), StringUtils.length(num), "*");
    }
    
}
