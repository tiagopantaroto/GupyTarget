# Respostas do desafio Estágio Target 2024

1. [Resposta da questão 1:](https://github.com/tiagopantaroto/GupyTarget/blob/8edce34533f64554ad21b20b8519f570323bdece/questao1.kt) 91
2. [Resposta da questão 2](https://github.com/tiagopantaroto/GupyTarget/blob/8edce34533f64554ad21b20b8519f570323bdece/pertenceAFibonacci.kt)
3.
a) 1, 3, 5, 7, **9**

b) 2, 4, 8, 16, 32, 64, **128**

c) 0, 1, 4, 9, 16, 25, 36, **49**

d) 4, 16, 36, 64, **100**

e) 1, 1, 2, 3, 5, 8, **13**

f) 2,10, 12, 16, 17, 18, 19, **10000**

4. Definindo as lâmpadas como 1, 2 e 3 e as salas como A, B e C, eu faria da seguinte forma:

- Ligaria a lâmpada 1, esperaria no mínimo 10 minutos para que a lâmpada esquentasse, desligaria a lâmpada 1 e ligaria a lâmpada 2.
- Entraria na sala A:
    - Se a lâmpada estiver acesa, então a lâmpada 2 é da sala A. 
      - Ligaria a lâmpada 1 e entraria na sala B:
        - Se a lâmpada estiver acesa, então: A2, B1, C3.
        - Se a lâmpada não estiver acesa, então: A2, B3, C1
    - Se a lâmpada não estiver acesa, verificaria se está quente. 
      - Se estiver, então a lâmpada 1 é da sala A.
        - Entraria na sala B:
          - Se a lâmpada estiver acesa, então: A1, B2, C3.
          - Se a lâmpada não estiver acesa, então: A1, B3, C2.
      - Se não estiver, então a lâmpada 3 é da sala A.
        - Entraria na sala B:
          - Se a lâmpada estiver acesa, então: A3, B2, C1.
          - Se a lâmpada não estiver acesa, então: A3, B3, C2.

5.[Resposta da questão 5](https://github.com/tiagopantaroto/GupyTarget/blob/9208eb62bb58a83efc3ec859446020ffaf970518/inverterString.kt)
