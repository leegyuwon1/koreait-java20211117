package a05_연산자;

public class Operation2 {
	public static void main(String[] args) {
		/**
		 * <논리연산자>  참, 거짓  (자료형:boolean)
		 * 1.AND연산 (&&) = 곱
		 * 2.OR연산 (||)  = 합
		 * 3.NOT연산 (!)  = 반전
		 * 
		 * true(1)
		 * false(0)
		 * 
		 * true && false  => false
		 * true && true   => true
		 * false && false => false
		 * 
		 * true || false  => true
		 * true || true   => true
		 * false|| false  => false
		 * 
		 * !true  => false
		 * !false => true
		 * 
		 * !(true && true) => false
		 * !(false||false) => true
		 */
		System.out.println(!(true&&true));
		System.out.println(false||false);
		/**
		 * 삼항(조건)연산자
		 * boolean trueAndFalse = 조건 ? 결과(참) : 결과(거짓);
		 */
		boolean trueAndFalse = (10<20)?true:false;
		String grade = (80<60) ? "F등급":"F가 아닙니다.";
		
		System.out.println(trueAndFalse);
		System.out.println(grade);
	}
}
