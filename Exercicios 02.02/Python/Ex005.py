vetor = []

cont = 0

for i in range(1, 8):
    num = int(input(f'Digite o {i}º número: '))
    vetor.append(num)

for j in vetor:
    if j % 2 == 0:
        cont += 1

print(f'{(cont/len(vetor))*100 :.1f}%')
