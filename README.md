# Task Manager API

Uma API RESTful para gerenciamento de tarefas, desenvolvida com Java, Spring Boot e MySQL.

## 🚀 Tecnologias Utilizadas

* Java 17+
* Spring Boot (Spring Web, Spring Data JPA)
* MySQL
* Hibernate
* Lombok

## 📌 Funcionalidades

✅ Criar uma nova tarefa\
✅ Listar todas as tarefas\
✅ Buscar uma tarefa por ID\
✅ Atualizar uma tarefa\
✅ Deletar uma tarefa

## 📦 Configuração do Projeto

### 📑 Pré-requisitos

* Java 21
* MySQL
* Maven

### 🛠️ Configuração do Banco de Dados

1. Crie um banco de dados no MySQL:

```
sql

CREATE DATABASE taskmanager;
```

2. Configure o application.properties ou application.yml:

```
properties

spring.datasource.url=jdbc:mysql://localhost:3306/taskmanager
spring.datasource.username=root
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### ▶️ Como Executar

1. Clone o repositório:
```
git clone https://github.com/seu-usuario/rest-task-manager.git
cd rest-task-manager

```
2. Compile e execute o projeto:
```
mvn spring-boot:run

```
### 📡 Endpoints da API


