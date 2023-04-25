<h1>Projeto API de uma academia usando Spring Data JPA </h1>
<p> Projeto implementado para o desafio "Conhecendo Spring Data JPA na prática com Java" da (<a href="https://dio.me/"><strong>DIO</strong></a>).<br>

<h2>🎯 Objetivo do Projeto</h2>
<p>Conhecer os principais conceitos de mapeamento objeto relacional (ORM) usando o <strong>Spring Data JPA</strong>. Para isso, uma <strong>API RESTful</strong> será desenvolvida com ênfase na modelagem de suas entidades, no domínio de uma academia de ginástica.</p>



<h2>🛠 Tecnologias Utilizadas</h2>

<ul>
    <li>VS Code</li>
    <li>Java 11</li>
    <li>Maven</li>
    <li><strong>Spring Web</strong></li>
    <li><strong>Spring Data JPA</strong></li>
    <li><strong>PostgreSQL Driver</strong></li>
    <li><strong>Hibernate Validator</strong></li>
    <li>Lombok</li>
    <li>Postman</li>
</ul>

<h2>Rotas</h2>
<h3>/alunos</h3>
<ul>
<li>via GET: lista todos os alunos cadastrados</li>
<li>via POST: cadastra um aluno </li>
</ul>
<h3>/alunos/{id}</h3>
<ul>
<li>via GET: lista o aluno com id {id}</li>
<li>via PUT: atualiza os dados do aluno com id {id}</li>
<li>via DELETE: deleta o aluno com id {id}</li>
</ul>
<h3>/alunos/avaliacoes/{id}</h3>
<ul><li>via GET: lista todas as avaliações do aluno com a id {id}</li></ul>
<h3>/alunos?dataDeNascimento=dd/mm/yyyy</h3>
<ul><li>via GET: lista todos os alunos com data de nascimento dd/mm/yyyy</li></ul>

<h3>/avaliacoes</h3>
<ul>
<li>via GET: lista todos as avaliações cadastradas</li>
<li>via POST: cadastra uma avaliacao de um aluno</li>
</ul>
<h3>/avaliacoes/{id}</h3>
<ul>
<li>via GET: retorna a avaliação com id {id}</li>
<li>via PUT: atualiza a avaliação com id {id}</li>
<li>via DELETE: deleta a avaliação com id {id}</li>
</ul>
<h3>/matriculas/</h3>


<h2><a href="https://strn.com.br/artigos/2018/12/11/todas-as-anota%C3%A7%C3%B5es-do-jpa-anota%C3%A7%C3%B5es-de-mapeamento/"> Anotações de Mapeamento </a></h2>

<strong>@Entity</strong>
Usada para especificar que a classe anotada atualmente representa um tipo de entidade.

<strong>@Table</strong>
Usada para especificar a tabela principal da entidade atualmente anotada.

<strong>@Id</strong>
Especifica o identificador da entidade. Uma entidade deve sempre ter um atributo identificado.

<strong>@GeneratedValue</strong>
Especifica que o valor do identificador de entidade é gerado automaticamente.

<strong>@Column</strong>
Usada para especificar o mapeamento entre um atributo de entidade básico e a coluna da tabela de banco de dados.

<strong>@JoinColumn</strong>
Usada para especificar a coluna FOREIGN KEY. Indica que a entidade é a responsável pelo relacionamento.

<strong>@OneToMany</strong>
Usada para especificar um relacionamento de banco de dados um-para-muitos.

<strong>@OneToOne</strong>
Usada para especificar um relacionamento de banco de dados um-para-um.

<strong>@ManyToOne</strong>
Usada para especificar um relacionamento de banco de dados muitos-para-um.

<strong>cascade</strong>
Realizar operações em cascata só faz sentido em relacionamentos Pai - Filho.

<strong>mappedBy</strong>
Indica qual é o lado inverso ou não dominante da relação.

---
Código base e orientações iniciais por [cami-la](https://www.linkedin.com/in/cami-la/ "cami-la"). Modificações e implementação de outras funcionalidades feitas por Mia Bueno.




