package a08_�ݺ�;

public class Loop {
	public static void main(String[] args) {
		int result=0;
		int number=1;
		
		while(true) {
			result+=number++; //result=result+number++
			if(number==101) {
				break;
			}
			System.out.println("������ ����:"+result+"+"+number);
		}
		System.out.println("���:"+result);
	}
}
