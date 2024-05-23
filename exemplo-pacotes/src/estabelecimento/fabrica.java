package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.LaserJet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class fabrica {

    public static void main(String [] args) {

        //Pode representar os 3 papéis
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

/*        DeskJet deskJet = new DeskJet();
        Impressora impressora = deskJet;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = deskJet;*/

/*        Scanner scanner = new Scanner();
        Impressora impressora = scanner;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = scanner;*/

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();



    }

}