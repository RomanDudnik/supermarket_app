package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {

    // метод принятия в очередь
    public void takeInQueue(Actor actor);

    // метод выхода из очереди
    public void releaseFromQueue();

    // метод получения заказа
    public void takeOrder();

    // метод выдачи заказа
    public void giveOrder();

}
