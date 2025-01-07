public class ProdutoPerecivel extends Produto{
    private int dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade,int dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + ", Preço: " + this.getPreco() + ", Quantidade: " + this.getQuantidade() + ", Validade: " + this.dataValidade;
    }
}
