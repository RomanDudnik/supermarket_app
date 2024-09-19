package Interfaces;

import Classes.Actor;

/**
 * Интерфейс поведения заказов для клиентов
 */

public interface iActorBehaviour {

    public boolean isTakeOrder();

    public boolean isMakeOrder();

    public void setTakeOrder(boolean val);

    public void setMakeOrder(boolean val);


    // вызов ссылки на экземпляр
    public Actor getActor();
}
