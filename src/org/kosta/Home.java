package org.kosta;

public class Home {
    private TV tv;
    private Light light;
    private Audio audio;
    
	public Home() {
		tv = new TV();
		audio = new Audio();
		light = new Light();
		
		this.tv = tv;
		this.light = light;
		this.audio = audio;
	}
    public void enjoyTv(){
    	System.out.println("Ƽ�� ����");
    	tv.turnOn();
    	light.setLight(2);
    }
    
    public void enjoyMusic(){
    	System.out.println("������ �����Ѵ�");
    	audio.turnOn();
    }

	public void out(){
		System.out.println("�����Ѵ�");
		tv.turnoff();
		audio.turnoff();
		light.setLight(0);
	}
    
}
