package HomeWork;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a=5,b=10;
		System.out.println("before swapping -->");
		System.out.println("value of a= "+a + " value of b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping -->");
		System.out.println("value of a= "+a + " value of b= "+b);
	}
}
