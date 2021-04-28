package homework_5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Car implements Runnable{

    private static int CARS_COUNT;
    private static boolean winnerFound;
    private static Lock win = new ReentrantLock();

    static {
        CARS_COUNT = 0;
    }

    private Race race;
    private int speed;
    private String name;
    private int count;
    private CyclicBarrier cb;
    private CountDownLatch cdl;

    Car(Race race, int speed, CyclicBarrier cb, CountDownLatch cdl) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.cb = cb;
        this.cdl = cdl;
    }
    private static synchronized void checkWinner(Car c) {
        if (!winnerFound) {
            System.out.println(c.name + " - WIN");
            winnerFound = true;
        }
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            cb.await();
            cb.await();
            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }
            checkWinner(this);
            cb.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getCarsCount() {
        return CARS_COUNT;
    }

    public static void setCarsCount(int carsCount) {
        CARS_COUNT = carsCount;
    }

    public static boolean isWinnerFound() {
        return winnerFound;
    }

    public static void setWinnerFound(boolean winnerFound) {
        Car.winnerFound = winnerFound;
    }

    public static Lock getWin() {
        return win;
    }

    public static void setWin(Lock win) {
        Car.win = win;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public CyclicBarrier getCb() {
        return cb;
    }

    public void setCb(CyclicBarrier cb) {
        this.cb = cb;
    }

    public CountDownLatch getCdl() {
        return cdl;
    }

    public void setCdl(CountDownLatch cdl) {
        this.cdl = cdl;
    }
}
