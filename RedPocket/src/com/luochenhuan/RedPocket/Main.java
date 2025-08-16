package com.luochenhuan.RedPocket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> redPocket = getRedPocket();


        Executor executor = new ThreadPoolExecutor(100, 100, 0, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(100));
        for (int i = 1; i <= 100; i++) {
            Person p = new Person(i, redPocket, "p" + i);
            executor.execute(p);
        }


}
    public static List<Integer> getRedPocket () {
        List<Integer> RedPocket = new ArrayList<Integer>();
        for (int i = 1; i <= 160; i++) {
            RedPocket.add((int) (Math.random() * 30 + 1));
        }
        for (int i = 1; i < 40; i++) {
            RedPocket.add((int) (Math.random() * 70 + 31));
        }
        return RedPocket;
    }
}