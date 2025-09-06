# TPLivro

Um aplicativo Android simples para o cadastro de livros, demonstrando a passagem de dados entre duas telas.

## Descrição

Este projeto é um aplicativo Android básico desenvolvido em Kotlin, criado como um Trabalho Prático (TP) para a disciplina de Programação para Dispositivos Móveis. O aplicativo permite ao usuário inserir o título e o autor de um livro. Após o cadastro, as informações são enviadas e exibidas em uma segunda tela de detalhes.

## Funcionalidades

* **Tela de Cadastro:** Permite ao usuário inserir o título e o autor de um livro usando `TextInputEditText`.
* **Validação de Campos:** Verifica se ambos os campos (título and autor) foram preenchidos antes de prosseguir.
* **Tela de Detalhes:** Exibe as informações do livro cadastrado (título e autor) em uma `CardView` para uma apresentação clara.
* **Navegação entre Atividades:** Utiliza `Intent` para passar os dados do livro da tela de cadastro para a tela de detalhes.
* **Modelo de Dados:** Utiliza uma data class `Livro` para encapsular as informações do livro.

## Tecnologias Utilizadas

* **Linguagem:** Kotlin
* **UI:** Android XML com ConstraintLayout, CardView e Material Components
* **Componentes:** Activity, Intent, AlertDialog
* **Build:** Gradle

