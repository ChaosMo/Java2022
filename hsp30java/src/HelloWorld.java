/**
 * @author [author]
 * @version [version-text]
 */
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("helllo world");
	}
}

class StringToBasicDetail{

	public static void main(String[] args) {
		String str1 = "123"; //转成 int
		int n1 = Integer.parseInt(str1);
		System.out.println(n1);
	}
}

class TernaryOperator {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 99;
		int result = a > b ? a++ : b--;
		System.out.println("result=" + result);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}