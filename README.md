# hospede-java-api
 

#1- Configuracao do banco de dados
Necessário instalacao do docker.
Executar o comando abaixo para baixar a imagem do postgres e iniciar o container.
docker run --rm -P -p 127.0.0.1:5432:5432 -e POSTGRES_PASSWORD="1234" --name pg postgres:alpine

Executar o script: createdb.sql para a criacao das tabelas.
