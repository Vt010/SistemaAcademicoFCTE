package ain.java.model;

public class Matricula {
    private String codigoDisc;
    private boolean trancada;

    public Matricula(String codigoDisciplina) {
        this.codigoDisc = codigoDisciplina;
        this.trancada = false;
    }

    public String getCodigoDisc() { return codigoDisc; }
    public boolean isTrancada() { return trancada; }

    public void trancar() {
        this.trancada = true;
    }
}