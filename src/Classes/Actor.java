package Classes;

public abstract class Actor {

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
