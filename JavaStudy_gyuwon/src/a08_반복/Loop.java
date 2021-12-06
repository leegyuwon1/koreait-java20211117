package a08_반복;

public class Loop {
	public static void main(String[] args) {
		int result=0;
		int number=1;
		
		while(true) {
			result+=number++; //result=result+number++
			if(number==101) {
				break;
			}
			System.out.println("나오는 값들:"+result+"+"+number);
		}
		System.out.println("결과:"+result);
	}
}
