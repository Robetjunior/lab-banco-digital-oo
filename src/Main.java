public class Main {

	public static void main(String[] args) {
		// Criando clientes
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Cliente maria = new Cliente();
		maria.setNome("Maria");

		// Criando contas para os clientes
		Conta ccVenilton = new ContaCorrente(venilton);
		Conta poupancaVenilton = new ContaPoupanca(venilton);

		Conta ccMaria = new ContaCorrente(maria);
		Conta poupancaMaria = new ContaPoupanca(maria);

		// Operações com conta do Venilton
		ccVenilton.depositar(500);
		ccVenilton.sacar(150);
		ccVenilton.transferir(200, poupancaVenilton);

		// Operações com conta da Maria
		ccMaria.depositar(1000);
		ccMaria.transferir(300, poupancaMaria);
		poupancaMaria.sacar(100);

		// Impressão dos extratos
		System.out.println("\n--- EXTRATOS DE VENILTON ---");
		ccVenilton.imprimirExtrato();
		poupancaVenilton.imprimirExtrato();

		System.out.println("\n--- EXTRATOS DE MARIA ---");
		ccMaria.imprimirExtrato();
		poupancaMaria.imprimirExtrato();
	}
}
