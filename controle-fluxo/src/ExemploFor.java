public class ExemploFor {
    public static void main(String[] args) {

        //estrutura 1
/*        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }*/

        //estrutura 2
        //o que importa é somente o bloco condicional
        int carneirinhos = 8;
        for( ; carneirinhos <=20; ) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
            carneirinhos ++;
        }
        System.out.println(carneirinhos);


        String [] alunos = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        for(int numero = 1; numero <=5; numero ++) {
            if(numero==3)
                break;

            System.out.println(numero);

        }

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;

            System.out.println(numero);

        }


    }
}