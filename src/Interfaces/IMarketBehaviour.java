package Interfaces;

import Classes.Actor;

import java.util.List;

public interface IMarketBehaviour {

    // метод принятия в магазин
    public void acceptToMarket(Actor actor);

    // метод выдачи в магазин
    public void releaseToMarket(List<Actor> list);

    // метод обновления
    public void update();
}
