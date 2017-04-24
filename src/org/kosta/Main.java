package org.kosta;

public class Main {

	public static void main(String[] args) {
		Machine m = new Machine();
        m.setState(1, 2);
        System.out.println(m.toString());
        int token = m.createMemento();
       
        m.setState(30, 40); // �߰��� ���°� �ٲ�
        System.out.println(m.toString());
        m.restoreState(token); // ���� ��ū���� ���� ��ų �� �ִ�.
        System.out.println(m.toString());


	}

}
