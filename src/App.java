import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;

public class App {
    public static void main(String[] args) {

        // Cоздание магазина
        Market market = new Market();

        // Cоздание клиентов
        Actor client1 = new OrdinaryClient("Борис", 1);
        Actor client2 = new OrdinaryClient("Ольга", 2);

        Actor client3 = new SpecialClient("Киркоров", 1);

        // Принятие в магазин
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);

        // Обновление
        market.update();

    }
}