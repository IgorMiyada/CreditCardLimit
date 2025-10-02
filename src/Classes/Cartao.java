package Classes;

public class Cartao implements CalcularSaldoCartao{
    private double limiteCartao;
    private double saldo;


    public Cartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
        this.saldo = limiteCartao;
    }

    @Override
    public boolean temSaldo(double valorDaCompra) {
        if(valorDaCompra<saldo){
            saldo-=valorDaCompra;
            return true;
        }
        System.out.println("Saldo insuficiente");
        return false;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }
}
