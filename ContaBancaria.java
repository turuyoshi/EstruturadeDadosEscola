public class ContaBancaria {
    public int numeroConta;
    public String nomeCliente;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeCliente, double saldoInicial){
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso na conta " + numeroConta);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso na conta " + numeroConta);
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
            return false;
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " da conta " + this.numeroConta + " para a conta " + destino.getNumeroConta() + " realizada com sucesso.");
        }
    }
}

