package test;

import java.util.Scanner;

public class Test_Scanner {
	String name;
	String fname;
	
	public String getArea() {
		return name + fname;
	}
	
	public static void main(String[] args) {
		Test_Scanner test = new Test_Scanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> ");
		
		test.name = scanner.next();
		test.fname = scanner.next();
		
		System.out.println("내 이름은 : "+ test.getArea());
		
	}

}
