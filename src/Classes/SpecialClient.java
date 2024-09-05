package Classes;

public class SpecialClient extends Actor {

    private int vipId;

    public SpecialClient(String name, int number) {
        super(name);
        this.vipId = number;

    }

    // Геттеры и сеттеры
    public int getNumber() {
        return vipId;
    }

    public void setNumber(int number) {
        this.vipId = number;
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
