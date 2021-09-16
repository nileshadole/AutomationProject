package day63;

public class ArrayAsAReturnType {
	
	//arrys as return type inside the method
	public int[] m1() {
		int []a=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		return a;
	}
public static void main(String[] args) {
	ArrayAsAReturnType n=new ArrayAsAReturnType();
	int[] returnvalue = n.m1();
			for(int a:returnvalue) {
				System.out.println(a);
			}
}
}
