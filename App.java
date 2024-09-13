public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta1 = new ContaBancaria(1, "Arthur", 9999.99);
        ContaBancaria conta2 = new ContaBancaria(2, "Pedro", 500.00);

        Banco banco = new Banco(new ContaBancaria[]{conta1, conta2});


        banco.exibirSaldos();
        System.out.println();

 
        banco.transferirEntreContas(1, 2, 200.00);
        System.out.println();


        banco.exibirSaldos();
        System.out.println();


        System.out.println("Saldo total de todas as contas: R$" + banco.calcularSaldoTotal());
    }
}
