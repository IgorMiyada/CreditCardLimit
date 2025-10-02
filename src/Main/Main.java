package Main;

import Classes.CarrinhoDeCompras;
import Classes.Cartao;
import Classes.Menu;
import Classes.Produto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cartao cartao = new Cartao();
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("Insira um limite de cartão : ");
        double limiteCartao = sc.nextDouble();
        cartao.setLimiteCartao(limiteCartao);
        sc.nextLine();

        String opcaoSair = "0";
        while(opcaoSair.equals("0")){
            try{
                System.out.println("Enter the product name : ");
                String productName = sc.nextLine();
                System.out.println("Enter the product price : ");
                double productPrice = sc.nextDouble();

                if(cartao.temSaldo(productPrice)){
                    carrinhoDeCompras.adicionarProduto(new Produto(productName,productPrice));

                }

                System.out.println("Press 0 to buy another product or 1 to exit ");
                opcaoSair = sc.next();
                sc.nextLine();
            }catch (InputMismatchException error){
                System.out.println("Entrada inválida ! " + error);
            }

        }

        carrinhoDeCompras.organizarLista();

        Menu.exibirTodasAsCompras(carrinhoDeCompras,cartao);
    }
}
