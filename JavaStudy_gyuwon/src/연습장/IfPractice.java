package 연습장;

import java.util.Scanner;

public class IfPractice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("집에서 출발");
			System.out.println("커피?:");
			String coffee=sc.next();
			if(coffee.equals("먹는날")) {
				System.out.println("스타벅스 들리고 학원으로 갑니다");
			}
			else {
				System.out.println("그냥 학원으로 갑니다.");
			}
			System.out.println("끝");
	}

}
