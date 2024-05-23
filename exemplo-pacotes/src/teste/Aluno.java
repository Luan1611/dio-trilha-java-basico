package teste;

public class Aluno {

    private String nome;
    private String matricula;
    private Meses mesMatricula;

    public Aluno(String nome, String matricula, Meses mesMatricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.mesMatricula = mesMatricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }


    public Meses getMesMatricula() {
        return mesMatricula;
    }

}
