package a13_���;
//�� �ִ� ��� �ΰ��� �������.   1.������ ȣ��, 2.���ͼ���
class Human extends Animal{
	private String ����;
	
	public Human(String �̸�) {
		super("���",�̸�); //�⺻������
	}
	
	public String get����() {
		return ����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public void ��������() {
		System.out.println("���� "+����+"�����Դϴ�.");
	}
}
	
class Tiger extends Animal{
	private String ��ɴɷ�;
	
	public Tiger(String �̸�) {
		super("ȣ����", �̸�);
//		set����("ȣ����");
//		set�̸�(�̸�);
	}
	
	public String get��ɴɷ�() {
		return ��ɴɷ�;
	}

	public void set��ɴɷ�(String ��ɴɷ�) {
		this.��ɴɷ� = ��ɴɷ�;
	}

	public void ��ɴɷ�ġ() {
		System.out.println(get�̸�()+" ȣ������ ��ɴɷ�ġ�� "+��ɴɷ�+"�Դϴ�.");
	}
}

class Eagle extends Animal{
	private int ��������;
	
	public Eagle(String �̸�) {
		super("������", �̸�);
//		set����("������");
//		set�̸�("�����");
	}
	
	public int get��������() {
		return ��������;
	}

	public void set��������(int ��������) {
		this.�������� = ��������;
	}

	public void ��������������() {
		System.out.println("���� ���̴� "+��������+"cm�Դϴ�.");
	}
}

public class ExtendsTest {
	
	public static void main(String[] args) {
		Human h=new Human("�̱Կ�");
		h.set����("���");
		Animal h2=new Human("�̱���");	
		//h2.set����("�����");			
	//	Human h3 = (Human)h2;		//�ٿ�ĳ���� �ٽ� ������� ������.
		Tiger t=new Tiger("ȣ����");
		t.set��ɴɷ�("��");
		Eagle e=new Eagle("�����");
		e.set��������(250);
		
//		Animal a = new Animal();  �ȵȴ�
//		Human h4 = (Human)a;
		
		if(h2 instanceof Human) {
			System.out.println("����̾����ϴ�.");
		}else if(h2 instanceof Tiger) {
			System.out.println("ȣ���̾����ϴ�.");
		}else if(h2 instanceof Eagle) {
			System.out.println("�����������ϴ�.");	
		}else if(h2 instanceof Animal) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("� Ŭ�������� �𸣰ڽ��ϴ�.");
		}
		
//		
//		h.set�̸�("�̱Կ�");
//		h.set����("���");
//		h2.set�̸�("�̱���");
//		h2.set����("���");
//		
//		t.set�̸�("�߿���");
//		t.set����("ȣ����");
//		
//		e.set�̸�("�����");
//		e.set����("������");
		
		h.move();
		t.move();
		e.move();
		h.��������();
		//h2.��������();
		//h3.��ɴɷ�ġ();
		//h4.��������();
		t.��ɴɷ�ġ();
		e.��������������();
	}

}
