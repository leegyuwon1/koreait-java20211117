package a11_Ŭ����2;

public class RuleTest {
	public static void main(String[] args) {
		Rule rule=new Rule();
		
		
		String name = "������";
		String addr = "�λ걤���� ������";
		int year = 2021;
		
		if(rule.isEmpty(name)) {
			System.out.println("�̸��� ����ֽ��ϴ�.");
		}else {
			System.out.println("������� �̸��� "+name+"�Դϴ�.");
		} 
		// �ѤѤѤѤѤѤѤѤѤѤ�         //
		if(rule.isEmpty(addr)) {
			System.out.println("�ּҰ� ����ֽ��ϴ�.");
		}else {
			System.out.println("������� �ּҴ� "+addr+"�Դϴ�.");
		}
		// �ѤѤѤѤѤѤѤѤѤ�          //
		if(rule.isEmpty(year)) {
			System.out.println("�⵵�� �Է����ּ���.");
		}else {
			System.out.println("�Է��� �⵵�� "+year+"�� �Դϴ�.");
		}
	}

}
