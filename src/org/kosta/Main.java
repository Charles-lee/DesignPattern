package org.kosta;

public class Main {

	public static void main(String[] args) {
		Watcher watcher = new Watcher();
        Employee pc1 = new Employee("��ȭå���� ��");
        Employee pc2 = new Employee("������ �ڴ� ��");
        Employee pc3 = new Employee("��īġ�� ��");
        //spy�� pc3�� ���� ����.
        //����� ���������� �밡
        Spy spy = new Spy(pc3);
        
        watcher.addObserver(pc1);
        watcher.addObserver(pc2);
        watcher.addObserver(pc3);
        watcher.addObserver(spy);
        
        watcher.action("���� ��.");
        watcher.deleteObserver(pc3);
        watcher.deleteObserver(spy);
        
        watcher.action("���� ��.");
	}

}
