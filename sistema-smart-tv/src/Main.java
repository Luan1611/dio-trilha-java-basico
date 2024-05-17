//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        SmartTV minhaTV = new SmartTV();
        System.out.println(minhaTV.getCanal());
        System.out.println(minhaTV.getVolume());
        System.out.println(minhaTV.isLigada());

        minhaTV.mudarDeCanal("Avançar"); // Só se pode mudar de canal se a TV estiver ligada
        System.out.println(minhaTV.getCanal());

        minhaTV.ligar();
        System.out.println(minhaTV.isLigada());

        minhaTV.mudarDeCanal("Avançar");
        System.out.println(minhaTV.getCanal());

        minhaTV.mudarDeCanal("Retroceder");
        System.out.println(minhaTV.getCanal());

        minhaTV.mudarDeCanal(100);
        System.out.println(minhaTV.getCanal());

        minhaTV.mudarDeCanal(130); // Não existe canal 130
        System.out.println(minhaTV.getCanal());


        SmartTV minhaOutraTV = new SmartTV(1, 99);
        System.out.println(minhaOutraTV.getVolume());

        minhaOutraTV.ligar();

        minhaOutraTV.aumentarVolume();
        System.out.println(minhaOutraTV.getVolume());

        minhaOutraTV.aumentarVolume(); // Volume máximo é 100
        System.out.println(minhaOutraTV.getVolume());

        minhaOutraTV.mudarDeCanal("Retroceder");
        System.out.println(minhaOutraTV.getCanal());

    }
}