package DESAFIOS.Loja;

class Produtos {
    private int valoresPagos;
    private String nomeDoProduto;

    public Produtos(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public int getValoresPagos() {
        return valoresPagos;
    }

    public void setValoresPagos(int valoresPagos) {
        this.valoresPagos = valoresPagos;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }
}