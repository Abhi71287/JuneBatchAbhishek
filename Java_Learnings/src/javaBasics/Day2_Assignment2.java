package javaBasics;

public class Day2_Assignment2 {
//	Assignment2 :(((((10*2)-2)+2)-2)/2)
	public int sum(int a, int b) {
		int c = a + b;
		System.out.println("Sum is : " + c);
		return c;
	}

	public int sub(int a1, int b1) {
		int c1 = a1 - b1;
		System.out.println("Substraction is : " + c1);
		return c1;
	}

	public int multi(int a2, int b2) {
		int c2 = a2 * b2;
		System.out.println("Multiplication is : " + c2);
		return c2;
	}

	public int div(int a3, int b3) {
		int c3 = a3 / b3;
		System.out.println("Divison is : " + c3);
		return c3;
	}

	public static void main(String[] args) {
		Day2_Assignment2 Obj = new Day2_Assignment2();
		int mul1 = Obj.multi(10, 2);
		int sub1 = Obj.sub(mul1, 2);
		int sum3 = Obj.sum(sub1, 2);
		int sub2 = Obj.sub(sum3, 2);
		int div1 = Obj.div(sub2, 2);
		System.out.println("Final result for Assignment 2 (((((10*2)-2)+2)-2)/2) is : " + div1);
	}

}
