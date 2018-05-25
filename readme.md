# Xadrez!!!!
obs: Não é preciso fazer o xadrez funcionar!!!!!

1. (0.05) Mude o tabuleiro para que tenha o tamanho real de um jogo de xadrez.

2. (0.05) Crie todas as peças necessárias para que o jogo de xadrez funcione.

3. (0.10) Tente criar um objeto do tipo Peca. O que acontece? Porquê? (pesquisar o que é uma classe abstrata).

4. (0.10) Crie uma nova classe que desenhe o tabuleiro de forma diferente, mas sem reimplementar o método desenhar.

5. (0.10) Crie uma classe que desenhe o tabuleiro de forma diferente, mas agora reimplementando o método desenhar.

6. (0.15) Faça com que o método movimentosPossiveis da Torre devolva as casas as quais ela pode se mexer (para testar, é preciso usar o método selecionar da peca antes de atualizar e desenhar o tabuleiro).

7. (0.10) Faça com que o movimentosPossiveis do Peao devolva as casas as quais ele pode se mexer. (para testar, é preciso usar o método selecionar da peca antes de atualizar e desenhar o tabuleiro).

8. (0.20) Escolha ou o Bispo ou o Cavalo e também implemente o método movimentosPossiveis.

9. (0.15) O "desenho" das peças no terminal está na mesma classe que controla a lógica da peça. Faça uma sugestão de como separar estas duas partes. (Não é preciso necessariamente implementar).

Exemplo: A Torre quando selecionada deve retornar as Casas as quais ela pode terminar o movimento. Casa com "- -" é uma casa em que a Torre pode ir.
```
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|- -|- -|- -| T |- -|- -|- -|- -|
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
```

A Torre pode andar em cima de uma peça de outra cor, mas não pode andar em cima de uma de mesma cor.

```
+---+---+---+---+---+---+---+---+
|   |   |   | t |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |-p-|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|- -|- -|- -| T |- -| P |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
```

## Recomendações:
1. Entender o que o código faz antes de começar a programar.
2. Fazer diagramas, testes e comentários para ajudar no entendimento do código.

## Condições:
1. No máximo em dupla.
2. Entrega no dia 17/05, por email.
3. A dupla poderá ser arguida sobre as resoluções e caso as respostas não sejam satisfatórias, poderá ter suas notas alteradas.
