package org.kosta;

public class Main {

	public static void main(String[] args) {

		Aquarium aquarium = new Aquarium("[�ź��� ����]");
		AquariumDeco ADeco = new AquariumDeco(aquarium);
		AquariumWater AWater = new AquariumWater(aquarium);
		Turtle turtle = new Turtle(aquarium);
		
		System.out.println("û�ҽ���");
		
		turtle.getAquarium();
		ADeco.getAquarium();
		AWater.getAquarium();
		aquarium.setWash();
		AWater.setAquarium();
		ADeco.setAquarium();
		turtle.insertAquarium();
		
	}

}

