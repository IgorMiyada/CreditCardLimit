package Classes;

public class Menu {

    public static void exibirTodasAsCompras(CarrinhoDeCompras carrinhoDeCompras,Cartao cartao){
        System.out.println("Produtos comprados : ");
        carrinhoDeCompras.exibirListaDeCompras();
        System.out.println("Saldo restante : ");
        System.out.println(cartao.getLimiteCartao());
    }
}
