package org.kosta;

public class Vulture extends Unit {
	public Vulture() {
		expertName = "����";
	}

	@Override
	protected boolean solve(String p) {
		return p.contains("����");
	}
}