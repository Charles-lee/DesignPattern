package org.kosta;

public abstract class Unit {
	private Unit next;
	protected String expertName;
	protected abstract boolean solve(String p);
	
	public void support(String p) {
		if (solve(p)) {
			System.out.println(expertName + "��(��) " + p + "��(��) �ذ��� ���ȳ�.");
		} else {
			if (next != null) {
				next.support(p);
			} else {
				System.out.println(p+ "��(��) �ذ��� ���� ����.");
			}
		}
	}

	public Unit setNext(Unit next) {
		this.next = next;
		return next;
	}

	
}