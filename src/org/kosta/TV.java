package org.kosta;

public class TV {
	private boolean isTurnOn = false;
	
	public void turnOn() {
		isTurnOn = true;
		System.out.println("����");
	}
	
	public void turnoff() {
		isTurnOn = false;
		System.out.println("����");
	}
	
	public boolean isTurnOn() {
		
		return isTurnOn;
		
	}
	
}
