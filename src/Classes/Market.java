package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс магазина.
 * Представляет собой магазин,
 * который может принимать клиентов,
 * обрабатывать заказы и управлять очередью.
 * Заказы (Orders): представляют собой товары, которые клиенты могут покупать в магазине.
 */

public class Market implements iMarketBehaviour, iQueueBehaviour {


    /**
     * Лист очереди
     */
    private List<iActorBehaviour> queue;

    /**
     * Конструктор магазина
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }


     // Переопределение методов поведения:


    /**
     * Метод, который добавляет клиента в очередь магазина.
     * @param actor
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * Метод добавляет нового клиента в очередь.
     * @param actor
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    /**
     * Метод, который удаляет клиента из очереди магазина.
     * @param actors
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    /**
     *  Метод, который выдает заказ клиенту.
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    /**
     * Метод удаляет клиентов из очереди,
     * которые уже получили свой заказ.
     */
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

    /**
     * Метод, который позволяет клиенту оформить заказ.
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.getActor().isMakeOrder) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }

    /**
     * Метод, который обновляет состояние магазина и очереди.
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }
}
