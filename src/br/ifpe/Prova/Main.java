package br.ifpe.Prova;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("OBS: Coloque os valores no arquivo de texto ('primeiraOperacao.txt','segundaOperacao.txt')");
		System.out.println("");
		System.out.println("");
		System.out.println(" ______________________________________________________________________");
		System.out.println("|_________________Bem vindo ao gerador de relatórios___________________|");
		System.out.println("|                                                                      |");
		System.out.println("|Digite 1 - Para efetuar a soma:                                       |");
		System.out.println("|Digite 2 - Para efetuar a subtração:                                  |");
		System.out.println("|Digite 3 - Para efetuar a multiplicação:                              |");
		System.out.println("|Digite 4 - Para efetuar a divisão:                                    |");
		System.out.println("|Digite 5 - Para ver qual é o maior numero:                            |");
		System.out.println("|Digite 6 - Para ver quel é o menor numero:                            |");
		System.out.println(" ----------------------------------------------------------------------");

		Scanner sc = new Scanner(System.in);
		int numeral = sc.nextInt();

		if (numeral == 1) {
			Relatorio.gerar(TipoRelatorio.SOMA);
			System.out.println("Veja o resultado no arquivo 'resultado.txt'");
		} else if (numeral == 2) {
			Relatorio.gerar(TipoRelatorio.SUBTRACAO);
			System.out.println("Veja o resultado no arquivo 'resultado.txt'");
		} else if (numeral == 3) {
			Relatorio.gerar(TipoRelatorio.MULTIPLICACAO);
			System.out.println("Veja o resultado no arquivo 'resultado.txt'");
		} else if (numeral == 4) {
			Relatorio.gerar(TipoRelatorio.DIVISAO);
			System.out.println("Veja o resultado no arquivo 'resultado.txt'");
		} else if (numeral == 5) {
			Relatorio.gerar(TipoRelatorio.VERIFICA_MAIOR_NUMERO);
			System.out.println("Veja o resultado no arquivo 'resultado.txt'");
		} else if (numeral == 6) {
			Relatorio.gerar(TipoRelatorio.VERIFICA_MENOR_NUMERO);
			System.out.println("Veja o resultado no arquivo 'resultado.txt'");
		}
	}

}
