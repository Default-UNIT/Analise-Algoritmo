#Função para o Insertion Sort
def sort(vetor):
    #Laço de repetição para percorrer a lista
    for i in range(len(vetor)):
        #Auxiliar para melhor leitura
        aux = vetor[i]
        #Indice do vetor
        j = i - 1

        #Enquanto as 2 opções forem Verdadeiras
        while j >= 0 and aux < vetor[j]:
            #O num q estava na posição j+1 vai ocupar a posição j
            vetor[j+1] = vetor[j]

            #Caso o aux precise andar mais de uma casa para esquerda
            j -= 1

        #Vetor na posição j+1 vai receber o auxiliar (Para não acontecer erro de repetição na lista)
        vetor[j+1] = aux
    return vetor


#Função Principal

#Lista    0  1  2  3  4
vetor = [ 3, 4, 1, 2, 5 ]

#Função para ordenar a lista
sort(vetor)

#Imprimir a lista ordenada
print(vetor)
