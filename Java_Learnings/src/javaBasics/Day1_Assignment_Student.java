package javaBasics;

public class Day1_Assignment_Student {

	int rollNumber;
	int age;

	public void display1() {
		System.out.println("Welcome to all of you");
	}

	public void display2() {
		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) {
		Day1_Assignment_Student obj = new Day1_Assignment_Student();
		obj.display1();
		obj.display2();
		int rn = obj.rollNumber = 201;
		int ag = obj.age = 30;
		System.out.println("Student roll Number is : " + rn);
		System.out.println("Student Age is : " + ag);
	}
}
