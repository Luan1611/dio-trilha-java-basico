//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TiposVariaveis {
    public static void main(String[] args) {


        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //Ao atribuir um valor de tipo maior à uma variável de tipo menor, é necessário realizar casting (conversão explícita)


        final double VALOR_DE_PI = 3.14; //Convenção: constantes devem ser escritas no padrão SNAKE_CASE
        //VALOR_DE_PI = 10.75; //Erro. Constante tem valor imutável.

    }
}