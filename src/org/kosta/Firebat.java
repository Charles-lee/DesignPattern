package org.kosta;

public class Firebat extends Unit {

	public Firebat() {
		this.UnitName = "���̾��";
	}

	@Override
	boolean solve(String enemy) {
		return enemy.contains("���۸�");
	}
	
	
}