<h2>Desenvolvimento de testes unitários para cobertura de uma API em Spring Boot para o gerenciamento de estoques de cerveja</h2>

Neste projeto foi desenvolvido testes unitários para uma API REST responsável por fazer o gerenciamento de um estoque de cervejas, criada com o Spring Boot.

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Para executar a suíte de testes, basta executar o seguinte comando:

```shell script
mvn clean test
```

Após executar o comando acima, basta abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/beers
```

Após executar o projeto, basta abrir o seguinte endereço em um navegador e vizualizar a interface do swagger: 

```
http://localhost:8080/swagger-ui.html
```

São necessários os seguintes pré-requisitos para a execução do projeto:

* Java 11 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.
