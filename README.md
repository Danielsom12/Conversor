<img width="913" height="719" alt="image" src="https://github.com/user-attachments/assets/c81dd940-a70c-44d3-96f2-fd8db683cfb9" />


<img width="1193" height="769" alt="image" src="https://github.com/user-attachments/assets/af50b8ca-4e52-4fa1-b2df-addf3e8e75d5" />


---
* **Link dos Diagramas:
https://app.diagrams.net/#G1hROKAkgqtNUdFsNCblaknKJjJZTwFMMj#{%22pageId%22%3A%22ZfpAr39wWB8uVWxP9SLy%22}

* **Documentação do Projeto:
https://docs.google.com/document/d/1A2wMIPhPiMmkt90xg02JmvIB3o3XdmUMnpz_CZDe1JU/edit?tab=t.0

* **Quadro de Atividades no Trello:
https://trello.com/invite/b/69c83c142c4a267e562ee9a3/ATTIe02e7cb8e95e77a689d66c1ffa063eddB8123750/sb-convert
---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 21
* **Biblioteca Gráfica:** Swing / AWT
* **Arquitetura:** Programação Orientada a Objetos (POO)
* **Gestão de Projeto:** Quadro Kanban (Trello)


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
