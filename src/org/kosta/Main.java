package org.kosta;

public class Main {

	public static void main(String[] args) {
		System.out.println("�̱��� ����1 ����");
        Singleton o1=Singleton.getInstance();
        Singleton o2=Singleton.getInstance();
        if(o1==o2){
            System.out.println("���� ���� �ν��Ͻ���");
        }
        else{
            System.out.println("���� �ٸ� �ν��Ͻ���");
        }
        System.out.println("��");


        System.out.println("�̱��� ����2 ����");
        TicketMaker t1=TicketMaker.getInstance();
        TicketMaker t2=TicketMaker.getInstance();
        TicketMaker t3=TicketMaker.getInstance();
        System.out.println("t1 : "+t1.getNextTicketNumber());
        System.out.println("t2 : "+t2.getNextTicketNumber());
        System.out.println("t3 : "+t3.getNextTicketNumber());
        System.out.println("t1 : "+t1.getNextTicketNumber());
        System.out.println("��");

        System.out.println("�̱��� ����3 ����");
        Triple p1=Triple.getInstance(0);
        Triple p2=Triple.getInstance(1);
        Triple p3=Triple.getInstance(2);

        System.out.println("p1 ���̵� : "+p1.myId());
        System.out.println("p2 ���̵� : "+p2.myId());
        System.out.println("p3 ���̵� : "+p3.myId());
        System.out.println("��");

	}

}
