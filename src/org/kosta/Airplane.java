package org.kosta;

public class Airplane extends Thread {
	private final ControlTower tower;
	private final int seq;

	public Airplane(ControlTower tower, int seq) {
		this.tower = tower;
		this.seq = seq;
	}

	public int getSeq() {
		return seq;
	}

	@Override
	public void run() {
		try {
			
			while (!tower.getPermission()) {
				System.out.println(seq +"�� ° ����� ��� ��.");
				Thread.sleep(500);
			}
			tower.land(this);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}