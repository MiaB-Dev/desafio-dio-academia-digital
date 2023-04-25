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
<ul><li>via GET: lista todos os alunos nascidos em dd/mm/yyyy</li></ul>

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
<ul>
<li>via GET: retorna todas as matrículas</li>
<li>via POST: cadastra uma matrícula</li>
</ul>
<h3>/matriculas?bairro=nome</h3>
<ul>
<li>via GET: retorna todas as matrículas do bairro nome</li>
</ul>



<h3>/matriculas/{id}</h3>
<ul>
<li>via GET: retorna a matrícula com id {id}</li>
<li>via DELETE: deleta a matrícula com id {id}</li>
</ul>
</ul>



---
Código base e orientações iniciais por [cami-la](https://www.linkedin.com/in/cami-la/ "cami-la"). Modificações e implementação de outras funcionalidades feitas por Mia Bueno.




