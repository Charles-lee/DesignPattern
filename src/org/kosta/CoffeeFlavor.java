package org.kosta;

public class CoffeeFlavor implements CoffeeOrder {
    private final String flavor;
      
    public CoffeeFlavor(String newFlavor) {
        this.flavor = newFlavor;
    }
  
    public String getFlavor() {
        return this.flavor;
    }
  
    public void serveCoffee(CoffeeOrderContext context) {
        System.out.println("Ŀ�� ����..." + flavor + " �̰� ���̺� ��ȣ��  " + context.getTable());
    }
}
