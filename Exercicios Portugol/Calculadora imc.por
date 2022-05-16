programa
{    inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
	     cadeia nome
	     real kg, altura, imc, imcarredonda
	     
		escreva("Bem-vindos a nossa plataforma de cálculo de IMC!\n\nPor favor digite seu nome: ")
		leia(nome)
		escreva(nome, " informe seu peso em kg: ")
		leia(kg)
		escreva(nome, " informe sua altura: ")
		leia(altura)
		
		imc = kg / (altura * altura)
		imcarredonda = mat.arredondar(imc, 2)
		escreva(imcarredonda)

		 se(imcarredonda <= 18.5){
		  	escreva("\nClasificação: Magreza")	
		  }senao se(imcarredonda <= 24.9){
		  	escreva("\nClasificação: Normal")
		  }senao se(imcarredonda <= 29.9){
		  	escreva("\nClasificação: Sobrepeso")	
		  }senao se(imcarredonda <= 39.9){
		  	escreva("\nClasificação: Obesidade")
		  }senao{
		  	escreva("\nClasificação: Obesidade Grave")
		  }

		   escreva("\n", nome, ", saiba mais sobre nossos programas de alimentação saudável!.\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 925; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */