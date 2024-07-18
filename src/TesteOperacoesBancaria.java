import banco.Banco;
import cliente.Cliente;
import contaBancaria.ContaBancaria;
import contaBancaria.ContaCorrente;
import contaBancaria.ContaPoupanca;

public class TesteOperacoesBancaria{
    public static void main(String[] args) {

        Banco bradesco = new Banco();

        Cliente vinicius = new Cliente("Vinicius", 1);
        Cliente maria = new Cliente("Maria",2);

        ContaBancaria cc = new ContaCorrente(maria);
        ContaBancaria poupanca = new ContaPoupanca(vinicius);

        cc.depositar(100);
        cc.depositar(100);

        // cc.imprimirExtrato();
        // // poupanca.imprimirExtrato();
        // 
        cc.transferir(100, poupanca);

        // cc.imprimirExtrato();
        // poupanca.imprimirExtrato();
        
        // cc.sacar(100);
        // cc.imprimirExtrato();
        
        bradesco.adicionarConta(poupanca);       
        bradesco.adicionarConta(cc);       
        
        ((ContaPoupanca) poupanca).renderSaldo(5);
        ((ContaCorrente) cc).renderSaldo(5);
        
        poupanca.imprimirExtrato();
        cc.imprimirExtrato();
        

    }
}