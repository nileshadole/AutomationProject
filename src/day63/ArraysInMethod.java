package day63;

public class ArraysInMethod {
	//Arrays can be argument in side the method.
	public static void m1(String[]c) {
		for(String ss:c)
		System.out.println(ss);
		
		
	}
	
	//
public static void main(String[] args) {
	String[] s=new String[2];
	s[0]="Nilesh";
	s[1]="Kalpesh";
	m1(s);
}
}
