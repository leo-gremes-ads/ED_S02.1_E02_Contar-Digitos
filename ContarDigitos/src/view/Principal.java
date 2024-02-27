package view;

import controller.ContarDigitos;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args)
	{
		int n, alvo, digitos;
		ContarDigitos cd = new ContarDigitos();

		n = inteiro_valido("Digite um número entre 10 e 999999: ", 10, 999999, false);
		alvo = inteiro_valido("Digite um número entre 0 e 9: ", 0, 9, true);
		digitos = cd.contarDigitos(n, alvo);
		System.out.println("O alvo aparece aparece " + digitos + " vezes.");

	}

	// Preferia validar em uma classe separada, mas o enunciado diz pra validar no main
	// Bloco de código muito grande pra ficar dentro da main, visto que é usado 2 vezes
	private static int inteiro_valido(String msg, int min, int max, boolean close)
	{
		int n;
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print(msg);
			try {
				n = s.nextInt();
			} catch (Exception e) {
				System.out.println("Não é um número inteiro! Tente novamente");
				s.next();
				continue;
			}
			if (n < min || n > max) {
				System.out.println("Número fora do intervalo! Tente novamente");
				continue;
			}
			break;
		}
		if (close)
			s.close();
		return n;
	}
}