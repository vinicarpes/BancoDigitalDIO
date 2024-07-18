package banco;

import java.util.ArrayList;
import java.util.List;
import contaBancaria.ContaBancaria;

public class Banco {
    private String nome;

    private List<ContaBancaria> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta){
        this.contas.add(conta);
    }

    public void removerConta(ContaBancaria conta){
        this.contas.remove(conta);
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    @Override
    public String toString() {
        return "Banco [nome=" + nome + ", contas=" + contas + "]";
    }

    
}
