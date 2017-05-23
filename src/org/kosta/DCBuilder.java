package org.kosta;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DCBuilder implements Builder{
	private Hero batman;
	
	DCBuilder(){
        batman = new Hero("��Ʈ��");
    }
    public void makeArm() {
        batman.setArmSource("������");
    }
    public void makeLeg() {
        batman.setLegSource("������");
    }
    public Hero getResult() {
        return batman;
    }
}
