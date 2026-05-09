<img width="816" height="634" alt="image" src="https://github.com/user-attachments/assets/957e6483-6eca-44d5-a58b-631d5445e016" />

<img width="1584" height="700" alt="image" src="https://github.com/user-attachments/assets/ff391341-98a9-41dd-b593-37e2f9b3c589" />

---

# ⚡ S&B Convert (Eletron Converter & Ohm Calculator)

[cite_start]O **S&B Convert** é um software em Java desenvolvido para mitigar a ineficiência e a alta incidência de erros manuais no cálculo de grandezas elétricas[cite: 21, 22]. [cite_start]Criado para as disciplinas de **Programação Orientada a Objetos** e **Análise e Projeto de Sistemas** da UNISA, o sistema automatiza a conversão de prefixos métricos e a aplicação da Lei de Ohm com rigor técnico e acadêmico[cite: 5, 16, 17].

---

## 🚀 Diferenciais e Funcionalidades

* [cite_start]**Conversor de Escalas:** Transformação entre unidades de Micro (µ) até Mega (M) aplicando fatores multiplicadores do Sistema Internacional (SI)[cite: 29].
* [cite_start]**Calculadora de Lei de Ohm:** Cálculo automático de Tensão (V), Corrente (A), Resistência (Ω) e Potência (W) a partir de dois valores conhecidos[cite: 24, 29].
* [cite_start]**Rigor Acadêmico:** Processamento com precisão de até **10 casas decimais**, garantindo a integridade dos dados[cite: 27, 39].
* [cite_start]**Gerenciamento de Histórico (CRUD):** Registro em tempo real com opções de adicionar comentários, remover itens e exportar para arquivo `.txt`[cite: 30, 45, 46].
* [cite_start]**Performance Otimizada:** Software incrivelmente leve, com consumo de memória RAM inferior a **50MB**[cite: 26, 32].

---

## 🏗️ Arquitetura do Sistema

[cite_start]O projeto foi construído sob o **Modelo Cascata (Waterfall)**, garantindo uma estrutura linear e requisitos técnicos estáveis baseados nas leis da física[cite: 49, 50].



[Image of waterfall model software development life cycle]


### Padrões de Projeto (Design Patterns)

* [cite_start]**Singleton (`GerenciadorHistorico`):** Garante que todas as telas compartilhem a mesma instância de memória centralizada[cite: 95, 130].
* [cite_start]**Polimorfismo e Herança:** A classe base `Conversor` centraliza a lógica, enquanto as subclasses (`Mega`, `Kilo`, `Mili`, `Micro`) tratam as escalas de forma personalizada[cite: 91, 93].
* [cite_start]**Observer (Listeners):** Sincroniza a interface gráfica com o histórico para atualizações em tempo real[cite: 130, 230].

---

## 🎨 Identidade Visual

[cite_start]O projeto utiliza uma paleta de cores "quente" para reduzir a fadiga visual e um fluxo de trabalho onde qualquer cálculo é concluído em no máximo 5 cliques[cite: 32].

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
* [cite_start]**Arquitetura:** Programação Orientada a Objetos (POO) [cite: 5]
* [cite_start]**Gestão de Projeto:** Quadro Kanban (Trello) [cite: 56, 57]

---

## ⚙️ Como Executar

1. Certifique-se de ter o **JDK 17** ou superior instalado.
2. [cite_start]Clone o repositório: `git clone https://github.com/Danielsom12/Java-POO-2026.git` [cite: 242]
3. Importe o projeto em sua IDE (Eclipse, IntelliJ ou VS Code).
4. Execute a classe `Tela.java` no pacote `Conversor` para iniciar.

---

## 👥 Integrantes do Grupo

* [cite_start]**Daniel Sammartano** [cite: 7]
* [cite_start]**Manoela Olim Boross** [cite: 7]
* [cite_start]**Turma:** Engenharia de Software - 5º Semestre (UNISA) [cite: 8]

---
[cite_start]*Desenvolvido com foco em precisão, usabilidade e autonomia 100% offline[cite: 41].*
