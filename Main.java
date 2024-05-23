import java.util.List;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeProdutos gerenciador = new GerenciadorDeProdutos();

        Produto produto1 = new Produto("Produto 1", "1", "Descricao Produto 1", 10.0, 5, "Categoria 1");
        Produto produto2 = new Produto("Produto 2", "2", "Descricao Produto 2", 20.0, 10, "Categoria 2");

        // Adicionando produtos
        gerenciador.adicionarProduto(produto1);
        gerenciador.adicionarProduto(produto2);

        // Tentando adicionar um produto com código duplicado
        Produto produtoDuplicado = new Produto("Produto 3", "1", "Descricao Produto 3", 15.0, 7, "Categoria 1");
        gerenciador.adicionarProduto(produtoDuplicado);

        // Alterando um produto
        Produto produtoAlterado = new Produto("Produto 1 Alterado", "1", "Descricao 1 Alterada", 12.0, 8, "Categoria 1");
        gerenciador.alterarProduto("1", produtoAlterado);

        // Excluindo um produto
        gerenciador.removerProduto("2");

        // Buscando por nome
        Produto produtoBuscadoPorNome = gerenciador.buscarProdutoPorNome("Produto 1 Alterado");
        System.out.println("Produto buscado por nome: " + produtoBuscadoPorNome);

        // Buscando por categoria
        List<Produto> produtosCategoria1 = gerenciador.buscarProdutosPorCategoria("Categoria 1");
        System.out.println("Produtos na Categoria 1: " + produtosCategoria1);

        // Obtendo todos os produtos
        List<Produto> todosProdutos = gerenciador.obterTodosProdutos();
        System.out.println("Todos os produtos: " + todosProdutos);

        // Calculando o valor total em estoque
        double valorTotalEstoque = gerenciador.calcularValorTotalEstoque();
        System.out.println("Valor total em estoque: " + valorTotalEstoque);
    }
}
