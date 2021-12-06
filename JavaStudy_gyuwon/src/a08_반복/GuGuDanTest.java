package a08_반복;

import java.util.Scanner;

public class GuGuDanTest { //2중 for문
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int gugudanStart=0;
		int gugudanEnd=0;
		int gugudan3=0;
		
		System.out.print("시작 단수:");
		gugudanStart=in.nextInt();
		System.out.println("마지막 단수:");
		gugudanEnd=in.nextInt();
		System.out.println("곱하기 1~몇까지 구현할것인가:");
		gugudan3=in.nextInt();
		
		
		for(int i=gugudanStart;i<gugudanEnd+1;i++) {
			System.out.println("구구단"+i+"단");
			for(int j=1;j<gugudan3+1;j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}
			System.out.println();
		}
		System.out.println("구구단 끝!");
	}

}
