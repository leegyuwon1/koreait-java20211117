package a12_�迭;

public class ClassArray {
	public static void main(String[] args) {
		Student[] students=new Student[10];
		//students[i]�� �ּҳ־��ֱ�
		for(int i=0;i<10;i++) {
			students[i]=new Student("������"+i, i);
		}
		
//		for(Student student : students) {
//			System.out.println("�л��̸�: "+student.getName());
//			System.out.println("�л��г�: "+student.getYear());
//		}                                                       �Ʒ��� ��� ����
		
		for(int i=0;i<students.length;i++) {
			System.out.println();
			System.out.println("�л��̸�: "+students[i].getName());
			System.out.println("�л��г�: "+students[i].getYear());
		}
		
		
	}

}
