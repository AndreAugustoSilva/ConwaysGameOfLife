Projetinho de recriação do Conway's Game Of Life no console do java.

Instruções de uso:

Células representadas por um "0" na matriz são células "mortas", e células representadas por um "1" são células "vivas".
Use a matriz na parte superior do código e troque células "0" por "1", e ao rodar a simulação, células vivas passarão a ser representadas por "#".
Se preferir, crie uma matriz personalizada seguindo os padrões citados nas observações.

Regras:

Ao passar das gerações, células ganham vida ou morrem a cada quadro. Estas são as regras do jogo da vida:

- Superpopulação: Qualquer célula viva com 4 OU MAIS vizinhas vivas morre por excesso de população.
- Subpopulação: Qualquer célula viva com MENOS DE 2 vizinhas vivas morre de solidão.
- Continuidade: Qualquer célula viva com 2 OU 3 vizinhas vivas continua viva para a próxima geração.
- Reprodução: Qualquer célula morta com EXATAMENTE 3 vizinhas vivas ganha vida.

OBSERVAÇÕES IMPORTANTES:

- A matriz não deve ter dimensões distintas, ela deve ser totalmente simétrica, ou seja, mesmo número de linhas e colunas.
- O canvas (borda) conta como células mortas, e dependendo da contraption utilizada, deve se evitar construi-la muito perto do fim do tabuleiro.
Dica: Utilize uma matriz um pouco maior que a sua contraption ocuparia, idealmente uma linha e coluna a mais para cada lado.
- Você pode pré-renderizar um tabuleiro utilizando o bloco de aleatoriedade identificado no código e o bloco comentado acima da matriz.
- Matrizes maiores podem levar mais tempo para serem renderizadas.

E o mais importante, tenha um bom uso do programa!

Feito por: André Augusto Silva - MI82