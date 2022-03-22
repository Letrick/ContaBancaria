import java.util.Scanner;

public class ContaBancaria {

	public static void menu() {
		System.out.println("\tCONTA BANCARIA");
		System.out.println("\nQual o tipo de conta?\n");

		System.out.println("1. PF");
		System.out.println("2. PJ");
		System.out.println("3. Finalizar");

		System.out.println("Opcao: ");
	}

	public static void PF() {
		System.out.println("Entrando como Pessoa Fisica");
	}

	public static void PJ() {
		System.out.println("Entrando como Pessoa Juridica");
	}

	public static void Finalizar() {
		System.out.println("Finalizando o sistema!");
	}

	public static void Saldo() {
		System.out.println("Verifique seu saldo");
	}

	public static void Sacar() {
		System.out.println("Prossiga para sacar");
	}

	public static void Depositar() {
		System.out.println("Prossiga para depositar");
	}

	public static void main(String args[]) {

		int opcao;

		Scanner entrada = new Scanner(System.in);

		do {
			menu();
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				PF();
				break;

			case 2:
				PJ();
				break;

			case 3:
				Finalizar();
				break;

			default:
				System.out.println("Opção inválida.");
			}

			if (opcao == 1) {

				System.out.flush();

				int opcao2;

				System.out.println("\tCONTA BANCARIA TIPO PESSOA FISICA");
				System.out.println("\tO que deseja fazer?");

				System.out.println("0. Fim");
				System.out.println("1. Saldo");
				System.out.println("2. Sacar");
				System.out.println("3. Depositar");
				System.out.println("Opcao:");

				do {

					System.out.flush();

					opcao2 = entrada.nextInt();

					switch (opcao2) {
					case 1:
						Saldo();
						break;

					case 2:
						Sacar();
						break;

					case 3:
						Depositar();
						break;

					case 0:
						System.out.println("\n Fim!");
						break;
					}

				} while (opcao2 != 0);

			}

			else if (opcao == 2) {

				System.out.flush();

				System.out.println("\tCONTA BANCARIA TIPO PESSOA JURIDICA");
				System.out.println("\tO que deseja fazer?");

				System.out.println("0. Fim");
				System.out.println("1. Saldo");
				System.out.println("2. Sacar");
				System.out.println("3. Depositar");
				System.out.println("Opcao:");

			}

			else if (opcao == 3) {

				System.out.println("\nFinalizando sistema! ");

			}

			else {

				System.out.println("Opção inválida.");
			}

		} while (opcao == 0);

		/* final do codigo */

	} /* linha 40 */

} /* linha 3 */
