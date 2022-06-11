public class Pedido {
    
    private String nomeProduto;
    public double valorProduto;
    public int quantidade;
    private double total;
    
    public Pedido(String nomeProduto, double valorProduto, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidade = quantidade;
    }

    public void calcularTotal() {
        total = valorProduto * quantidade;
    }

    public double getTotal() {
        return total;
    }

    public String getNome() {
        return nomeProduto;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    

    


}
