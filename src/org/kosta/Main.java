package org.kosta;

public class Main {

	public static void main(String[] args) {
		Person p1 = PersonFactory.getPerson("ȫ�浿");
        Person p2 = PersonFactory.getPerson("�踻��");
        Person p3 = PersonFactory.getPerson("ȫ�浿");
        
        System.out.println(p1 == p2?"����":"�ٸ�");
        System.out.println(p1 == p3?"����":"�ٸ�");
	}

}
