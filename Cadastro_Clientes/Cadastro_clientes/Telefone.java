package Cadastro_clientes;

public class Telefone {
    private int DDD;
    private int Numero;

    public Telefone (int ddd, int nu) {
        this.DDD = ddd;
        this.Numero = nu;
    }
    public int getDDD() {
        return DDD;
    }
    public void setDDD(int dDD) {
        DDD = dDD;
    }
    public int getNumero() {
        return Numero;
    }
    public void setNumero(int numero) {
        Numero = numero;
    }
}