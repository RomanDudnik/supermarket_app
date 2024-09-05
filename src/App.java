import Classes.*;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) {

        // Cоздание магазина
        Market market = new Market();

        // Cоздание клиентов
        Actor client1 = new OrdinaryClient("Борис", 1);
        Actor client2 = new OrdinaryClient("Ольга", 2);
        Actor client3 = new SpecialClient("Киркоров", 1);

        // Представим инспектора через интерфейс и получим ссылку на него
        iActorBehaviour client4 = new TaxInspector();


        // Принятие в магазин
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(client4);

        // Обновление
        market.update();

    }
}