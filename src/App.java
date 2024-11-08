import Classes.*;
import Interfaces.iActorBehaviour;

/**
 * Проект представляет собой систему, моделирующую поведение клиентов в магазине.
 */
public class App {
    public static void main(String[] args) {

        // Cоздание магазина
        Market market = new Market();

        // Cоздание клиентов
        Actor client1 = new OrdinaryClient("Борис", 1, false);
        Actor client2 = new OrdinaryClient("Ольга", 2, false);
        Actor client3 = new SpecialClient("Киркоров", 1,false);

        // Представим инспектора через интерфейс и получим ссылку на него
        iActorBehaviour client4 = new TaxInspector();

        // Промо клиент
        Actor client5 = new PromotionClient("Виктор", 1, "-10%");


        // Принятие в магазин
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(client4);
        market.acceptToMarket(client5);

        // Возврат заказа
        Actor client6 = new OrdinaryClient("Максим", 3, true);
;

        // Обновление
        market.update();

    }
}