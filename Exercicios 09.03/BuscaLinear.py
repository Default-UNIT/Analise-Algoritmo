import time

def busca(v, x):
  i = 0

  while i < len(v):
    if v[i] == x:
      return i
    i += 1

  return -1


vetor = list(range(0,1000000))

antes = time.time()
depois = time.time()
tempo = (depois-antes)*1000
posicao = busca(vetor,900000)
if posicao >= 0:
  print(f"encontrado na posição {posicao}")
else:
  print("nao encontrado")

print(f"{tempo:.2f}")
