public class Operadores {
    public static void main(String[] args) {

        String nomeCompleto = "Luan" + " " + "Marqueti";
        System.out.println(nomeCompleto);

        String concatenacao ="?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);


        int numero = 5;
        System.out.println(-numero); //nao altera a variavel número
        System.out.println(numero);

        numero = -numero;
        System.out.println(numero);

        //numero = + numero; //não dá certo
        numero = numero * -1;

        System.out.println(numero);

        int nro = 3;
        System.out.println(nro);
        System.out.println(nro++); //imprime valor atual, depois incrementa
        System.out.println(nro);
        System.out.println(++nro); //incrementa, depois imprime

        boolean variavel = true;
        System.out.println(variavel);
        System.out.println(!variavel);
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);


        int num = 1;

        System.out.println(num < 0 ? "é negativo" : num==0?"é igual a zero": "é maior do que zero");


        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 == num2;
        System.out.println(simNao);
        simNao = num1 < num2;
        System.out.println(simNao);
        simNao = num1 > num2;
        System.out.println(simNao);
        simNao = num1 <= num2;
        System.out.println(simNao);
        simNao = num1 >= num2;
        System.out.println(simNao);
        simNao = num1 != num2;
        System.out.println(simNao);


        String nomeUm = "Luan"; // pool de string
        String nomeDois = "Luan";
        System.out.println(nomeUm == nomeDois);
        String nomeTres = new String("Luan");
        System.out.println(nomeUm == nomeTres); //false, pois estou comparando um objeto com uma string literal (pool de String)
        //revisar EaD de Strings do Lucas
        System.out.println(nomeUm.equals(nomeTres));

    }
}
