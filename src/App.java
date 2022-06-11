import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o nome do produto: ");
        String nomeProduto = sc.nextLine();
        while (nomeProduto == ""){
            System.out.print("Nome inválido! Tente novamente: ");
            nomeProduto = sc.nextLine();
        }
        System.out.print("Entre com o valor do produto: R$");
        double valorProduto = sc.nextDouble();
        while (valorProduto < 0 ){
            System.out.print("Valor inválido! Tente novamente: ");
            valorProduto = sc.nextDouble();
        }
        System.out.print("Entre com a quantidade: ");
        int quantidade = sc.nextInt();
        while (quantidade < 0 ){
            System.out.print("Valor inválido! Tente novamente: ");
            quantidade = sc.nextInt();
        }
         
        Pedido pedido = new Pedido(nomeProduto, valorProduto, quantidade);
        pedido.calcularTotal();
        
        System.out.println("\n----------------PEDIDO----------------");
        System.out.println("PRODUTO    QTDE    VALOR UNIT.  TOTAL");
        System.out.printf("%-10s   %-6dR$%-2.2f  R$%.2f\n\n",pedido.getNome(),pedido.quantidade,pedido.valorProduto,pedido.getTotal());

        sc.close();
    }
}
