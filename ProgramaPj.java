package dmmaycon.com.github.projeto.banco.apps;

import dmmaycon.com.github.projeto.banco.classes.ContaBancariaPj;
import dmmaycon.com.github.projeto.banco.classes.ContaBancaria;

public class ProgramaPj {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancariaPj("João da Silva", 900.00, "123456", "PJ");
		
		System.out.println("===========================");
		System.out.println("Criando conta");
		System.out.println("===========================");
		System.out.println("Conta: " + conta1.numero);
		System.out.println("Titular: " + conta1.nome);
		System.out.println("Tipo: " + conta1.tipo);
		System.out.println("Saldo: " + conta1.saldo);		
		
		
		conta1.depositar(100.0); // a classe deve ter seu saldo para 889.99
		System.out.println("===========================");
		System.out.println("Deposito");
		System.out.println("===========================");
		System.out.println("Conta: " + conta1.numero);
		System.out.println("Titular: " + conta1.nome);
		System.out.println("Tipo: " + conta1.tipo);
		System.out.println("Saldo: " + conta1.saldo);
		
		
		conta1.sacar(500.0); // a classe deve ter seu saldo para 399.99
		System.out.println("===========================");
		System.out.println("Saque 1");
		System.out.println("===========================");
		System.out.println("Conta: " + conta1.numero);
		System.out.println("Titular: " + conta1.nome);
		System.out.println("Tipo: " + conta1.tipo);
		System.out.println("Saldo: " + conta1.saldo);
		
		conta1.sacar(500.0); // a classe deve ter seu saldo para 399.99
		System.out.println("===========================");
		System.out.println("Saque 2");
		System.out.println("===========================");
		System.out.println("Conta: " + conta1.numero);
		System.out.println("Titular: " + conta1.nome);
		System.out.println("Tipo: " + conta1.tipo);
		System.out.println("Saldo: " + conta1.saldo);
		
		conta1.sacar(500.0); // a classe deve ter seu saldo para 399.99
		System.out.println("===========================");
		System.out.println("Saque 3");
		System.out.println("===========================");
		System.out.println("Conta: " + conta1.numero);
		System.out.println("Titular: " + conta1.nome);
		System.out.println("Tipo: " + conta1.tipo);
		System.out.println("Saldo: " + conta1.saldo);
		
		conta1.sacar(500.0); // a classe deve ter seu saldo para 399.99
		System.out.println("===========================");
		System.out.println("Saque 4");
		System.out.println("===========================");
		System.out.println("Conta: " + conta1.numero);
		System.out.println("Titular: " + conta1.nome);
		System.out.println("Tipo: " + conta1.tipo);
		System.out.println("Saldo: " + conta1.saldo);

	}

}
