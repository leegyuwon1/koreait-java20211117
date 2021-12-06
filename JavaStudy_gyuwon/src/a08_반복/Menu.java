package a08_반복;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean loopFlag=true;
		int i=0;
		String select=null;
		
		while(loopFlag) {
			System.out.println("[프로그램 메뉴]");
			System.out.println("1. 김준일 강사 폴더");
			System.out.println("q. 프로그램 종료");
			System.out.print("명령을 입력하세요:");
			select=sc.nextLine(); 
			
			if(select.equals("1")) {
				boolean loopFlag2=true;
				System.out.println("[1.김준일 강사 폴더]");
				System.out.println("1. javaStudy 폴더");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램 종료");
				System.out.print("명령을 입력하세요:");
				select=sc.nextLine(); //문자열입력
				
				if(select.equals("1")) {
					System.out.println("1.javaStudy폴더 open");
				}
				else if(select.equals("b")) { //이전페이지로 이동
					System.out.println("뒤로가기 실행");
					loopFlag2=false;
				}
				else if(select.equals("q")) { //프로그램 종료
					System.out.println("프로그램 종료중...");
					loopFlag=false;
					loopFlag2=false;
				}
			} else if(select.equals("q")) {
				System.out.println("프로그램 종료중...");
				break;
			} else {
				System.out.println("실행할 수 없는 명령입니다.");
			}
		}
		System.out.println("프로그램 종료.");
	}
}