package com;

public class StringDemo {
	public static void main(String[] args) {
		// Strings can be created in two ways by using String class
		// 1.By using new Keyword
		// 2.Without Using new Keyword
		createStringWithNew();
		System.out.println("///////////////****************");
		createStringWithoutNew();
	}

	//without Using New Keyword
	private static void createStringWithoutNew() {
		String s = "Lokesh";
		String s2 ="Lokesh";

		// Strings can be compared in 4 ways
		// 1.compare references
		if (s == s2)
			System.out.println("references are equal");
		else
			System.out.println("references are unequal");
		// 2.compare string contents
		if (s.equals(s2))
			System.out.println("contents are equal");
		else
			System.out.println("contents are unequal");
		// 3.compare equalsIgnoreCase
		if (s.equalsIgnoreCase(s2))
			System.out.println("contents are equal if we ignore the case");
		else
			System.out.println("contents are unequal if we ignore the case");
		// 4.compareTo method
		if (s.compareTo(s2) > 0)
			System.out.println(s + " is greater");
		else if (s.compareTo(s2) < 0)
			System.out.println(s2 + " is greater");
		else
			System.out.println("both the strings are equal "+s+" and "+s2);
	}

	// Using New Keyword
	public static void createStringWithNew() {
		String s = new String("Lokesh");
		String s2 = new String("lokesh");

		// Strings can be compared in 4 ways
		// 1.compare references
		if (s == s2)
			System.out.println("references are equal");
		else
			System.out.println("references are unequal");
		// 2.compare string contents
		if (s.equals(s2))
			System.out.println("contents are equal");
		else
			System.out.println("contents are unequal");
		// 3.compare equalsIgnoreCase
		if (s.equalsIgnoreCase(s2))
			System.out.println("contents are equal if we ignore the case");
		else
			System.out.println("contents are unequal if we ignore the case");
		// 4.compareTo method
		if (s.compareTo(s2) > 0)
			System.out.println(s + " is greater");
		else if (s.compareTo(s2) < 0)
			System.out.println(s2 + " is greater");
		else
			System.out.println("both the strings are equal "+s+" and "+s2);
	}
}
