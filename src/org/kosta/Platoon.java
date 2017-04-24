package org.kosta;

import java.util.ArrayList;

public class Platoon implements Unit {

	private String name;
	private ArrayList<Unit> list;

	public Platoon(String name) {
		this.name = name;
		list = new ArrayList<Unit>();
	}

	@Override
	public void attack() {
		System.out.println(name + "�� �����Ѵ�");
		
		for (Unit unit : list) {
			unit.attack();
		}
		
		
	}

	@Override
	public void move() {
		System.out.println(name + "�� �����δ�");
		for (Unit unit : list) {
			unit.move();
		}
	}

	@Override
	public void add(Unit unit) {
		list.add(unit);
	}

	@Override
	public void remove(Unit unit) {
		list.remove(unit);
	}

	@Override
	public Unit get(int i) {
		return list.get(i);
	}
}
