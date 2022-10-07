public class FabricaHatch implements FabricaAbstrata{

    @Override
    public Manual createManual() {
        return new ManualHatch();
    }

    @Override
    public CheckList createCheckList() {
        return new CheckListHatch();
    }

    @Override
    public Opcionais createOpcionais() {
        return new OpcionaisHatch();
    }

}
