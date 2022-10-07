public class FabricaSedan implements FabricaAbstrata{
    @Override
    public Manual createManual() {
        return new ManualSedan();
    }

    @Override
    public CheckList createCheckList() {
        return new CheckListSedan();
    }

    @Override
    public Opcionais createOpcionais() {
        return new OpcionaisSedan();
    }
}
