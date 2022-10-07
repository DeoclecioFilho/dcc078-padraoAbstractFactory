import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    @Test
    void deveEmitirManualHatch() {
        FabricaAbstrata fabrica = new FabricaHatch();
        Carro carro = new Carro(fabrica);
        assertEquals("Manual de carros Hatch",carro.emitirManual());
    }
    @Test
    void deveEmitirManualPickUp() {
        FabricaAbstrata fabrica = new FabricaPickUp();
        Carro carro = new Carro(fabrica);
        assertEquals("Manual de carros PickUp",carro.emitirManual());
    }
    @Test
    void deveEmitirManualSedan() {
        FabricaAbstrata fabrica = new FabricaSedan();
        Carro carro = new Carro(fabrica);
        assertEquals("Manual de carros Sedan",carro.emitirManual());
    }


    @Test
    void deveEmitirCheckListHatch() {
        FabricaAbstrata fabrica = new FabricaHatch();
        Carro carro = new Carro(fabrica);
        assertEquals("CheckList de carros Hatch",carro.emitirCheckList());
    }
    @Test
    void deveEmitirCheckListPickUp() {
        FabricaAbstrata fabrica = new FabricaPickUp();
        Carro carro = new Carro(fabrica);
        assertEquals("CheckList de carros PickUp",carro.emitirCheckList());
    }
    @Test
    void deveEmitirCheckListSedan() {
        FabricaAbstrata fabrica = new FabricaSedan();
        Carro carro = new Carro(fabrica);
        assertEquals("CheckList de carros Sedan",carro.emitirCheckList());
    }

    @Test
    void deveEmitirOpcionaisHatch() {
        FabricaAbstrata fabrica = new FabricaHatch();
        Carro carro = new Carro(fabrica);
        assertEquals("Opcionais de carros Hatch",carro.emitirOpcionais());
    }
    @Test
    void deveEmitirOpcionaisPickUp() {
        FabricaAbstrata fabrica = new FabricaPickUp();
        Carro carro = new Carro(fabrica);
        assertEquals("Opcionais de carros PickUp",carro.emitirOpcionais());
    }
    @Test
    void deveEmitirOpcionaisSedan() {
        FabricaAbstrata fabrica = new FabricaSedan();
        Carro carro = new Carro(fabrica);
        assertEquals("Opcionais de carros Sedan",carro.emitirOpcionais());
    }

}