package a12_배열;

public class ClassArray {
	public static void main(String[] args) {
		Student[] students=new Student[10];
		//students[i]에 주소넣어주기
		for(int i=0;i<10;i++) {
			students[i]=new Student("김준일"+i, i);
		}
		
//		for(Student student : students) {
//			System.out.println("학생이름: "+student.getName());
//			System.out.println("학생학년: "+student.getYear());
//		}                                                       아래와 결과 동일
		
		for(int i=0;i<students.length;i++) {
			System.out.println();
			System.out.println("학생이름: "+students[i].getName());
			System.out.println("학생학년: "+students[i].getYear());
		}
		
		
	}

}
