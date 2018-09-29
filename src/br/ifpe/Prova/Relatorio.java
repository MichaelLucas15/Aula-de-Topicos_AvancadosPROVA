package br.ifpe.Prova;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Relatorio {

	private static final Map<TipoRelatorio, BiFunction<Double, Double, Double>> FUNCOES;

	static {
		FUNCOES = new HashMap<>();

		FUNCOES.put(TipoRelatorio.SOMA, (n1, n2) -> n1 + n2);
		FUNCOES.put(TipoRelatorio.SUBTRACAO, (n1, n2) -> n1 - n2);
		FUNCOES.put(TipoRelatorio.MULTIPLICACAO, (n1, n2) -> n1 * n2);
		FUNCOES.put(TipoRelatorio.DIVISAO, (n1, n2) -> n1 / n2);
		FUNCOES.put(TipoRelatorio.VERIFICA_MAIOR_NUMERO, (n1, n2) -> {
			if (n1 > n2) {
				return n1;
			}
			return n2;
		});
		FUNCOES.put(TipoRelatorio.VERIFICA_MENOR_NUMERO, (n1, n2) -> {
			if (n1 < n2) {
				return n1;
			}
			return n2;
		});
	}

	public static void gerar(TipoRelatorio opcao) {
		File arquivoEntrada = new File("primeiraOperacao.txt");
		File arquivoEntrada1 = new File("segundaOperacao.txt");
		File arquivoSaida = new File("resultado.txt");

		Scanner leitor = null;
		Scanner leitor1 = null;
		PrintWriter escritor = null;

		try {
			leitor = new Scanner(arquivoEntrada);
			leitor1 = new Scanner(arquivoEntrada1);
			escritor = new PrintWriter(arquivoSaida);

			while (leitor.hasNextLine()) {

				String primeiro = leitor.nextLine();
				String segundo = leitor1.nextLine();
				double n1 = Double.parseDouble(primeiro);
				double n2 = Double.parseDouble(segundo);
				escritor.write(FUNCOES.get(opcao).apply(n1, n2).toString());

			}
		} catch (IOException e) {
			/* DO NOTHING */
		} finally {
			if (leitor != null) {
				leitor.close();
			}
			if (escritor != null) {
				escritor.close();
			}
		}
	}

}
