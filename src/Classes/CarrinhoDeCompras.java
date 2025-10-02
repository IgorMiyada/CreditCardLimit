package Classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarrinhoDeCompras implements CalculoTotalDeCompras{
    private List<Produto> listaDeProdutos = new ArrayList<>();
    private double totalDeCompras = 0;

    public void adicionarProduto(Produto produto){
        this.listaDeProdutos.add(produto);
    }

    public void exibirListaDeCompras(){
        for (Produto produto : listaDeProdutos){
            System.out.println(produto);
        }
    }

    public void organizarLista(){
        this.listaDeProdutos.sort(Comparator.comparing(Produto::getPrice));
    }

    @Override
    public double calcularCompras() {
        for (Produto produto : listaDeProdutos){
            totalDeCompras+=produto.getPrice();
        }

        return totalDeCompras;
    }

    public  List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public double getTotalDeCompras() {
        return totalDeCompras;
    }
}
