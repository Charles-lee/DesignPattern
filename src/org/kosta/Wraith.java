package org.kosta;

public class Wraith extends Unit {

	public Wraith() {
		this.UnitName= "���̾�";
		
	}

	@Override
	boolean solve(String enemy) {
		return enemy.contains("��Ż");
	}
	
	
	
}