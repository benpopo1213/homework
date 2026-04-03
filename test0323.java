package test0323;

public class test0323 {

	public static void main(String[] args) {
		int a=13;
		int b=5;
		int c=3;
		int all=121;
		int count=0;
		for(int i=1;i*a<all;i++) {
			for(int j=1;(j*b+i*a)<all;j++) {
				int D=all-(j*b+i*a);
				if(D>0 && D%c==0) {
					int k=D/c;
					count++;
					System.out.println("找到組合 " + count + ": 筆記簿買 " + i + " 個, 鉛筆買 " + j + " 個, 橡皮擦買 " + k + " 個");
				}
			}
		}

	}
}