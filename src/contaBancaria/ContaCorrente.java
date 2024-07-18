package contaBancaria;

import cliente.Cliente;

public class ContaCorrente extends ContaBancaria{
    private static final double TAXA_RENDIMENTO_CC = 0.005;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("### Extrato Conta Corrente ###");
        imprimirInfosComuns();
    }
   
    @Override
    public double renderSaldo(int quatidadeMeses) {
        super.saldo+=super.saldo*TAXA_RENDIMENTO_CC*quatidadeMeses;
        return super.saldo;
    }
}
