package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora {

    @Override
    public void digitalizar() {
        System.out.println("MULTIFUNCIONAL DIGITALIZANDO...");
    }

    @Override
    public void copiar() {
        System.out.println("MULTIFUNCIONAL COPIANDO...");
    }

    @Override
    public void imprimir() {
        System.out.println("MULTIFUNCIONAL IMPRIMINDO...");
    }

}