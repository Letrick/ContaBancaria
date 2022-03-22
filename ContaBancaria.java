package dmmaycon.com.github.projeto.banco.classes;

public class ContaBancaria {
	// declaração de atributos
	// visibilidade tipo nomeDoAtributo
	
	public String nome;
	public Double saldo;
	public String numero;
	public String tipo; // "PJ" ou "PF"
	public Integer saquesDisponiveis;
	
	public ContaBancaria(String nome, Double saldo, 
			String numero, String tipo) {
		this.nome = nome;
		this.saldo = saldo;
		this.numero = numero;
		this.tipo = tipo;
		this.saquesDisponiveis = 3;
	}
	
	
	public void sacar(Double valor) {
//		Double taxa = 0.02;
//		if (this.tipo.equals("PF")) {
//			taxa = 0.01;
//			if (valor > this.saldo) {
//				System.err.println("Valor solicitado maior que o saldo");
//				return;
//			}
//		} 
//		System.out.println(this.saquesDisponiveis);
//		if (this.saquesDisponiveis >= 1) {
//			this.saldo -= valor;
//			--this.saquesDisponiveis;
//		} else {
//			Double desconto = valor * taxa;
//			this.saldo -= (valor + desconto);
//		}
		this.saldo -= valor;
		
	}
	
	public void depositar(Double valor) {		
//		Double taxa = 0.01;
//		if (this.tipo.equals("PJ")) {			
//			taxa = 0.02;
//		} 
//		Double desconto = valor * taxa;
		this.saldo += valor;	
	}	
	
	
}
