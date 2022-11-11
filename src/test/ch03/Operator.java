package test.ch03;

public class Operator {

	public static void main(String[] args) {
//		int x = -100;
//		x=-x;
//		System.out.println(x);
		int x = 10;
		int y = 10;
		int z;	
		x++;
		y++;
		System.out.println("x= "+x);
		System.out.println("-------------");
		y--;
		--y;
		System.out.println("y="+y);
		System.out.println("-------------");
		z=x++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("-------------");
		z=++x + y++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
