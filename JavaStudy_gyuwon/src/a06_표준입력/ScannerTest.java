package a06_표준입력;

import java.util.Scanner; //java.util.까지가 패키지 경로
//ctrl+shift+o
public class ScannerTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
			System.out.println("입력하세요:");
			int num1=input.nextInt();
			int num2=input.nextInt();
			String name=input.next();
			/**
			 * nextLine은 줄바꿈을 포함... 
			 * enter의 원리
			 */
			input.nextLine(); //의미없는 nextLine 한번 쓰기
			String phone=input.nextLine();
			String addr=input.nextLine();
			System.out.println("첫번째 입력한 숫자:"+num1);
			System.out.println("두번째 입력한 숫자:"+num2);
			System.out.println("이름:"+name);
			System.out.println("폰번호:"+phone);
			System.out.println("주소:"+addr);
	}

}
