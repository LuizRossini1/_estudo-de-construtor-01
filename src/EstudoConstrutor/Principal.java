/*
1 - Crie uma classe Produto com atributos como nome, preco, e quantidade.
Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos,
imprima o tamanho da lista e recupere um produto pelo índice.

2 - Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto.
Em seguida, imprima a lista de produtos utilizando o método System.out.println().

3 - Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos.
Em seguida, crie objetos Produto utilizando esse novo construtor.

4 - Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor que
utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e
imprima seus valores.
*/

package EstudoConstrutor;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        var produto01 = new Produto("Bolo no pote", 4.99, 25);
        var produto02 = new Produto("Brigadeiro", 1.99, 50);
        var produto03 = new Produto("Pão de mel", 8.99, 10);

        listaProdutos.add(produto01);
        listaProdutos.add(produto02);
        listaProdutos.add(produto03);

        System.out.println("O tamanho da lista é de " +listaProdutos.size()+ " itens");
        System.out.println("O item atual é: " +listaProdutos.get(2));

        System.out.println("");

        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.println(listaProdutos.get(i));
        }
    }
}