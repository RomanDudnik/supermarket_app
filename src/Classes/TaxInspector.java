package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Класс инспектора
 */
public class TaxInspector implements iActorBehaviour, iReturnOrder {

    private String name;

    private boolean isTakeOrder;

    private boolean isMakeOrder;

    private boolean isCheckOrder;


    public TaxInspector() {
        this.name = "TaxInspector";
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean val) {
        this.isTakeOrder = val;
    }

    @Override
    public void setMakeOrder(boolean val) {
        this.isMakeOrder = val;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient("Mystery shopper", 1, false);
    }

    @Override
    public boolean ReturnOrder() {
        return this.ReturnOrder();
    }

    @Override
    public void checkOrder() {
        this.isCheckOrder = true;
    }
}
