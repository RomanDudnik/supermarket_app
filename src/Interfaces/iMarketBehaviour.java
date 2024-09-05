package Interfaces;

import Classes.Actor;

import java.util.List;

public interface iMarketBehaviour {

    // метод принятия в магазин
    public void acceptToMarket(iActorBehaviour actor);

    // метод выдачи из магазина
    public void releaseFromMarket(List<Actor> list);

    // метод обновления
    public void update();
}
