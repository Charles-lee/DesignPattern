package org.kosta;

public class Firebat extends Unit {
	public Firebat() {
		this.expertName = "���̾��";
	}

	@Override
	protected boolean solve(String p) {
		return p.contains("���۸�");
	}
}