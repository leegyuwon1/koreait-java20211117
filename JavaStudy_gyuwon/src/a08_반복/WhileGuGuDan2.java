package a08_�ݺ�;

import java.util.Scanner;

public class WhileGuGuDan2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int danStart=0;
		int danEnd=0;
		System.out.println("���� �ܼ�:");
		danStart=sc.nextInt();
		System.out.println("������ �ܼ�:");
		danEnd=sc.nextInt();
		
		while(danStart<danEnd+1) {
			int j=1;
			if(danStart%2 ==0) {
				danStart++;
				continue;
			}
			System.out.println(danStart+"��");
			while(j<10) {
				System.out.println(danStart+"X"+j+"="+danStart*j);
				j++;
			}
			System.out.println();
			danStart++;	
		}
	}

}
