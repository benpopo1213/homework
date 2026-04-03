package test0324;

public class test0324 {

	public static void main(String[] args) {
	int max=11;
	int mid=max/2;
	for(int i=0;i<max;i++) {
		int d=Math.abs(mid-i);
		int a=max-(d*2);
		for(int c=0;c<d;c++) {
			System.out.print(" ");
		}
		for(int s=0;s<a;s++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
	}

	}
