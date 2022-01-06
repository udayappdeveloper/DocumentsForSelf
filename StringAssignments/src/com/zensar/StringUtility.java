package com.zensar;

public class StringUtility {

	public static void main(String[] args) {
		// FirstLetterCapital();
		// concatTest();
		// stringBufferConcatTest();
		// checkStringValues();
		// checkNewStringValues();
		// checkNewStringBufferValues();
		// stringConstantPoolCheck();
		// stringConstantPoolCheck1();

		// stringConcatCheck();
		// stringConcatCheck2();

		youcannotchangemeExample();
		charArrayToString();
	}

	public static void FirstLetterCapital() {

		System.out.println("**********First Letter Capital**********");

		String a = "uday";
		String s = a.substring(0, 1).toUpperCase() + a.substring(1);
		System.out.println(s);
	}

	public static void concatTest() {

		System.out.println("**********String Concate Test**********");
		String s = new String("uday");
		s.concat("kallur");
		String s1 = s.concat("Kalluri");
		System.out.println(s);
		System.out.println(s1);

	}

	public static void stringBufferConcatTest() {

		System.out.println("*************String Buffer Concate Test*********");
		StringBuffer sb = new StringBuffer("uday");
		sb.append("kalluri");
		System.out.println(sb);

	}

	public static void checkStringValues() {

		System.out.println("*************Checking String values*********");
		String s1 = "Hello";
		String s = "Hello";
		String s2 = new String("Hello");

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

		System.out.println(s.equals(s1));
		System.out.println(s == s1);

		System.out.println("HashCode:" + s.hashCode() + " \t s1:" + s1.hashCode());

	}

	public static void checkNewStringValues() {
		System.out.println("*************Checking New String values*********");
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

	}

	public static void checkNewStringBufferValues() {

		System.out.println("*************Checking New String Buf values*********");
		StringBuffer s1 = new StringBuffer("Hello");
		StringBuffer s2 = new StringBuffer("Hello");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

	}

	public static void stringConstantPoolCheck() {

		System.out.println("*************Checking Constant Pool check*********");
		String s1 = new String("Hello");
		String s2 = "Hello";

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

	public static void stringConstantPoolCheck1() {

		System.out.println("*************Checking Constant Pool check*********");
		String s1 = new String("Hello");
		String s2 = new String("Hello");

		String s3 = "Hello";
		String s4 = "Hello";

		System.out.println(s1 == s2);
		System.out.println(s3 == s4);

	}

	public static void stringConcatCheck() {

		String s1 = new String("Uday");
		s1.concat("Kumar");
		s1 = s1.concat("Kalluri");
		System.out.println(s1);

	}

	public static void stringConcatCheck2() {

		String s1 = new String("Spring"); // 1 heap 1 scp
		s1.concat("Fall");// 1 in heap ,1 in scp
		String s2 = s1.concat("Winter");// 1in scp , 1 in heap
		s2.concat("Summer");// 1 in scp, 1 in heap
		System.out.println(s1);// spring
		System.out.println(s2);// spring winter

	}

	public static void youcannotchangemeExample() {

		String s1 = new String("You can not change me");
		String s2 = new String("You can not change me");
		// System.out.println(s1==s2);//false
		String s3 = "You can not change me";
		// System.out.println(s1==s3);//false

		String s4 = "You can not change me";
		// System.out.println(s3==s4);//true

		String s5 = "You can not" + " change me";
		System.out.println(s4 == s5);// false here literals are different

		String s6 = "You can not";
		String s7 = s6 + " change me";
		System.out.println(s4 == s7);// true

		final String s8 = "You can not";
		String s9 = s8 + " change me";
		System.out.println(s4 == s9);// true

	}
	
	public static void charArrayToString() {
		
		char[] a= {'J','A','V','A'};
		String s=new String(a);
		System.out.println(s);
		
		byte[] b= {97,98,99};
		
		String s1=new String(b);
		System.out.println(s1);
	}

}
