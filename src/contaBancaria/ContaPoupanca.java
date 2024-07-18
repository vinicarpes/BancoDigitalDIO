package contaBancaria;

import cliente.Cliente;

public class ContaPoupanca extends ContaBancaria{

    private static final double TAXA_RENDIMENTO_POUPANCA = 0.031;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("### Extrato Conta Poupança ###");
        imprimirInfosComuns();
    }

    public double renderSaldo(int quatidadeMeses){
        super.saldo+=super.saldo*TAXA_RENDIMENTO_POUPANCA*quatidadeMeses;
        return super.saldo;
    }
}
