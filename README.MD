# Teste softplan-desafio-fullstack
[![Sofplan](https://www.softplan.com.br/wp-content/themes/softplan-2019/imagens/logo-softplan-blue.svg)](https://www.softplan.com.br/en/solucoes/)

##### Como rodar o projeto
  - Faça o clone do repositório
- Usando Docker
  - Libere as portas 5001, 7894 e 3000 do seu sistema.
  - rode o commando ```docker-compose up --build``` na pasta raiz do projeto
  - pronto!
- Usando apenas o Maven + MYSQL + yarn ou npm
  - Rode o banco com docker ```docker run -p 7894:3306 --name processes-db -e MYSQL_DATABASE=processes -e MYSQL_ROOT_PASSWORD=root -d mysql:latest mysqld --default-authentication-plugin=mysql_native_password```
  - Abra a pasta da api e rode o comando ```mvn spring-boot:run -Dspring-boot.run.arguments=--spring.profiles.active=dev``` 
  - Abra as pastas dos front-ends e rode o comando yarn start ou npm run start

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
  - Entre na pasta api
  - rode o comando mvn test