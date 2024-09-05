package Interfaces;

import Classes.Actor;

public interface IQueueBehaviour {

    // метод принятия в очередь
    public void takeInQueue(Actor actor);

    // метод выхода из очереди
    public  void releaseFromQueue(Actor actor);

    // метод получения заказа
    public void takeOrder();

    // метод выдачи заказа
    public void giveOrder();

}
