package org.kosta;

public class TicketMaker {
    private static TicketMaker singleton=new TicketMaker();
    
    private int ticket=1000;
    
    private TicketMaker(){
        System.out.println("�ν��Ͻ� ����!");
    }
    public static TicketMaker getInstance(){
        return singleton;
    }
    //���� ������ Ƽ���� �ϳ��� ����
    public int getNextTicketNumber(){
        return singleton.ticket++;
    }
}

