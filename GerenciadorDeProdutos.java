import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeProdutos {
    private List<Produto> produtos;

    public GerenciadorDeProdutos() {
        this.produtos = new ArrayList<>();
    }

    public boolean adicionarProduto(Produto produto) {
        for (Produto p : produtos) {
            if (p.getCodigoProduto().equals(produto.getCodigoProduto())) {
                System.out.println("Erro: Já existe um produto com o código " + produto.getCodigoProduto());
                return false;
            }
        }
        produtos.add(produto);
        return true;
    }

    public boolean removerProduto(String codigoProduto) {
        return produtos.removeIf(produto -> produto.getCodigoProduto().equals(codigoProduto));
    }

    public Produto buscarProdutoPorNome(String nomeProduto) {
        for (Produto p : produtos) {
            if (p.getNomeProduto().equalsIgnoreCase(nomeProduto)) {
                return p;
            }
        }
        return null;
    }

    public List<Produto> buscarProdutosPorCategoria(String categoriaProduto) {
        List<Produto> produtosCategoria = new ArrayList<>();
        for (Produto p : produtos) {
            if (p.getCategoriaProduto().equalsIgnoreCase(categoriaProduto)) {
                produtosCategoria.add(p);
            }
        }
        return produtosCategoria;
    }

    public boolean alterarProduto(String codigoProduto, Produto novoProduto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigoProduto().equals(codigoProduto)) {
                produtos.set(i, novoProduto);
                return true;
            }
        }
        return false;
    }

    public List<Produto> obterTodosProdutos() {
        return new ArrayList<>(produtos);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        for (Produto p : produtos) {
            valorTotal += p.getValorTotalEstoque();
        }
        return valorTotal;
    }
}
