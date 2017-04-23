package framework.idcard;

import framework.Product;

public class IDCard extends Product {
    private String owner;
    
    IDCard(String owner)
    {
        System.out.println(owner + "�� ī�带 ����ϴ�.");
        this.owner = owner;
    }
    public String getOwner() {
        return owner;
    }
    
    @Override
    public void use() {
        System.out.println(owner + "�� ī�带 ����մϴ�.");
    }
}
