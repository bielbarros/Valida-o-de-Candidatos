# Sistema de Recrutamento Automático

Um sistema de recrutamento que simula o processo de seleção de candidatos com base no salário pretendido e contato automático com os candidatos selecionados.

O sistema utiliza critérios de seleção e simula tentativas de contato telefônico para as vagas disponíveis.

# Funcionalidades
* Seleção de Candidatos: O sistema seleciona automaticamente candidatos para vagas com base em um salário pretendido aleatório, comparando com o salário base da vaga.
* Simulação de Contato: Realiza tentativas de contato com os candidatos selecionados, limitando-se a três tentativas. Caso o contato não seja realizado, o sistema informa o usuário.
* Simulação de Salário Pretendido: Cada candidato recebe um salário pretendido aleatório dentro de um intervalo pré-definido, tornando o processo mais dinâmico.
* Mensagens Automatizadas: O sistema exibe mensagens de feedback a cada tentativa de contato, informando o sucesso ou falha do processo.

### Como Funciona
* Seleção de Candidatos: O sistema gera uma lista de candidatos com base em um salário base de R$2000. Candidatos cujo salário pretendido seja menor ou igual ao salário base são selecionados. O processo é interrompido após selecionar 5 candidatos ou após analisar todos os candidatos.
* Tentativas de Contato: Após a seleção, o sistema tenta entrar em contato com cada candidato até 3 vezes, simulando uma resposta aleatória (se o candidato atendeu ou não). Caso o contato não seja realizado após 3 tentativas, o sistema segue para o próximo candidato.
* Simulação de Salário: Cada candidato tem seu salário pretendido gerado aleatoriamente entre R$1800 e R$2200, criando variações no processo de seleção.
### Tecnologias Utilizadas
* Java: Linguagem principal utilizada para a implementação do sistema.
* Conceitos de Programação Orientada a Objetos (POO): O projeto utiliza a separação de responsabilidades em classes e métodos, garantindo uma organização eficiente e modular do código.

### Bibliotecas Java:
* java.util.Random: Para simular decisões aleatórias durante o contato com os candidatos.
* java.util.concurrent.ThreadLocalRandom: Para gerar salários pretendidos aleatórios dentro de um intervalo.
* java.util.List e java.util.ArrayList: Para armazenar e manipular a lista de candidatos selecionados.

### Organização do Projeto
* Main.java: Classe principal que inicializa o processo de seleção e contato com os candidatos.
* Candidato.java: Classe responsável por representar os dados de cada candidato, incluindo nome e salário pretendido.
* Selecao.java: Classe que contém a lógica para selecionar candidatos com base no salário pretendido.
* Contato.java: Classe responsável por gerenciar as tentativas de contato com os candidatos.

### Como Executar o Projeto
* Clone o repositório para o seu ambiente local.
* Importe o projeto no IntelliJ (ou outro IDE de sua preferência).
* Execute a classe Main para iniciar o sistema.
* O sistema exibirá o processo de seleção e as tentativas de contato diretamente no console.

### Exemplo de Saída

O candidato FELIPE solicitou este valor de salário: 1985.73.  
O candidato FELIPE foi selecionado para a vaga.  
O candidato MARCIA solicitou este valor de salário: 2150.32.  
O candidato MARCIA não foi selecionado.  
...
Tentativa 1 com FELIPE falhou.  
Tentativa 2 com FELIPE falhou.  
Contato realizado com sucesso com GUILHERME.
### Contribuições
Este projeto foi criado por mim, Gabriel, desenvolvedor back-end júnior, como parte de um estudo sobre sistemas de recrutamento e automação de processos simples. Sinta-se à vontade para contribuir com melhorias, novas funcionalidades ou otimizações!
