public class Produto {
    private String nomeProduto;
    private String codigoProduto;
    private String descricaoProduto;
    private double precoProduto;
    private int quantidadeEstoque;
    private String categoriaProduto;

    public Produto(String nomeProduto, String codigoProduto, String descricaoProduto, double precoProduto, int quantidadeEstoque, String categoriaProduto) {
        this.nomeProduto = nomeProduto;
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoriaProduto = categoriaProduto;
    }

    // Getters e setters

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public double getValorTotalEstoque() {
        return precoProduto * quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nomeProduto + ';' +
                ", codigo='" + codigoProduto + ';' +
                ", descricao='" + descricaoProduto + ';' +
                ", preco=" + precoProduto +
                ", quantidadeEstoque=" + quantidadeEstoque +';'+
                ", categoria='" + categoriaProduto + ';' +
                '}';
    }
}
