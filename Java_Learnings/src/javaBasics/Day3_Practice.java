package javaBasics;

public class Day3_Practice {
	
	public Day3_Practice() {
		System.out.println("Default Constructor");
	}
	
	public Day3_Practice(int a) {
		System.out.println("One Parameterize Constructor with input as  : "+a );	
	}
	
	public Day3_Practice(String Name, int age) {
		System.out.println("Two Parameterize Constructor");
		System.out.println("Name :" +Name);
		System.out.println("Age: "+age);
	}
	
	public static void main(String[] args) {
		Day3_Practice obj = new Day3_Practice();
		Day3_Practice obj1= new Day3_Practice(121);
		Day3_Practice obj2= new Day3_Practice("Abhishek",32);
	}

}
