# 🚗 EDS Estética Automotiva - Sistema de Agendamento

> Trabalho Prático de Programação Orientada a Objetos I - IFMG Ouro Branco

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Java_Swing-GUI-blue?style=for-the-badge)
![MVC](https://img.shields.io/badge/Architecture-MVC-green?style=for-the-badge)

## 📄 Sobre o Projeto

O **EDS Estética Automotiva** é um sistema desktop desenvolvido em **Java** para gerenciar o agendamento de serviços de estética automotiva (como lavagem, polimento e insulfilm).

O objetivo principal foi aplicar na prática os conceitos de **Programação Orientada a Objetos (POO)**, utilizando arquitetura **MVC** e persistência de dados em arquivos de texto (`.txt`), sem uso de banco de dados relacional.

O sistema permite que clientes se cadastrem, registrem seus veículos (Carros ou Motos) e realizem agendamentos, com cálculo dinâmico de preços baseado na categoria do veículo.

---

## ⚙️ Funcionalidades

-   ✅ **Autenticação:** Login e Cadastro de Clientes.
-   ✅ **Gestão de Veículos:** Cadastro de Carros e Motos vinculados automaticamente ao CPF do usuário logado.
-   ✅ **Agendamento Inteligente:**
    -   Seleção de veículo via lista dinâmica.
    -   Filtragem de serviços compatíveis (ex: Moto não faz serviços exclusivos de Carro).
    -   Cálculo automático de preço (Polimorfismo: SUVs pagam mais que Hatchs, etc).
-   ✅ **Meus Agendamentos:** Visualização de histórico e cancelamento de serviços.
-   ✅ **Persistência:** Salvamento automático de Clientes, Veículos e Agendamentos em arquivos `.txt`.

---

## 🛠️ Tecnologias Utilizadas

-   **Linguagem:** Java (JDK 21)
-   **Interface Gráfica:** Java Swing (JFrame, JDialog, JTable)
-   **Arquitetura:** MVC (Model-View-Controller)
-   **Persistência:** Manipulação de Arquivos (java.io)
-   **Conceitos de POO:**
    -   Herança e Polimorfismo (Classe abstrata `Veiculo`).
    -   Encapsulamento.
    -   Tratamento de Exceções Personalizadas (`AppException`).
    -   Interfaces e Generics (`IDAO<T>`).

---

## 📐 Arquitetura do Sistema

O projeto segue estritamente o padrão **MVC**:

1.  **View:** Telas (Forms) que interagem com o usuário. Não possuem regra de negócio.
2.  **Controller:** Intermediam a comunicação, validam dados (CPFs, datas) e chamam o DAO.
3.  **Model:** Classes de domínio (`Cliente`, `Carro`, `Agendamento`) e Enums.
4.  **DAO:** Camada de acesso a dados responsável por ler e escrever nos arquivos `.txt`.
   
---

## 🚀 Como Executar o Projeto

### Pré-requisitos
-   Java JDK 21 ou superior instalado.
-   Uma IDE (IntelliJ IDEA, VS Code ou Eclipse).

### Passo a Passo

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/SEU-USUARIO/NOME-DO-REPO.git](https://github.com/SEU-USUARIO/NOME-DO-REPO.git)
    ```

2.  **Abra o projeto na sua IDE.**

3.  **Localize a classe principal:**
    Navegue até `src/view/TelaLogin.java` (ou `TelaPrincipal.java`).

4.  **Execute a aplicação:**
    Rode o método `main`.

> **Nota:** Na primeira execução, o sistema criará automaticamente os arquivos `clientes.txt`, `veiculos.txt` e `agendamento.txt` na pasta raiz do projeto.

---

## 👨‍💻 Autores

Este projeto foi desenvolvido pelos alunos do curso de **Sistemas de Informação** do **IFMG - Campus Ouro Branco**:

-   **Eduardo Henrique Oliveira de Sousa**
-   **Eduardo Henrique Ribeiro Coelho**
-   **Mateus von Sperling de Vasconcellos Nascimento**
-   **Samuel Angelo Rezende Ribeiro**

---

## 📝 Licença

Este projeto é de uso acadêmico. Sinta-se à vontade para usá-lo como referência para estudos.
