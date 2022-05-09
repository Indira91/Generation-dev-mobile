programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	     cadeia nome
	     real n1, n2, n3, media
	     
		escreva("Digite seu nome: ")
		leia(nome)

		escreva("\nEntre a primeira nota: ")
		leia(n1)
		escreva("\nEntre a segunda nota:")
		leia(n2)
		escreva("\nEntre a terceira nota:")
		leia(n3)

	     media = (n1+n2+n3)/3

	     se (media >=7.0)
	     {
	     	 escreva("\nAluno:" + nome + " parabens você foi aprovado com ", mat.arredondar(media, 2)) 
	     	
	     }
	     senao se (media >=4 e media <=7.0)
	     {
	     	escreva("\nAluno: " + nome + " infelizmente precisa refazer o exame ", mat.arredondar(media, 2))  
	     }
	     senao
	     {
	     	escreva("\nAluno: " + nome + " você foi reprovado ", mat.arredondar(media, 2))
	     }

	    

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 762; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */