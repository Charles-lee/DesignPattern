package org.kosta;

public class Main {

	public static void main(String[] args) {

		Person p1 = PersonFactory.getPerson("��ö��");
		Person p2 = PersonFactory.getPerson("������");
		Person p3 = PersonFactory.getPerson("��ö��");
		
		System.out.println(p1==p2?"����":"Ʋ��");
		System.out.println(p1==p3?"����":"Ʋ��");
		
	}

}
