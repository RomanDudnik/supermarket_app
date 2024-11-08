package Interfaces;

/**
 * Интерфейс возврата товара.
 * Определяет поведение возврата заказов.
 */

public interface iReturnOrder {

    /**
     * Метод возврата заказа
     * @return
     */
    public boolean ReturnOrder();

    /**
     * Метод проверки заказа
     */
    public default void checkOrder() {
    }
}
