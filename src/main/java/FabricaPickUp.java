public class FabricaPickUp implements FabricaAbstrata{
    @Override
    public Manual createManual() {
        return new ManualPickUp();
    }

    @Override
    public CheckList createCheckList() {
        return new CheckListPickUp();
    }

    @Override
    public Opcionais createOpcionais() {
        return new OpcionaisPickUp();
    }
}
