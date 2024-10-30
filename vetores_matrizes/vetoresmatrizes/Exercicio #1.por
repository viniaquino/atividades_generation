programa {
  funcao inicio() {
    inteiro vetor[10] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}

    escreva("Vetor: ")
    para(inteiro i = 0; i < 10; i++)
    {
      escreva(vetor[i])
      se(i < 9)
      {
        escreva(", ")
      }
    }
    escreva("\n")

    para(inteiro i = 0; i < 10; i++)
    {
      para(inteiro x = 0; x < 10 - 1; x++)
      {
        se (vetor[x] < vetor[x + 1])
        {
          inteiro desc = vetor[x]
          vetor[x] = vetor[x + 1]
          vetor[x + 1] = desc
        } 
      }
    }

    escreva("Vetor: ")
    para(inteiro i = 0; i < 10; i++)
    {
      escreva(vetor[i])
      se(i < 9)
      {
        escreva(", ")
      }
    }
    escreva("\n")
  }
}
