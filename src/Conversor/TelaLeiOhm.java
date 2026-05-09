package Conversor;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 * Classe que define a interface gráfica para os cálculos da Lei de Ohm.
 * Permite que o usuário insira dois parâmetros elétricos para descobrir os demais.
 */
public class TelaLeiOhm extends JFrame {

    private static final long serialVersionUID = 1L;

    // Definição da paleta de cores para manter a consistência visual do projeto
    private final Color COR_FUNDO = new Color(235, 227, 165);
    private final Color COR_CAMPOS = new Color(242, 245, 142);
    private final Color COR_BOTAO_PRINCIPAL = new Color(245, 204, 69);
    private final Color COR_BOTAO_SECUNDARIO = new Color(235, 182, 87);

    // Declaração dos componentes da interface
    private JPanel contentPane;
    private JTextField txtValorDigitado1;
    private JTextField txtValorDigitado2;
    private JComboBox<String> boxEscolhaUnidadeMedida1;
    private JComboBox<String> boxEscolhaUnidadeMedida2;
    private JTextArea txtAreaResultadoLeiOhm;

    /**
     * Ponto de entrada para execução da tela de forma independente.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                TelaLeiOhm frame = new TelaLeiOhm();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Construtor: Inicializa a janela e posiciona todos os elementos visuais.
     */
    public TelaLeiOhm() {
        setTitle("CÁLCULO LEI DE OHM");
        // DISPOSE_ON_CLOSE garante que fechar esta tela não encerre a aplicação inteira
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 1200, 900);
        setLocationRelativeTo(null); // Centraliza a tela

