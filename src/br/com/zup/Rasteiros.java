package br.com.zup;

public class Rasteiros extends Inimigos{
    private double danoEspinhos;

    public Rasteiros(String nome, double vida, double danoEspinhos) {
        super(nome, vida);
        this.danoEspinhos = danoEspinhos;
    }

    public double getDanoEspinhos() {
        return danoEspinhos;
    }

    public void setDanoEspinhos(double danoEspinhos) {
        this.danoEspinhos = danoEspinhos;
    }

    public double aplicarDano(){
        return danoEspinhos;
    }
}
