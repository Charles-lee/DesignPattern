package org.kosta;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Units units = new Units();
		units.add("�����");
		units.add("����");
		units.add("����");

		Iterator<String> iterator = units.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}

}
