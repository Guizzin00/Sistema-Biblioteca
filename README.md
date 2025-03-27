Sistema de Biblioteca 📚
Contexto
Este projeto tem como objetivo criar um sistema que gerencia itens de uma biblioteca (como livros e revistas) e o empréstimo desses itens por usuários.

Estrutura do Sistema
O sistema é composto por várias classes, cada uma responsável por um aspecto específico do gerenciamento da biblioteca. As classes principais são:

ItemBiblioteca

Livro (herda de ItemBiblioteca)

Revista (herda de ItemBiblioteca)

Usuario

Classes e Atributos
Classe: ItemBiblioteca
Atributos:

titulo (String): Título do item.

ano_publicacao (int): Ano em que foi publicado.

disponivel (boolean): Indica se o item está disponível para empréstimo.

Método:

detalhes(): Retorna informações detalhadas do item.

Classe: Livro (Herda de ItemBiblioteca)
Atributos adicionais:

autor (String): Nome do autor do livro.

numero_paginas (int): Quantidade de páginas.

isbn (String): Código ISBN do livro.

Método:

detalhes(): Retorna informações formatadas específicas de um livro.

Classe: Revista (Herda de ItemBiblioteca)
Atributos adicionais:

numero (int): Número da edição da revista.

periodicidade (String): Exemplo: "semanal", "mensal".

editora (String): Nome da editora.

Método:

detalhes(): Retorna informações formatadas específicas de uma revista.

Encapsulamento
O atributo disponivel na classe ItemBiblioteca deve ser protegido para garantir que ele só seja alterado através de métodos específicos, como emprestar() e devolver(). Isso garante a integridade dos dados.

Classe de Composição: Usuario
Atributos:

nome (String): Nome do usuário.

id_usuario (int): Identificador único do usuário.

itens_emprestados (Lista de ItemBiblioteca): Lista de itens que o usuário pegou emprestado.

Método:

emprestar_item(item: ItemBiblioteca): Adiciona um item à lista de itens emprestados, verificando se o item está disponível para empréstimo.

Objetivos do Exercício
Abstração: A classe ItemBiblioteca serve para definir a estrutura comum de todos os itens, como livros e revistas.

Herança: As classes Livro e Revista estendem ItemBiblioteca e personalizam o método detalhes() para fornecer informações específicas de cada tipo de item.

Encapsulamento: A manipulação do atributo disponivel é feita através de métodos específicos, garantindo que o status do item seja controlado corretamente.

Polimorfismo: O método detalhes() pode ser chamado em diferentes tipos de itens (livros ou revistas), retornando informações distintas dependendo do tipo do item.

Composição: A classe Usuario armazena uma lista de instâncias de ItemBiblioteca e pode gerenciar os itens que o usuário pegou emprestado.











