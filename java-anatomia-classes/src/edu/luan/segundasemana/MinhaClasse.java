package edu.luan.segundasemana;

public class MinhaClasse {

    //cada bloco de código é delimitado por chaves

    // Método principal da classe executável "MinhaClasse"
    public static void main(String[] args) {

        //System, me dê uma saída, que será uma impressão
        System.out.println("Olá mundo!");

        String meuNome = "Luan Marqueti";

        int anoDeNascimento = 1993;

        boolean verdadeira = false;

        anoDeNascimento = 2002;


        String firstName = "Luan";
        String lastName = "Marqueti";

        String name = nomeCompleto(firstName, lastName);
        System.out.println(name);


    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {

        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);

    }

}