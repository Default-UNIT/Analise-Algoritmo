#Funções
def BubbleSort(lista):
  valorTroca = False
  
  i = 1
  
  tamanho = len(lista)

  while i <= len(lista):
    if i == tamanho:
      if not valorTroca: 
        break

      valorTroca = False
      i = 1

    if lista[i - 1] > lista[i]:
      aux = lista[i - 1]
      lista[i - 1] = lista[i]
      lista[i] = aux
      
      valorTroca = True

    i += 1
    

#Programa Principal
#Lista   0, 1, 2, 3, 4
lista = [24, 33, 21, 55, 12]

BubbleSort(lista)
print(lista)
