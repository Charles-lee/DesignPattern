package org.kosta;

public class Light {
    private int lightness = 0;
    
    public int getLightness() {
		return lightness;
	}
    
    public void setLight(int light) {
		this.lightness = light;
		System.out.println("��� ���� "+this.lightness);
	}
}
