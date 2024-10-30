programa {
  funcao inicio() {
    inteiro vetor[10], soma = 0
    real media

    para(inteiro i = 0; i < 10; i++)
    {
      escreva("Digite o ", i + 1, "º número: ")
      leia(vetor[i])
    }

    escreva("\nElementos nos indices ímpares:\n")
    para(inteiro i = 0; i < 10; i++)
    {
      se(i % 2 != 0)
      {
        escreva(vetor[i], " ")
      }
    }
    escreva("\n")

    escreva("\nElementos pares:\n")
    para(inteiro i = 0; i < 10; i++)
    {
      se(vetor[i] % 2 == 0)
      {
        escreva(vetor[i], " ")
      }
    }
    escreva("\n")

    para(inteiro i = 0; i < 10; i++)
    {
      soma = soma + vetor[i]
    }
    escreva("\nSoma: ", soma, "\n")

    media = soma / 10
    escreva("\nMédia: ", media, "\n")
  }
}
