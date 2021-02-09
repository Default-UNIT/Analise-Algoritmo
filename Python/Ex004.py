vetor = []

for i in range(1, 8):
    num = int(input(f'Digite o {i}º número: '))
    vetor.append(num)

print(f'{max(vetor)}-{min(vetor)}')
