package Classes;

public class Cartao implements CalcularSaldoCartao{
    private double limiteCartao = 0;

    @Override
    public boolean temSaldo(double valorDaCompra) {
        if(valorDaCompra<limiteCartao){
            limiteCartao-=valorDaCompra;
            return true;
        }
        System.out.println("Limite insuficiente");
        return false;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }
}
