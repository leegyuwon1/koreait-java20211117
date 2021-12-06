package a08_반복;

import java.util.Scanner;

public class WhileGuGuDan2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int danStart=0;
		int danEnd=0;
		System.out.println("시작 단수:");
		danStart=sc.nextInt();
		System.out.println("마지막 단수:");
		danEnd=sc.nextInt();
		
		while(danStart<danEnd+1) {
			int j=1;
			if(danStart%2 ==0) {
				danStart++;
				continue;
			}
			System.out.println(danStart+"단");
			while(j<10) {
				System.out.println(danStart+"X"+j+"="+danStart*j);
				j++;
			}
			System.out.println();
			danStart++;	
		}
	}

}
