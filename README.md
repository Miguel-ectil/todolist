# 📝 TodoList - API de Gerenciamento de Tarefas

Uma API REST desenvolvida em Java utilizando Spring Boot, projetada para gerenciar tarefas (To-Do List). Este projeto é simples, seguro e ideal para estudos de desenvolvimento back-end.

Inclui integração com banco de dados, segurança dos dados do usuário e foi implantado no serviço Render para facilitar o acesso.

## 📋 Sobre o Projeto
O TodoList é uma API para gestão de tarefas, com recursos como criação, listagem, atualização e exclusão de tarefas. Ele implementa boas práticas de segurança e foi implantado no Render para acesso remoto.

## 🛠️ Tecnologias Utilizadas
As principais tecnologias e ferramentas utilizadas no projeto são:

- Java (versão 11 ou superior)
- Spring Boot (Framework principal)
- Maven (Gerenciador de dependências e build)
- Lombok (Redução de código repetitivo)
- Spring Security (Autenticação e autorização)
- Postman (Testes de API)

## ⚙️ Pré-requisitos
Certifique-se de ter as seguintes ferramentas instaladas em sua máquina para execução local:

1. Java 7+
2. Maven
3. Git
4. (Opcional) Postman para testar os endpoints.

## ✨ Funcionalidades
### Gestão de Tarefas
- 🟢 Criar tarefas: Permite adicionar uma nova tarefa.
- 🟡 Listar tarefas: Exibe todas as tarefas cadastradas.
- 🟠 Atualizar tarefas: Altere o título ou o status de uma tarefa.

### Gerenciamento de Usuários
- 👤 Cadastro de novos usuários.
- 🔐 Login com autenticação e geração de token JWT.

## Segurança
A aplicação utiliza Spring Security para proteger os dados do usuário:

- JWT (JSON Web Token): Para autenticação de rotas protegidas.
- Senhas criptografadas com BCrypt.

## Deploy no Render
A aplicação está implantada no Render, podendo ser acessada publicamente.

- URL de Produção: https://project-todolist-0gdo.onrender.com
### Como usar a API no Render
- Utilize ferramentas como Postman ou Swagger para consumir os endpoints da API.
- Certifique-se de incluir o token JWT para acessar rotas protegidas.

## Contribuições
Contribuições são bem-vindas! Para contribuir:

1. Faça um fork deste repositório.
2. Crie uma branch com sua feature:

```
  git checkout -b minha-feature
```
3. Faça commit das alterações:

```
  git commit -m 'Adicionei minha feature'
```
4. Envie para o repositório remoto:

```
  git push origin minha-feature
```
5. Abra um Pull Request.
