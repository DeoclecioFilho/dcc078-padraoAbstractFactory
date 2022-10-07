public class Carro {

    private Manual manual;
    private CheckList checkList;
    private Opcionais opcionais;


    public Carro (FabricaAbstrata fabrica){
        this.manual = fabrica.createManual();
        this.checkList = fabrica.createCheckList();
        this.opcionais = fabrica.createOpcionais();
    }



    public String emitirManual() {
        return this.manual.emitir();
    }

    public String emitirCheckList() {
        return this.checkList.emitir();
    }

    public String emitirOpcionais() {
        return this.opcionais.emitir();
    }
}
