package org.kosta;

public class Singleton {
    
	private static Singleton singleton = new Singleton();
    
    private Singleton(){
        System.out.println("�ν��Ͻ��� ���������.");
    }
    public static Singleton getInstance(){
    	if(singleton == null){
    		singleton = new Singleton();
    	}
    	
    	return singleton;
		
    }
}

