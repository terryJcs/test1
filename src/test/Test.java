package test;

/**
 * @author TerryJ
 * 
 *         创建时间：2013-6-7 上午10:36:39
 * 
 */

public class Test {

	private static String parseUri(String requestString) {
		int index1, index2;
		index1 = requestString.indexOf(' ');
		System.out.println("index1=="+index1);
		if (index1 != -1) {
			index2 = requestString.indexOf(' ', index1 + 1);
			System.out.println("index2=="+index2);
			if (index2 > index1)
				return requestString.substring(index1 + 1, index2);
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(parseUri("fs fs"));
	}
}
