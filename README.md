# Desafio: CRUD de Clientes - DevSuperior

Este repositório contém a solução do desafio prático do capítulo de **API REST, camadas, CRUD, exceções e
validações**, integrante da Formação Desenvolvedor Moderno.

## 📌 Sobre o Projeto

O objetivo desta atividade foi desenvolver um sistema completo de gerenciamento de clientes utilizando **Spring Boot** e
**Java**. O projeto consiste em uma API REST que permite realizar as cinco
operações básicas (CRUD) sobre um recurso de clientes.

O sistema utiliza o banco de dados **H2** para testes e segue uma arquitetura em camadas para
garantir a separação de responsabilidades.

## 🎓 Aprendizados e Competências

Durante a execução deste desafio, pude consolidar os seguintes conhecimentos técnicos:

- **Desenvolvimento de Web Services REST:** Implementação de endpoints para busca, inserção, atualização e
  deleção de recursos.
- **Tratamento de Exceções:** Criação de respostas customizadas para erros comuns, como o código **404 (Not
  Found)** para IDs inexistentes.
- **Validação de Dados:** Uso de Bean Validation (como `@PastOrPresent`) para garantir a integridade dos
  dados e retornar o código **422 (Unprocessable Entity)** com mensagens de erro detalhadas.
- **Paginação de Recursos:** Implementação de busca paginada para otimizar a performance da
  API.
- **Mapeamento Objeto-Relacional (JPA):** Configuração de entidades e tratamento de convenções de
  nomenclatura (camelCase vs snake_case).

## 🧪 Checklist de Testes (Postman)

Para garantir a qualidade da entrega, foram realizados os 10 testes manuais previstos na especificação do
projeto:

- [x] Busca por id retorna cliente existente
- [x] Busca por id retorna 404 para cliente inexistente
- [x] Busca paginada retorna listagem paginada corretamente
- [x] Inserção de cliente insere cliente com dados válidos
- [x] Inserção de cliente retorna 422 e mensagens customizadas com dados inválidos
- [x] Atualização de cliente atualiza cliente com dados válidos
- [x] Atualização de cliente retorna 404 para cliente inexistente
- [x] Atualização de cliente retorna 422 e mensagens customizadas com dados inválidos
- [x] Deleção de cliente deleta cliente existente
- [x] Deleção de cliente retorna 404 para cliente inexistente

---
Desenvolvido por Matheus Duarte como parte do curso **DevSuperior**.