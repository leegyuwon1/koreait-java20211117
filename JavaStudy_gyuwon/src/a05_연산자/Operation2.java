package a05_������;

public class Operation2 {
	public static void main(String[] args) {
		/**
		 * <��������>  ��, ����  (�ڷ���:boolean)
		 * 1.AND���� (&&) = ��
		 * 2.OR���� (||)  = ��
		 * 3.NOT���� (!)  = ����
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
		 * ����(����)������
		 * boolean trueAndFalse = ���� ? ���(��) : ���(����);
		 */
		boolean trueAndFalse = (10<20)?true:false;
		String grade = (80<60) ? "F���":"F�� �ƴմϴ�.";
		
		System.out.println(trueAndFalse);
		System.out.println(grade);
	}
}
