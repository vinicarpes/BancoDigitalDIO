package contaBancaria;
public interface IConta {
    public void sacar(double valor);
        
    public void transferir(double valor, ContaBancaria contaDestino);

    public void depositar(double valor);

    public void imprimirExtrato();

    public double renderSaldo(int quatidadeMeses);
}