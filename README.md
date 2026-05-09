<img width="816" height="634" alt="image" src="https://github.com/user-attachments/assets/957e6483-6eca-44d5-a58b-631d5445e016" />

<img width="1584" height="700" alt="image" src="https://github.com/user-attachments/assets/ff391341-98a9-41dd-b593-37e2f9b3c589" />

---

# ⚡ S&B Convert (Eletron Converter & Ohm Calculator)

[cite_start]O **S&B Convert** é uma solução de software desenvolvida para mitigar a ineficiência e a alta incidência de erros manuais no cálculo de grandezas elétricas[cite: 21, 22]. [cite_start]Criado para as disciplinas de **Programação Orientada a Objetos** e **Análise e Projeto de Sistemas** da UNISA, o sistema automatiza a conversão de prefixos métricos e a aplicação da Lei de Ohm com rigor técnico e acadêmico[cite: 5, 16, 17].

---

## 🚀 Diferenciais e Funcionalidades

* [cite_start]**Conversor de Escalas:** Transformação entre unidades de Micro (µ) até Mega (M) aplicando os fatores multiplicadores corretos conforme o Sistema Internacional (SI)[cite: 29].
* [cite_start]**Calculadora de Lei de Ohm:** Cálculo automático de Tensão (V), Corrente (A), Resistência (Ω) e Potência (W) a partir de dois valores conhecidos[cite: 24, 29, 37].
* [cite_start]**Rigor Acadêmico:** Processamento com precisão configurada para **10 casas decimais**, garantindo a integridade dos dados para projetos técnicos[cite: 27, 39].
* [cite_start]**Gerenciamento de Histórico (CRUD):** Registro automático de operações com suporte para adição de comentários, exclusão de registros e exportação para arquivo `.txt`[cite: 30, 45, 46].
* [cite_start]**Performance e Portabilidade:** Software incrivelmente leve, com consumo de memória RAM inferior a **50MB** e funcionamento 100% **offline**[cite: 26, 32, 41, 42].

---

## 🏗️ Arquitetura do Sistema

[cite_start]O projeto foi estruturado sob o **Modelo Cascata (Waterfall)**, escolha estratégica devido à estabilidade dos requisitos baseados em leis fixas da física e eletrônica[cite: 49, 50].



[Image of waterfall model software development life cycle]


### Padrões de Projeto (Design Patterns)

* [cite_start]**Singleton (`GerenciadorHistorico`):** Atua como a única memória centralizada da aplicação, garantindo que todas as telas compartilhem a mesma instância de dados[cite: 95, 130].
* [cite_start]**Polimorfismo e Herança:** Utiliza a classe base `Conversor` para centralizar a lógica, enquanto subclasses especializadas (`Mega`, `Kilo`, `Mili`, `Micro`) tratam cada escala métrica de forma personalizada[cite: 91, 93, 127, 128].
* [cite_start]**Observer (Listeners):** Sincroniza a interface gráfica com o histórico, assegurando que novos registros apareçam em tempo real na tabela visual[cite: 130, 230].

---

## 🎨 Identidade Visual

[cite_start]O design utiliza uma paleta de cores "quente" e suave para reduzir a fadiga visual, com um fluxo de trabalho otimizado para concluir cálculos em no máximo 5 cliques[cite: 32].

| Elemento | Cor | Hexadecimal |
| :--- | :--- | :--- |
| **Fundo** | Creme | `#EBE3A5` |
| **Campos** | Amarelo Pastel | `#F2F58E` |
| **Botão Principal** | Ouro | `#F5CC45` |
| **Botão Secundário** | Laranja Outono | `#EBB657` |

---

## 🛠️ Tecnologias Utilizadas

* [cite_start]**Linguagem:** Java 17+ [cite: 240]
* [cite_start]**Biblioteca Gráfica:** Swing / AWT [cite: 231]
* [cite_start]**Gestão de Projeto:** Quadro Kanban (Trello) para organização de tarefas e cronograma[cite: 56, 57].
* [cite_start]**Formatação:** `java.text.DecimalFormat` e `java.time.LocalDateTime` para registros precisos[cite: 45].

---

## ⚙️ Como Executar

1. Certifique-se de ter o **JDK 17** ou superior instalado.
2. [cite_start]Clone o repositório: `git clone https://github.com/Danielsom12/Java-POO-2026.git` [cite: 242]
3. Importe o projeto em sua IDE de preferência (Eclipse, IntelliJ ou VS Code).
4. Execute a classe **`Tela.java`** (localizada no pacote `Conversor`) para iniciar a aplicação.

---

## 👥 Integrantes do Grupo

* [cite_start]**Daniel Sammartano** [cite: 7]
* [cite_start]**Manoela Olim Boross** [cite: 7]
* [cite_start]**Turma:** Engenharia de Software - 5º Semestre (UNISA) [cite: 8]

---
*Desenvolvido com foco em precisão, usabilidade e autonomia técnica.*
