package javaBasics;

public class Day4_GitConcept {
	
	String code_status;
	
	public Day4_GitConcept(String Status) {
		code_status = Status;
		System.out.println("Code status is :" +code_status);
	}

	public static void main(String[] args) {
		Day4_GitConcept obj= new Day4_GitConcept("Commit");

	}

}
