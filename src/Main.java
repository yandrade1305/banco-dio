public class Main {
    public static void main(String[] args) {
        Cliente yan = new Cliente();
        yan.setNome("Yan");

        IConta cc = new ContaCorrente(yan);
        IConta poupanca = new ContaPoupanca(yan);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
