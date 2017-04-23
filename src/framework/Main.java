package framework;
import framework.Factory;
import framework.Product;
import framework.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
        Product card1 = factory.create("ȫ�浿");
        Product card2 = factory.create("������");
        Product card3 = factory.create("�ڹ�");
 
        card1.use();
        card2.use();
        card3.use();

        System.out.println(((IDCardFactory)factory).getOwners());

	}

}
