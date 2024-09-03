package OOP.HomeWork2;

import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<Human> queue;

    public Market() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void acceptToMarket(Human human) {
        System.out.println(human.getName() + " зашел в магазин.");
        takeInQueue(human);
    }

    @Override
    public void releaseFromMarket(Human human) {
        System.out.println(human.getName() + " вышел из магазина.");
    }

    @Override
    public void takeInQueue(Human human) {
        queue.add(human);
        System.out.println(human.getName() + " встал в очередь.");
    }

    @Override
    public void releaseFromQueue() {
        Human human = queue.poll();
        if (human != null) {
            System.out.println(human.getName() + " покинул очередь.");
            releaseFromMarket(human);
        } else {
            System.out.println("Очередь пуста.");
        }
    }

    @Override
    public void takeOrder() {
        Human human = queue.peek();
        if (human != null) {
            System.out.println(human.getName() + " сделал заказ.");
        } else {
            System.out.println("В очереди никого нет для принятия заказа.");
        }
    }

    @Override
    public void giveOrder() {
        Human human = queue.peek();
        if (human != null) {
            System.out.println(human.getName() + " получил свой заказ.");
        } else {
            System.out.println("Нет заказов для выдачи.");
        }
    }

    public void update() {
        System.out.println("Обновление состояния магазина...");
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }
}