package controller;

public class ContarDigitos
{
	public ContarDigitos()
	{
		super();
	}

	/*
	PONTO DE PARADA -> quando o número for menor do que 10, siginifica que seu
		úlitmo dígito já foi lido, por tanto, devemos parar as chamadas.
	
	RELAÇÃO ENTRE OS PASSOS -> verificamos se o último dígito (Módulo de 10) é
		igual ao alvo, e contamos na variável. Depois somamos essa variável
		o retorno da função que verifica o número sem o último dígito
		(dividido por 10) até chegar ao ponto de parada.
	*/

	public int contarDigitos(int n, int alvo)
	{
		int iguais = 0;

		if (n % 10 == alvo)
			iguais++;
		if (n < 10)
			return iguais;
		return iguais + contarDigitos(n / 10, alvo);
	}
}