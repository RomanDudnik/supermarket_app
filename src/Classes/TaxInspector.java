package Classes;

import Interfaces.iActorBehaviour;

public class TaxInspector implements iActorBehaviour {

    private String name;

    private boolean isTakeOrder;

    private boolean isMakeOrder;

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
        return new OrdinaryClient("Mystery shopper", 1);
    }
}
