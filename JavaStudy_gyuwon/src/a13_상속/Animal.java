package a13_���;

public class Animal {
		private String ����;
		private String �̸�;
		
		public Animal(String ����, String �̸�) { //������ȣ��
			this.����=����;
			this.�̸�=�̸�;
		}
		
		public String get����() {
			return ����;
		}

		public void set����(String ����) {
			this.���� = ����;
		}

		public String get�̸�() {
			return �̸�;
		}

		public void set�̸�(String �̸�) {
			this.�̸� = �̸�;
		}
		
		public void move() {
			System.out.println(�̸�+"("+����+")��(��) �����Դϴ�");
			System.out.println();
		}

}
