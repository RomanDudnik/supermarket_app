package Classes;

import Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {

    // Имя
    protected String name;

    // Состояния заказа
    protected boolean isTakeOrder;

    protected boolean isMakeOrder;

    // Конструктор (принимает только имя)
    public Actor(String name) {
        this.name = name;
    }

    // Геттеры и сеттеры
    public abstract String getName();

    public abstract void setName(String name);
}
