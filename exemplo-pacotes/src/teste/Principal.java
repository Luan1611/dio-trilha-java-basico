package teste;

public class Principal {

    public static void main(String[] args) {


        Aluno jose = new Aluno("Jose", "SC3030", Meses.FEVEREIRO);
        Aluno mateus = new Aluno("Mateus", "SC2021", Meses.ABRIL);

        System.out.println("Jose foi matriculado no mês: "  + jose.getMesMatricula().getAbreviacao());
        System.out.println("Mateus foi matriculado no mês: " + mateus.getMesMatricula().getAbreviacao());

        for (Meses mes : Meses.values()) {
            System.out.println(mes.getAbreviacao() + " -> " + mes.getDias() + " dias");
        }


    }

}
