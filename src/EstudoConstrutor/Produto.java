package EstudoConstrutor;

public class Produto {
    //Variables
    private String nome;
    private double preco;
    private int quantidade;

    //Constructor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //Setters
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return getNome();
    }
}