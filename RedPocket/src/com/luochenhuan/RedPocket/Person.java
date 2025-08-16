package com.luochenhuan.RedPocket;
import java.util.List;

public class Person extends Thread{
    private int id;
    private int money = 0;
    private List<Integer> redPockets;

    public Person(int id, List<Integer> l ,String name) {
        super(name);
        this.id = id;
        this.redPockets = l;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (redPockets) {
                if (redPockets.isEmpty()) {
                    break;
                }
                int index = (int) (Math.random() * redPockets.size());
                Integer money = redPockets.remove(index);
                System.out.println(name + "抢到红包，金额为：" + money);

                if (redPockets.isEmpty()) {
                    System.out.println("红包抢完了");
                    break;
                }
            }
        }
        if (redPockets.isEmpty()) {
            System.out.println(name + "抢完红包，总金额：" + money);
        }
    }
}