# Teste softplan-desafio-fullstack
[![Sofplan](https://www.softplan.com.br/wp-content/themes/softplan-2019/imagens/logo-softplan-blue.svg)](https://www.softplan.com.br/en/solucoes/)

##### Como rodar o projeto
  - Faça o clone do repositório
- Usando Docker
  - Libere as portas 8080, 5432 e 3000 do seu sistema.
  - rode o commando ```docker-compose up --build``` na pasta raiz do projeto
  - pronto!
- Usando apenas o Maven + Postgres + yarn ou npm
  - Abra o arquivo ```src/main/resources/application.properties```
  - Coloque as suas configurações no dataSource, 
  - Trocar o host ```processes-database``` para ```localhost``` ou outro de sua preferência.
  - entre na pasta processesapi
  - rode o comando ```mvn spring-boot:run``` 
  - Abra a pasta front-end e rode o comando yarn start ou npm run start
 
- Configuração do postman
  - Abra a pasta raíz do projeto e importe o arquivo ```processes.postman_collection.json``` no cli do postman.

- Procedimento para testar front-end
  - acesse localhost:3000
  - Registre-se e faça o login
  - Cadastre um usuário triador e um usuário finalizador
  - Deslogue clicando no botão do lado direito superior da tela
  - Logue com o usuário triador que você criou
  - Crie um processo
  - Deslogue novamente
  - Logue com o usuário finalizador.
  - Finalize o processo

- Procedimento para testar end-points no Postman
  - abra a pasta public e altere o body para colocar seus dados
  - após um registro bem sucedido, a response virá com um header ```Authorization``` crie um header Authorization em seu request e adicione o valor que veio da api.
  - As rotas privadas podém ser acessadas somente de tiver esse token
  - dentro das pastas ```users``` e ```processes```, vão ter as rotas que você irá utilizar.

##### Como rodar os testes
  - Entre na pasta processesapi
  - rode o comando mvn test

No banco, postgres na porta 5432 com o padrão
  - nome da tabela em snake_case
  - nome da coluna em snake_case
