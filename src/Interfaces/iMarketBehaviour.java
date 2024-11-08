package Interfaces;

import Classes.Actor;

import java.util.List;

/**
 * Интерфейс поведения клиентов в магазине.
 * Определяет поведение магазина, включая его способность принимать клиентов,
 * обрабатывать заказы и управлять очередью.
 */

public interface iMarketBehaviour {

    /**
     * Метод принятия в магазин
     * @param actor
     */
    public void acceptToMarket(iActorBehaviour actor);

    /**
     * Метод выхода из магазина
     * @param list
     */
    public void releaseFromMarket(List<Actor> list);

    /**
     * Метод обновления состояния клиента
     */
    public void update();
}
