package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс магазина
 */

public class Market implements iMarketBehaviour, iQueueBehaviour {


    /**
     *  Лист очереди
     */
    private List<iActorBehaviour> queue;

    /**
     * Конструктор магазина
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     * Переопределение методов поведения
     * @param actor
     */

    // Метод принятия в магазин
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    // Метод принятия в очередь
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    // Метод выдачи из магазина
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    // Метод выдачи заказа
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    // Метод выхода из очереди
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    // Метод получения заказа
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.getActor().isMakeOrder) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }

    // Метод обновления
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }
}
