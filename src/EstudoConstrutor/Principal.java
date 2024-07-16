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

        var bolo = new Produto();
        var camiseta = new Produto();
        var relogio = new Produto();

        listaProdutos.add(bolo);
        listaProdutos.add(camiseta);
        listaProdutos.add(relogio);

        System.out.println(listaProdutos.size());
        System.out.println(listaProdutos.get(2));
    }
}