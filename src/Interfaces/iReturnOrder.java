package Interfaces;

/**
 * Интерфейс возврата товара
 */

public interface iReturnOrder {

    //Метод возврата заказа
    public boolean ReturnOrder();

    //Метод проверки заказа
    public default void checkOrder() {
    }
}
