package a06_ǥ���Է�;

import java.util.Scanner; //java.util.������ ��Ű�� ���
//ctrl+shift+o
public class ScannerTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
			System.out.println("�Է��ϼ���:");
			int num1=input.nextInt();
			int num2=input.nextInt();
			String name=input.next();
			/**
			 * nextLine�� �ٹٲ��� ����... 
			 * enter�� ����
			 */
			input.nextLine(); //�ǹ̾��� nextLine �ѹ� ����
			String phone=input.nextLine();
			String addr=input.nextLine();
			System.out.println("ù��° �Է��� ����:"+num1);
			System.out.println("�ι�° �Է��� ����:"+num2);
			System.out.println("�̸�:"+name);
			System.out.println("����ȣ:"+phone);
			System.out.println("�ּ�:"+addr);
	}

}
