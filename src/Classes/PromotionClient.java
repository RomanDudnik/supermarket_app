package Classes;

/**
 * Класс промо клиента (участник промо акции)
 */

public class PromotionClient extends Actor {

    // ID клиента промо акции
    private int promoId;

    // Название промо акции
    private static String promoName;

    // Ограничение(количество) участников промо акции
    private static int amountPromoClients;

    // Конструктор промо клиента
    public PromotionClient(String name, int promoId, String promoName) {
        super(name);
        this.promoId = promoId;
        this.promoName = promoName;
    }

    // Геттеры и сеттеры
    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

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

    public boolean ReturnOrder() {
        return super.isCheckOrder;
    }

    public void checkOrder() {
        super.isCheckOrder = true;
    }
}
