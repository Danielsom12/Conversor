package Conversor;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * Classe Tela: Define a interface principal do conversor de escalas.
 * Estende JFrame para criação da janela.
 */
public class Tela extends JFrame {

    private static final long serialVersionUID = 1L;

    // Definição de cores personalizadas para a identidade visual da aplicação
    private final Color COR_FUNDO = new Color(235, 227, 165);
    private final Color COR_CAMPOS = new Color(242, 245, 142);
    private final Color COR_BOTAO_PRINCIPAL = new Color(245, 204, 69);
    private final Color COR_BOTAO_SECUNDARIO = new Color(235, 182, 87);
    
    // Formatador para registrar a data e hora no histórico
    private final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    // Declaração dos componentes da interface gráfica
    private JPanel contentPane;
    private JTextField txtDigiteOValor;
    private JComboBox<String> boxEscalaOrigem;
    private JComboBox<String> boxUnidade;
    private JComboBox<String> boxEscalaDestino;
    private JTextArea textAreaResultadoConversao;

    /**
     * Método principal para iniciar a aplicação.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Tela frame = new Tela();
                frame.setVisible(true); // Torna a janela visível
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    
    /**
     * Construtor da classe Tela: Configura layout, componentes e eventos.
     */
    public Tela() {
        setTitle("CONVERSOR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Encerra o processo ao fechar
        setBounds(100, 100, 1200, 900);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Painel principal com layout absoluto (null) para posicionamento manual
        contentPane = new JPanel();
        contentPane.setBackground(COR_FUNDO);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Estilos de fonte reutilizáveis
        Font fonteGrandeBold = new Font("Tahoma", Font.BOLD, 22);
        Font fonteMedia = new Font("Tahoma", Font.PLAIN, 20);

        // Título principal
        JLabel lblConversor = new JLabel("CONVERSOR");
        lblConversor.setBounds(200, 30, 800, 60);
        lblConversor.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 45));
        lblConversor.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblConversor);

        // Seção: Escala de Origem
        JLabel lblSelecionarEscala = new JLabel("Escolha a Escala Origem:");
        lblSelecionarEscala.setBounds(400, 120, 400, 30);
        lblSelecionarEscala.setFont(fonteGrandeBold);
        contentPane.add(lblSelecionarEscala);

        String[] escalas = { "Mega", "Kilo", "Mili", "Micro" };
        boxEscalaOrigem = new JComboBox<>(escalas);
        boxEscalaOrigem.setBounds(400, 155, 400, 45);
        boxEscalaOrigem.setBackground(COR_CAMPOS);
        boxEscalaOrigem.setFont(fonteMedia);
        contentPane.add(boxEscalaOrigem);

        // Seção: Entrada de valor numérico
        JLabel lblValorInserido = new JLabel("Digite o Valor Para Converter:");
        lblValorInserido.setBounds(400, 220, 400, 30);
        lblValorInserido.setFont(fonteGrandeBold);
        contentPane.add(lblValorInserido);

        txtDigiteOValor = new JTextField();
        txtDigiteOValor.setBounds(400, 255, 400, 45);
        txtDigiteOValor.setBackground(COR_CAMPOS);
        txtDigiteOValor.setFont(fonteMedia);
        contentPane.add(txtDigiteOValor);

        // Seção: Unidade de Medida
        JLabel lblSelecionarUnidade = new JLabel("Escolha a Unidade (A, Ω, V, W):");
        lblSelecionarUnidade.setBounds(400, 320, 400, 30);
        lblSelecionarUnidade.setFont(fonteGrandeBold);
        contentPane.add(lblSelecionarUnidade);

        String[] unidades = { "A", "Ω", "V", "W" };
        boxUnidade = new JComboBox<>(unidades);
        boxUnidade.setBounds(400, 355, 400, 45);
        boxUnidade.setBackground(COR_CAMPOS);
        boxUnidade.setFont(fonteMedia);
        contentPane.add(boxUnidade);

        // Seção: Escala de Destino
        JLabel lblSelecionarDestino = new JLabel("Escala que deseja Obter:");
        lblSelecionarDestino.setBounds(400, 420, 400, 30);
        lblSelecionarDestino.setFont(fonteGrandeBold);
        contentPane.add(lblSelecionarDestino);

        boxEscalaDestino = new JComboBox<>(escalas);
        boxEscalaDestino.setBounds(400, 455, 400, 45);
        boxEscalaDestino.setBackground(COR_CAMPOS);
        boxEscalaDestino.setFont(fonteMedia);
        contentPane.add(boxEscalaDestino);

        // Botão Converter: Contém a lógica principal de cálculo
        JButton btnConverter = new JButton("Converter");
        btnConverter.setBounds(300, 540, 280, 60);
        btnConverter.setBackground(COR_BOTAO_PRINCIPAL);
        btnConverter.setFont(new Font("Tahoma", Font.BOLD, 22));
        btnConverter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Validação de campo vazio
                    String texto = txtDigiteOValor.getText().trim();
                    if (texto.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Erro: O campo de valor está vazio.");
                        return;
                    }

                    // Normalização do input (troca vírgula por ponto para o Double.parseDouble)
                    texto = texto.replace(",", ".");
                    double valorDigitado = Double.parseDouble(texto);

                    // Regra de negócio: impede valores negativos
                    if (valorDigitado < 0) {
                        JOptionPane.showMessageDialog(null, "Erro: Insira apenas valores positivos.");
                        return;
                    }

                    // Recupera os valores selecionados nos JComboBoxes
                    String escOrigem = (String) boxEscalaOrigem.getSelectedItem();
                    String escDestino = (String) boxEscalaDestino.getSelectedItem();
                    String escUnidade = (String) boxUnidade.getSelectedItem();

                    // Polimorfismo: cria instâncias específicas baseadas na escolha do usuário
                    Conversor objOrigem = selecionarEscala(escOrigem, valorDigitado);
                    Conversor objDestino = selecionarEscala(escDestino, 0);

                    // Executa o cálculo matemático da conversão
                    double resultado = objOrigem.converter(objDestino);

                    // Formata o resultado para evitar notação científica em números pequenos
                    java.text.DecimalFormat df = new java.text.DecimalFormat("0.##########");
                    String resultadoFormatado = df.format(resultado);

                    // Exibe o resultado na interface
                    textAreaResultadoConversao.setText("Resultado: " + resultadoFormatado + " " + escDestino + " " + escUnidade);

                    // Registra a operação no histórico
                    String dataFormatada = LocalDateTime.now().format(FORMATADOR_DATA);
                    String registro = String.format("[%s] %s %s = %s %s %s", 
                            dataFormatada, valorDigitado, escOrigem, resultadoFormatado, escDestino, escUnidade);

                    GerenciadorHistorico.getInstance().adicionar(registro);

                } catch (NumberFormatException ex) {
                    // Tratamento de erro para entradas que não são números válidos
                    JOptionPane.showMessageDialog(null, "Erro: Entrada inválida. Use apenas números.");
                }
            }
        });
        contentPane.add(btnConverter);

        // Botão para abrir a tela da Lei de Ohm
        JButton btnMudarTela = new JButton("Lei de Ohm");
        btnMudarTela.setBounds(620, 540, 280, 60);
        btnMudarTela.setBackground(COR_BOTAO_SECUNDARIO);
        btnMudarTela.setFont(new Font("Tahoma", Font.BOLD, 22));
        btnMudarTela.addActionListener(e -> {
            TelaLeiOhm telaOhm = new TelaLeiOhm();
            telaOhm.setVisible(true);
        });
        contentPane.add(btnMudarTela);

        // Botão para visualizar o histórico de conversões
        JButton btnHistorico = new JButton("Histórico");
        btnHistorico.setBounds(300, 620, 600, 50);
        btnHistorico.setBackground(COR_BOTAO_SECUNDARIO);
        btnHistorico.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnHistorico.addActionListener(e -> {
            TelaHistorico telaHist = new TelaHistorico();
            telaHist.setVisible(true);
        });
        contentPane.add(btnHistorico);

        // Área de texto para exibição do resultado final (somente leitura)
        textAreaResultadoConversao = new JTextArea();
        textAreaResultadoConversao.setBounds(200, 710, 800, 100);
        textAreaResultadoConversao.setFont(new Font("Dialog", Font.BOLD, 35));
        textAreaResultadoConversao.setBackground(COR_FUNDO);
        textAreaResultadoConversao.setEditable(false);
        textAreaResultadoConversao.setMargin(new java.awt.Insets(20, 20, 20, 20));
        contentPane.add(textAreaResultadoConversao);

        // Carregamento e renderização da Logo principal
        JLabel lblLogo = new JLabel("");
        try {
            ImageIcon originalIcon = new ImageIcon("/home/dan/eclipse-workspace/src/Conversor/logo_S&B_Convert.png");
            Image scaledImage = originalIcon.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            lblLogo.setIcon(new ImageIcon(scaledImage));
        } catch (Exception e) {
            System.out.println("Logo não encontrada.");
        }
        lblLogo.setBounds(30, 20, 221, 210);
        contentPane.add(lblLogo);

        // Carregamento de imagem secundária (Ohm)
        try {
            ImageIcon ohmIcon = new ImageIcon("/home/dan/Área de trabalho/Gemini_Generated_Image_xq8jgxq8j.png");
            Image scaledOhm = ohmIcon.getImage().getScaledInstance(180, 100, Image.SCALE_SMOOTH);
        } catch (Exception e) { /* Silencioso se não achar */ }
    }

    // Método auxiliar para instanciar a classe de conversão correta.

    private Conversor selecionarEscala(String escOrigem, double valorDigitado) {
        if (escOrigem.equals("Mega"))
            return new Mega(valorDigitado); 
        if (escOrigem.equals("Kilo"))
            return new Kilo(valorDigitado);
        if (escOrigem.equals("Mili"))
            return new Mili(valorDigitado);
        if (escOrigem.equals("Micro"))
            return new Micro(valorDigitado);
        return new Conversor(valorDigitado);
    }
}