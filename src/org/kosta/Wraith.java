package org.kosta;

public class Wraith extends Unit {
	public Wraith() {
		this.expertName = "���̾�";
	}

	@Override
	protected boolean solve(String p) {
		return p.contains("��Ż");
	}
}