package contaBancaria;

import cliente.Cliente;

public abstract class ContaBancaria implements IConta {

    protected static final int AGENCIA_PADRAO =1;
    private static int SEQUENCIAL = 1;

    protected int numero;
    protected int agencia;
    protected double saldo = 0;
    private Cliente cliente;


    public ContaBancaria(Cliente cliente){
        this.agencia = ContaBancaria.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }
    public int getAgencia() {
        return agencia;
    }
    public double getSaldo() {
        return saldo;    
    }

    public void imprimirInfosComuns(){
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %d", this.cliente.getCpf()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f\n", this.saldo));
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" +  valor + " realizado com sucesso!");        
    }

    @Override
    public void sacar(double valor) {
        if(saldo>=valor){
            saldo -= valor;
        }else System.out.println("Erro: Saldo insuficiente");        
    }

    @Override
    public void transferir(double valor, ContaBancaria contaDestino) {
        this.sacar(valor); //aplica o metodo sacar NESTA conta
        contaDestino.depositar(valor); //aplica o metodo depositar na conta destino
}

    @Override
    public String toString() {
        return "ContaBancaria [numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo + ", cliente=" + cliente
                + "]";
    }

}