package teste;

public enum Meses {

    JANEIRO(30, "JAN"),
    FEVEREIRO(28, "FEV"),
    MARCO(31, "MAR"),
    ABRIL(30, "ABR"),
    MAIO(31, "MAI"),
    JUNHO(30, "JUN"),
    JULHO(31, "JUL");

    private int dias;
    private String abreviacao;


    private Meses(int dias, String abreviacao) {
        this.dias = dias;
        this.abreviacao = abreviacao;
    }

    public int getDias() {
        return dias;
    }

    public String getAbreviacao() {
        return abreviacao;
    }
}
