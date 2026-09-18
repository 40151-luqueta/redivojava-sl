package model;

public class Violao extends InstrumentoMusical {
    private int cordas;

    public Violao(String nome, String material, int cordas) {
        super(nome, material);
        this.cordas = cordas;
    }

    @Override
    public String tocar() {
        return "TRIN TUM TOM";
    }

    public int getCordas() {
        return cordas;
    }
}
