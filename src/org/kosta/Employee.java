package org.kosta;

import java.util.Observable;
import java.util.Observer;

public class Employee implements Observer {
    private String desc;
    public Employee(String desc) {
        this.desc = desc;
    }
    public void update(Observable o, Object arg) {
        if (o instanceof Watcher) {
            System.out.println(desc + "�� ���ϴ� ô");
        }
    }
    public String getDesc() {
        return desc;
    }
}
