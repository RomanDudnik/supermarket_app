package Interfaces;

import Classes.Actor;

/**
 * Интерфейс поведения очереди.
 * Определяет поведение очереди в магазине,
 * включая ее способность принимать и удалять клиентов.
 */
public interface iQueueBehaviour {

    /**
     * Метод принятия в очередь
     */
    public void takeInQueue(iActorBehaviour actor);

    /**
     * Метод выхода из очереди
     */
    public void releaseFromQueue();

    /**
     * Метод создания заказа
     */
    public void takeOrder();

    /**
     * метод выдачи заказа
     */
    public void giveOrder();

}
