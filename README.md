# Exercícios Práticos – Threads em Java

Projeto em Java desenvolvido para a disciplina de **Sistemas Operacionais**, da Universidade Feevale.

## Objetivo

Praticar programação concorrente em Java por meio da criação e execução de threads.

## Iniciando o Projeto
No VS Code, abra `src/App.java` e clique em **Run Java** acima do método `main`. Para executar pelo terminal, na pasta raiz:
```bash
javac src/*.java
java src/App.java
```

Resultado similar esperado:
```bash
=== Início do Programa Principal ===
As threads foram iniciadas!
Thread B -> A
Thread A -> 1
Símbolos -> *
Thread A -> 2
Símbolos -> #
Thread B -> B
Thread B -> C
Símbolos -> @
Thread A -> 3
Símbolos -> $
Thread A -> 4
Thread B -> D
Thread A -> 5
Thread B -> E
Símbolos -> %
Thread B terminou!
Thread A terminou!
Símbolos terminou!
```

## Exercícios

1. Criação e execução de threads.
2. Execução paralela de números e letras.
3. Execução simultânea de números, letras e símbolos.
