package Classes;

public class OrdinaryClient extends Actor {

    private int number;

    public OrdinaryClient(String name, int number) {
        super(name);
        this.number = number;

    }

    // Геттеры и сеттеры
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Переопределенные методы

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    // Дополнительные методы

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    // вызов ссылки на экземпляр
    public Actor getActor() {
        return this;
    }

}
