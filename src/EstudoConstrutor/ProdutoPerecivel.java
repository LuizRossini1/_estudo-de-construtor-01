package EstudoConstrutor;

public class ProdutoPerecivel extends Produto {
    //Constructor
    public ProdutoPerecivel(String nome, double preco, int quantidade, double dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    //Variables
    private double dataValidade;

    //Getters
    public double getDataValidade() {
        return dataValidade;
    }
}