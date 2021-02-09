vetor = []

somarPar = 0
somarImpar = 0
cont = 0

for i in range(1, 8):
    num = int(input(f'Digite o {i}º número: '))
    vetor.append(num)

for j in vetor:
    if cont % 2 == 0:
        somarPar += j
    else:
        somarImpar += j

    cont += 1

print(f'{somarPar}-{somarImpar}')
