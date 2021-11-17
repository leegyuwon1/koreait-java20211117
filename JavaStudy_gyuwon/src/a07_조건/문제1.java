package a07_조건;

import java.util.Scanner;

public class 문제1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("성적을 입력해주세요(0~100):");
		int score=sc.nextInt();
		//90~100 : A
		//80~89	 : B
		// C D  0~59 F
		if(score>100 || score<0) {
			System.out.println("잘못입력하셨습니다.");
		}
		else if(score>89) {
			System.out.println("성적은 A입니다.");
		}
		else if(score>79) {
			System.out.println("성적은 B입니다.");
		}
		else if(score>69) {
			System.out.println("성적은 C입니다.");
		}
		else if(score>59) {
			System.out.println("성적은 D입니다.");
		}
		else {
			System.out.println("성적은 F입니다.");
		}
		System.out.println("성적 출력완료.");
	}
}
