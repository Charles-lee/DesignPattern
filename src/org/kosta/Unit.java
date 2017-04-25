package org.kosta;

public abstract class Unit {
	
	private Unit next;
	public String UnitName;
	abstract boolean solve(String enemy);
	
	public void support(String enemy) {
		if(solve(enemy)){
			System.out.println(UnitName+"���� "+enemy+"�� ó����");
		}else{
			if (next!=null) {
				next.support(enemy);
			}else{
				System.out.println("ó������ ");
			}
		}
	}

	public Unit getNext() {
		return next;
	}

	public Unit setNext(Unit next) {
		this.next = next;
		return next;
	}

	public String getUnitName() {
		return UnitName;
	}

	public void setUnitName(String unitName) {
		UnitName = unitName;
	}
	
	

	
}