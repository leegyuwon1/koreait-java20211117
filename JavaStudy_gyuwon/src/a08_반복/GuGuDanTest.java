package a08_�ݺ�;

import java.util.Scanner;

public class GuGuDanTest { //2�� for��
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int gugudanStart=0;
		int gugudanEnd=0;
		int gugudan3=0;
		
		System.out.print("���� �ܼ�:");
		gugudanStart=in.nextInt();
		System.out.println("������ �ܼ�:");
		gugudanEnd=in.nextInt();
		System.out.println("���ϱ� 1~����� �����Ұ��ΰ�:");
		gugudan3=in.nextInt();
		
		
		for(int i=gugudanStart;i<gugudanEnd+1;i++) {
			System.out.println("������"+i+"��");
			for(int j=1;j<gugudan3+1;j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}
			System.out.println();
		}
		System.out.println("������ ��!");
	}

}
