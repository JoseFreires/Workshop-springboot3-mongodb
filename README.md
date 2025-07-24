# Workshop SpringBoot with MongoDB

## Introdução

<p>
Este projeto foi criado com as orientações do curso de Java na plataforma Udemy pelo professor Nélio Alves.
Neste curso foi abordado diversos emas que utilizamos em projetos reais no dia-a-dia, como banco de dados
NoSQL, controles de endpoints e Exceptions, além de executar operações CRUD na entidade USER.
</p>

## Modelo de Domínio
<img width="533" height="179" alt="image" src="https://github.com/user-attachments/assets/2e61564b-0e16-44a2-9f69-2cb56c5313ab" />


## Conceitos Abordados

- Funcionamento de um banco de dados orientado a documentos;
- Realizar operações CRUD;
- Compreender o design de um banco de dados NoSQL;
- Controladores REST.

## Ferramentas Utilizadas

- SpringBoot;
- MongoDB/Mongo Compass.

## Explicando as camadas do projeto
- Camada Repositories: Nesta camada utilizamos a interface JPARepository, uma interface que quando implementada em uma classe facilita a execução dos métodos CRUD sem precisar escrever um extenso código para isso;
- Camada Service: Nesta camada que de fato executamos os métodos CRUD;
- Camada Resource: Nesta camada mapeamos como executar a aplicação por uma API REST, neste caso de forma local.

## Agradecimentos
<p>Queria agradecer ao professor Nélio Alves por mais um conhecimento do seu curso de Java, pois com sua didática clara e direta foi possível criar esse projeto e agregar em meu ramo profissional um novo conhecimento de uma linguagem que gosto tanto que é Java. Acredito que com esse projeto de hoje, criarei melhores projetos amanhã.</p>
