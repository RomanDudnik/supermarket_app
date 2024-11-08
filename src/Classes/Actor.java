package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Родительский класс клиентов.
 * Представляют собой клиентов, которые могут взаимодействовать с магазином.
 * Акторы могут быть разных типов,
 * таких как обычные клиенты, специальные клиенты, промо-клиенты и так далее.
 */

public abstract class Actor implements iActorBehaviour, iReturnOrder {

    // Имя
    protected String name;

    // Состояния заказа
    protected boolean isTakeOrder;

    protected boolean isMakeOrder;

    protected boolean isCheckOrder;

     // Конструктор (принимает только имя)
    public Actor(String name) {
        this.name = name;
    }

    // Геттеры и сеттеры
    public abstract String getName();

    public abstract void setName(String name);
}
