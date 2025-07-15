# 💻 Criando um Banco Digital com Java e Orientação a Objetos

## 📅 Mentoria #1 - 02/08/2021
🎥 [Tire Suas Dúvidas Sobre Orientação a Objetos](https://www.youtube.com/watch?v=YS6ouOhkyNI)

---

## 🧠 Desafio

A proposta deste projeto é aplicar os conceitos fundamentais da **Programação Orientada a Objetos (POO)** utilizando **Java**, por meio da construção de uma aplicação que simula um **banco digital**.

### 🎯 Cenário:

> Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de **depósito**, **saque** e **transferência** (entre contas da própria instituição).

---

## 📌 Objetivo

- Reforçar os fundamentos de **POO em Java**;
- Exercitar os pilares da orientação a objetos;
- Criar uma aplicação orientada a objetos com estrutura modular, reutilizável e extensível.

---

## 🔍 Conceitos Aplicados

### 🔹 Abstração
Capacidade de focar nos elementos essenciais do domínio bancário. Neste projeto, as classes `Cliente`, `Conta`, `ContaCorrente` e `ContaPoupanca` representam abstrações de entidades reais.

### 🔹 Encapsulamento
Os atributos das classes são privados ou protegidos, sendo acessados somente por meio de métodos públicos, protegendo os dados e oferecendo uma interface limpa de uso.

### 🔹 Herança
A classe abstrata `Conta` centraliza o comportamento comum entre os tipos de conta. As classes `ContaCorrente` e `ContaPoupanca` herdam da classe `Conta`.

### 🔹 Polimorfismo
A interface `IConta` define o contrato comum entre os tipos de conta. Dessa forma, é possível tratar `ContaCorrente` e `ContaPoupanca` de forma genérica por meio dessa interface.

---

## 🛠️ Estrutura do Projeto
```bash
src/
├── Banco.java # Representa o banco com uma lista de contas
├── Cliente.java # Representa o cliente do banco
├── Conta.java # Classe abstrata com comportamento comum entre contas
├── ContaCorrente.java # Conta corrente com extrato personalizado
├── ContaPoupanca.java # Conta poupança com extrato personalizado
├── IConta.java # Interface com o contrato de operações bancárias
└── Main.java # Classe principal que executa a aplicação
```
## ✅ Funcionalidades

- Criar clientes
- Criar contas (corrente e poupança)
- Realizar depósito
- Realizar saque
- Realizar transferências entre contas
- Imprimir extratos personalizados

---

## 🧪 Exemplo de Execução

```java
Cliente venilton = new Cliente();
venilton.setNome("Venilton");

Conta cc = new ContaCorrente(venilton);
Conta poupanca = new ContaPoupanca(venilton);

cc.depositar(100);
cc.transferir(100, poupanca);

cc.imprimirExtrato();
poupanca.imprimirExtrato();
```