package org.kosta;

public class Audio {
	private boolean isPlay =false;
	
	public void turnOn() {
		isPlay = true;
		System.out.println("Audio ����");
	}
	
	public void turnoff() {
		isPlay = false;
		System.out.println("Audio ����");
	}
	
	public boolean isPlay() {
		
		return isPlay;
		
	}
}
