package org.kosta;

public class Vulture extends Unit {

	public Vulture() {
		this.UnitName = "����";
	}

	@Override
	boolean solve(String enemy) {
		return enemy.contains("����");
	}
	
	
	
}