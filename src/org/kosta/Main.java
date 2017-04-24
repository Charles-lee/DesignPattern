package org.kosta;

public class Main {

	public static void main(String[] args) {
		String[] problems = {"����","���۸�","��Ż","���� ���۸�","��ũ" };
        
        Unit firebat = new Firebat();
        Unit wraith = new Wraith();
        Unit vulture = new Vulture();
        
        firebat.setNext(wraith).setNext(vulture);
        
        for (String problem : problems) {
        	firebat.support(problem);
        }

	}

}
