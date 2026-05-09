<img width="816" height="634" alt="image" src="https://github.com/user-attachments/assets/957e6483-6eca-44d5-a58b-631d5445e016" />

<img width="1584" height="700" alt="image" src="https://github.com/user-attachments/assets/ff391341-98a9-41dd-b593-37e2f9b3c589" />

---

# ⚡ S&B Convert (Eletron Converter & Ohm Calculator)

O **S&B Convert** é um software em Java desenvolvido para mitigar a ineficiência e a alta incidência de erros manuais no cálculo de grandezas elétricas. Criado para as disciplinas de **Programação Orientada a Objetos** e **Análise e Projeto de Sistemas** da UNISA, o sistema automatiza a conversão de prefixos métricos e a aplicação da Lei de Ohm com rigor técnico e acadêmico.

---

## 🚀 Diferenciais e Funcionalidades

* **Conversor de Escalas:** Transformação entre unidades de Micro (µ) até Mega (M) aplicando fatores multiplicadores do Sistema Internacional (SI).
* **Calculadora de Lei de Ohm:** Cálculo automático de Tensão (V), Corrente (A), Resistência (Ω) e Potência (W) a partir de dois valores conhecidos.
* **Rigor Acadêmico:** Processamento com precisão de até **10 casas decimais**, garantindo a integridade dos dados para cálculos complexos.
* **Gerenciamento de Histórico (CRUD):** Registro em tempo real com opções de adicionar comentários, remover itens, limpar a lista e exportar para arquivo `.txt`.
* **Performance Otimizada:** Software incrivelmente leve, projetado para consumir menos de **50MB** de memória RAM.

---

## 🏗️ Arquitetura do Sistema

O projeto foi construído utilizando o **Modelo Cascata (Waterfall)**, garantindo uma estrutura linear e requisitos técnicos estáveis baseados nas leis da física e da eletrônica.

### Padrões de Projeto (Design Patterns)

* **Singleton (`GerenciadorHistorico`):** Garante que todas as telas compartilhem a mesma instância de memória centralizada para o histórico.
* **Polimorfismo e Herança:** A classe base `Conversor` centraliza a lógica global, enquanto as subclasses (`Mega`, `Kilo`, `Mili`, `Micro`) aplicam seus fatores específicos.
* **Observer (Listeners):** Sincroniza a interface gráfica com o motor de dados para atualizações instantâneas no histórico.

---

## 🎨 Identidade Visual

O projeto utiliza uma paleta de cores "quente" e suave para reduzir a fadiga visual, com um fluxo de trabalho otimizado para facilitar o uso acadêmico.

| Elemento | Cor | Hexadecimal |
| :--- | :--- | :--- |
| **Fundo** | Creme | `#EBE3A5` |
| **Campos** | Amarelo Pastel | `#F2F58E` |
| **Botão Principal** | Ouro | `#F5CC45` |
| **Botão Secundário** | Laranja Outono | `#EBB657` |

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 21
* **Biblioteca Gráfica:** Swing / AWT
* **Arquitetura:** Programação Orientada a Objetos (POO)
* **Gestão de Projeto:** Quadro Kanban (Trello)

---

## ⚙️ Como Executar

1. Certifique-se de ter o **JDK 21** ou superior instalado.
2. Clone o repositório: `git clone https://github.com/Danielsom12/Java-POO-2026.git`
3. Importe o projeto em sua IDE de preferência (Eclipse, IntelliJ ou VS Code).
4. Execute a classe `Tela.java` (localizada no pacote `Conversor`) para iniciar a aplicação.

---

## 👥 Integrantes do Grupo

* **Daniel Sammartano**
* **Manoela Olim Boross**
* **Turma:** Engenharia de Software - 5º Semestre (UNISA)

---
*Desenvolvido com foco em precisão, usabilidade e autonomia 100% offline.*
