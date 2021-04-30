# Guia: Uso de Armazenamento de Dados em Banco de Dados no Android

Nesse projeto utilizei a ```Activity``` para permitir que o usuário possa trabalhar com armazenamento de informações em banco de dados.

Os dados serão armazenados usando o banco de dados ```SQLite```, banco de dados nativo do sistema ```Android```.
Para ilustração dos conceitos foi utilizado armazenamento de informações sobre cliente.

Assim como no armazenamento de arquivos, o ```Android``` faz o armazenamento das aplicações no banco de dados usando o armazenamento interno.
Por essa razão, os dados são privados para a aplicação que foi usada para manipular esses dados.
Além disso, caso a aplicação seja removida do sistema, todos os dados vinculado à ela serão deletados.

A aplicação de exemplo que apresentada utiliza duas Activitys:
- 1 - Cadastrar o ```Nome``` e ```CPF``` de cliente;
- 2 - Visualizar os dados de todos os clientes que já foram cadastrados (Consulta ao banco).

Dessa maneira, além da ```MainActivity``` (para cadastrar os dados de um cliente) teremos também a ```ViewActivity``` (para exibir os dados dos clientes).

Para usar de maneira organizada o banco de dados no ```Android```, serão criadas as ```classes```:
- ```Cliente```: para modelar os dados de cliente;
- ```ClienteContract```: para registrar a estrutura da base de dados usada no projeto;
- ```ClienteDbHelper```: para implementar as operações de gravação e consulta dos dados no projeto.
