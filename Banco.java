public class Banco {
    public String nomeBanco;
    public ContaBancaria[] contas;

    public Banco(ContaBancaria[] contas) {
        this.contas = contas;
    }

    public Banco(String nomeBanco, ContaBancaria[] contas){
        this.nomeBanco = nomeBanco;
        this.contas = contas;
    }

    public void exibirContas(){
        for(ContaBancaria ContaBancaria:contas){
            System.out.println(contas);
        }
    }

    public void exibirSaldos() {
        System.out.println("Saldos das contas:");
        for (ContaBancaria conta : contas) {
            System.out.println("Conta: " + conta.getNumeroConta() + ", Saldo: R$" + conta.getSaldo());
        }
    }

    public void transferirEntreContas(int numeroContaOrigem, int numeroContaDestino, double valor) {
        ContaBancaria origem = encontrarConta(numeroContaOrigem);
        ContaBancaria destino = encontrarConta(numeroContaDestino);

        if (origem != null && destino != null) {
            origem.transferir(destino, valor);
        } else {
            System.out.println("Uma ou ambas as contas não foram encontradas.");
        }
    }
    public double calcularSaldoTotal() {
        double saldoTotal = 0;
        for (ContaBancaria conta : contas) {
            saldoTotal += conta.getSaldo();
        }
        return saldoTotal;
    }

    private ContaBancaria encontrarConta(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}
