package dmmaycon.com.github.projeto.banco.classes;

public class ContaBancariaPj extends ContaBancaria {

	public ContaBancariaPj(String nome, Double saldo, String numero, String tipo) {
		super(nome, saldo, numero, tipo);
	}
	
	
	public void sacar(Double valor) {
		System.out.println("sacar dentro classe filha");
		Double taxa = 0.02;
		if (this.saquesDisponiveis >= 1) {
			this.saldo -= valor;
			--this.saquesDisponiveis;
		} else {
			Double desconto = valor * taxa;
			this.saldo -= (valor + desconto);
		}
		
	}

}