        // Painel principal onde os componentes são adicionados
        contentPane = new JPanel();
        contentPane.setBackground(COR_FUNDO); 
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null); // Uso de layout absoluto para controle total de coordenadas

        // Definição de fontes padrão
        Font fonteGrandeBold = new Font("Tahoma", Font.BOLD, 22);
        Font fonteMedia = new Font("Tahoma", Font.PLAIN, 20);

        // Título estilizado
        JLabel lblCalcularLeiOhm = new JLabel("Cálculo da Lei de Ohm");
        lblCalcularLeiOhm.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 45));
        lblCalcularLeiOhm.setHorizontalAlignment(SwingConstants.CENTER);
        lblCalcularLeiOhm.setBounds(200, 30, 800, 70);
        contentPane.add(lblCalcularLeiOhm);

        // --- SEÇÃO DE ENTRADA 1 ---
        JLabel lblValor1 = new JLabel("Digite o 1° Valor:");
        lblValor1.setFont(fonteGrandeBold);
        lblValor1.setBounds(300, 150, 300, 30);
        contentPane.add(lblValor1);

        txtValorDigitado1 = new JTextField();
        txtValorDigitado1.setFont(fonteMedia);
        txtValorDigitado1.setBounds(300, 185, 280, 50);
        txtValorDigitado1.setBackground(COR_CAMPOS); 
        contentPane.add(txtValorDigitado1);

        // Opções de grandezas elétricas para o primeiro valor
        String[] unidades = { "Tensão (V)", "Corrente (A)", "Resistência (Ω)", "Potência (W)" };
        boxEscolhaUnidadeMedida1 = new JComboBox<>(unidades);
        boxEscolhaUnidadeMedida1.setFont(fonteMedia);
        boxEscolhaUnidadeMedida1.setBounds(620, 185, 280, 50);
        boxEscolhaUnidadeMedida1.setBackground(COR_CAMPOS); 
        contentPane.add(boxEscolhaUnidadeMedida1);

        // --- SEÇÃO DE ENTRADA 2 ---
        JLabel lblValor2 = new JLabel("Digite o 2° Valor:");
        lblValor2.setFont(fonteGrandeBold);
        lblValor2.setBounds(300, 260, 300, 30);
        contentPane.add(lblValor2);

        txtValorDigitado2 = new JTextField();
        txtValorDigitado2.setFont(fonteMedia);
        txtValorDigitado2.setBounds(300, 295, 280, 50);
        txtValorDigitado2.setBackground(COR_CAMPOS); 
        contentPane.add(txtValorDigitado2);

        // Opções de grandezas elétricas para o segundo valor
        boxEscolhaUnidadeMedida2 = new JComboBox<>(unidades);
        boxEscolhaUnidadeMedida2.setFont(fonteMedia);
        boxEscolhaUnidadeMedida2.setBounds(620, 295, 280, 50);
        boxEscolhaUnidadeMedida2.setBackground(COR_CAMPOS); 
        contentPane.add(boxEscolhaUnidadeMedida2);

        // --- ÁREA DE RESULTADOS ---
        txtAreaResultadoLeiOhm = new JTextArea();
        txtAreaResultadoLeiOhm.setBackground(COR_FUNDO); 
        txtAreaResultadoLeiOhm.setEditable(false); // Impede que o usuário digite no resultado
        txtAreaResultadoLeiOhm.setFont(new Font("Dialog", Font.BOLD, 28));
        txtAreaResultadoLeiOhm.setBounds(300, 399, 600, 180);
        contentPane.add(txtAreaResultadoLeiOhm);

        // --- BOTÕES ---
        JButton btnCalcular = new JButton("CALCULAR");
        btnCalcular.setFont(fonteGrandeBold);
        btnCalcular.setBounds(300, 620, 280, 70);
        btnCalcular.setBackground(COR_BOTAO_PRINCIPAL); 
        btnCalcular.addActionListener(e -> calcularLeiOhm()); // Aciona a lógica de cálculo
        contentPane.add(btnCalcular);

        JButton btnVoltar = new JButton("VOLTAR");
        btnVoltar.setFont(fonteGrandeBold);
        btnVoltar.setBounds(620, 620, 280, 70);
        btnVoltar.setBackground(COR_BOTAO_SECUNDARIO); 
        btnVoltar.addActionListener(e -> dispose()); // Fecha apenas esta janela
        contentPane.add(btnVoltar);

        // Rótulo para posicionamento da logo
        JLabel lblLogo = new JLabel("");
        lblLogo.setBounds(30, 20, 250, 120); 
        contentPane.add(lblLogo); 

        // Tentativa de carregamento da imagem da logo com redimensionamento
        JLabel lblNewLabel = new JLabel("");
        try {
            ImageIcon originalIcon = new ImageIcon("/home/dan/eclipse-workspace/src/Conversor");
            Image scaledImage = originalIcon.getImage().getScaledInstance(300, 150, Image.SCALE_SMOOTH);
            lblNewLabel.setIcon(new ImageIcon("/home/dan/eclipse-workspace/src/Conversor/logo_S&B_Convert.png"));
        } catch (Exception e) {
            System.out.println("Caminho da imagem não encontrado.");
        }
        lblNewLabel.setBounds(31, 64, 324, 186);
        contentPane.add(lblNewLabel);
    }

    /**
     * Método principal de lógica. Coleta os dados, valida e aplica
     * as fórmulas da Lei de Ohm e Potência Elétrica.
     */
    private void calcularLeiOhm() {
        try {
            // Normalização: substitui vírgula por ponto para o parse Double
            String txt1 = txtValorDigitado1.getText().replace(",", ".");
            String txt2 = txtValorDigitado2.getText().replace(",", ".");
            double v1 = Double.parseDouble(txt1);
            double v2 = Double.parseDouble(txt2);

            // Validação de segurança para valores positivos
            if (v1 <= 0 || v2 <= 0) {
                JOptionPane.showMessageDialog(this, "Erro: Insira apenas valores positivos e maiores que zero.");
                return;
            }

            String u1 = (String) boxEscolhaUnidadeMedida1.getSelectedItem();
            String u2 = (String) boxEscolhaUnidadeMedida2.getSelectedItem();

            // O usuário não pode tentar calcular usando a mesma grandeza duas vezes
            if (u1.equals(u2)) {
                JOptionPane.showMessageDialog(this, "Erro: Selecione grandezas diferentes.");
                return;
            }

            double tensao = 0, corrente = 0, resistencia = 0, potencia = 0;
            boolean tSet = false, cSet = false, rSet = false, pSet = false;

            // Identifica quais grandezas foram fornecidas no input 1
            if (u1.contains("V")) { tensao = v1; tSet = true; } 
            else if (u1.contains("A")) { corrente = v1; cSet = true; } 
            else if (u1.contains("Ω")) { resistencia = v1; rSet = true; } 
            else if (u1.contains("W")) { potencia = v1; pSet = true; }

            // Identifica quais grandezas foram fornecidas no input 2
            if (u2.contains("V")) { tensao = v2; tSet = true; } 
            else if (u2.contains("A")) { corrente = v2; cSet = true; } 
            else if (u2.contains("Ω")) { resistencia = v2; rSet = true; } 
            else if (u2.contains("W")) { potencia = v2; pSet = true; }

            // --- Lógica das Fórmulas Elétricas ---
            
            if (tSet && cSet) { // Conhecendo Tensão e Corrente
                resistencia = tensao / corrente;
                potencia = tensao * corrente;
            } else if (tSet && rSet) { // Conhecendo Tensão e Resistência
                corrente = tensao / resistencia;
                potencia = (tensao * tensao) / resistencia;
            } else if (cSet && rSet) { // Conhecendo Corrente e Resistência
                tensao = corrente * resistencia;
                potencia = (corrente * corrente) * resistencia;
            } else if (pSet && tSet) { // Conhecendo Potência e Tensão
                corrente = potencia / tensao;
                resistencia = (tensao * tensao) / potencia;
            } else if (pSet && cSet) { // Conhecendo Potência e Corrente
                tensao = potencia / corrente;
                resistencia = potencia / (corrente * corrente);
            } else if (pSet && rSet) { // Conhecendo Potência e Resistência
                tensao = Math.sqrt(potencia * resistencia);
                corrente = Math.sqrt(potencia / resistencia);
            }

            // Exibição dos resultados formatados com 4 casas decimais
            txtAreaResultadoLeiOhm.setText(String.format(
                    "RESULTADOS:\nTensão: %.4f V\nCorrente: %.4f A\nResistência: %.4f Ω\nPotência: %.4f W", 
                    tensao, corrente, resistencia, potencia));

        } catch (NumberFormatException ex) {
            // Caso o usuário tente converter letras ou campos vazios
            JOptionPane.showMessageDialog(this, "Erro: Entrada inválida. Use apenas números.");
        }
    }
}