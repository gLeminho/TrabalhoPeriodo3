package Telas;

import javax.swing.*;
import Classes.Carrinho;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCarrinho extends JFrame {
    Carrinho nomeUsuario = new Carrinho();
    JPanel jPanel1 = new JPanel();

    // imagens da vitrine
    ImageIcon imageIcon = new ImageIcon("Trabalho Faculdade/Imagens/image.jpg");
    Image imagemOriginal = imageIcon.getImage();
    Image tamanhoImagem = imagemOriginal.getScaledInstance(95, 95, Image.SCALE_SMOOTH);
    ImageIcon imageIconPulpFiction = new ImageIcon(tamanhoImagem);
    JButton jbuttonPulp = new JButton(imageIconPulpFiction);

    ImageIcon imageIcon2 = new ImageIcon("Trabalho Faculdade/Imagens/Titanic_poster.jpg");
    Image imagemOriginal2 = imageIcon2.getImage();
    Image tamanhoImagem2 = imagemOriginal2.getScaledInstance(95, 95, Image.SCALE_SMOOTH);
    ImageIcon imageIconTitanic = new ImageIcon(tamanhoImagem2);
    JButton jbuttonTitanic = new JButton(imageIconTitanic);

    ImageIcon imageIcon3 = new ImageIcon("Trabalho Faculdade/Imagens/Nuovo_Cinema_Paradiso.jpg");
    Image imagemOriginal3 = imageIcon3.getImage();
    Image tamanhoImagem3 = imagemOriginal3.getScaledInstance(95, 95, Image.SCALE_SMOOTH);
    ImageIcon imageIconCinemaParadiso = new ImageIcon(tamanhoImagem3);
    JButton jbuttonCinemaParadiso = new JButton(imageIconCinemaParadiso);

    ImageIcon imageIcon4 = new ImageIcon("Trabalho Faculdade/Imagens/Requiem_for_a_dream.jpg");
    Image imagemOriginal4 = imageIcon4.getImage();
    Image tamanhoImagem4 = imagemOriginal4.getScaledInstance(95, 95, Image.SCALE_SMOOTH);
    ImageIcon imageIconRequiem = new ImageIcon(tamanhoImagem4);
    JButton jbuttonRequiem = new JButton(imageIconRequiem);

    ImageIcon imageIcon5 = new ImageIcon("Trabalho Faculdade/Imagens/111145.png");
    Image imagemOriginal5 = imageIcon5.getImage();
    Image tamanhoImagem5 = imagemOriginal5.getScaledInstance(95, 95, Image.SCALE_SMOOTH);
    ImageIcon imageIconLobo = new ImageIcon(tamanhoImagem5);
    JButton jbuttonLobo = new JButton(imageIconLobo);

    ImageIcon imageIcon6 = new ImageIcon("Trabalho Faculdade/Imagens/lion_king_the_2019_la_ih_ptb_1000_x_1440_2baad78d.jpeg");
    Image imagemOriginal6 = imageIcon6.getImage();
    Image tamanhoImagem6 = imagemOriginal6.getScaledInstance(95, 95, Image.SCALE_SMOOTH);
    ImageIcon imageIconReiLeao = new ImageIcon(tamanhoImagem6);
    JButton jbuttonReiLeao = new JButton(imageIconReiLeao);

    ImageIcon imageIcon7 = new ImageIcon("Trabalho Faculdade/Imagens/images.jpg");
    Image imagemOriginal7 = imageIcon7.getImage();
    Image tamanhoImagem7 = imagemOriginal7.getScaledInstance(95, 95, Image.SCALE_SMOOTH);// Deixando a imagem menor e melhor qualidade
    ImageIcon imageIconRefrigerante = new ImageIcon(tamanhoImagem7);
    JButton jbuttonRefrigerante = new JButton(imageIconRefrigerante);

    // Aréa do valor total
    JLabel jLabel1 = new JLabel("Valor da compra total =");
    JLabel jLabel2 = new JLabel(String.valueOf(nomeUsuario.getPrecoTotal()));

    // butões de ação
    JButton jButtonPagar = new JButton("Pagar");
    JButton jButtonLimpar = new JButton("Limpar Carrinho");
    JButton jButtonCancelar = new JButton("Cancelar");

    public TelaCarrinho() {
        this.setTitle("Carrinho");
        this.setSize(500, 500);
        jPanel1.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 20));
        jPanel1.setBackground(new Color(28, 28, 28));
        add(jPanel1);

        // parte dos filmes se tornando butões
        JPanel jPanel2 = new JPanel(new GridLayout(2, 3, 5, 5));
        jPanel2.setBackground(new Color(28, 28, 28));
        jPanel1.add(jPanel2);
        jPanel2.add(jbuttonPulp);
        jPanel2.add(jbuttonCinemaParadiso);
        jPanel2.add(jbuttonLobo);
        jPanel2.add(jbuttonReiLeao);
        jPanel2.add(jbuttonRequiem);
        jPanel2.add(jbuttonTitanic);
        jPanel1.add(jbuttonRefrigerante);

        configurarButton(jbuttonPulp, "Pulp Fiction");
        configurarButton(jbuttonCinemaParadiso, "Cinema Paradiso");
        configurarButton(jbuttonLobo, "Lobo de wall street");
        configurarButton(jbuttonReiLeao, "Rei leão");
        configurarButton(jbuttonRequiem, "Requiem para um sonho");
        configurarButton(jbuttonTitanic, "Titanic");
        configurarButton(jbuttonRefrigerante, "refrigerante");

        // valor da compra
        JPanel jPanel3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        jPanel1.add(jPanel3);
        jPanel3.setBackground(new Color(28, 28, 28));
        jPanel3.add(jLabel1);
        jPanel3.add(jLabel2);

        configurarLabel(jLabel1);
        configurarLabel(jLabel2);

        // butões de ação
        jPanel3.add(jButtonPagar);
        jPanel3.add(jButtonLimpar);
        jPanel3.add(jButtonCancelar);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.repaint();
        this.revalidate();

        jButtonPagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 new TelaPagamento();
                 dispose();

            }
        });
        jButtonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaPrincipal();
                dispose();

            }
        });
        jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaCarrinho();
                dispose();
            }
        });
    }

    // cores button
    public void configurarButton(JButton button, String nome) {
        button.setBackground(new Color(28, 28, 28));
        button.setBorderPainted(false);
        button.setFocusPainted(true);
        button.setActionCommand(nome);
        button.addActionListener(new ButtonActionListener());
    }

    public void configurarLabel(JLabel label) {
        label.setForeground(Color.white);
    }

    private class ButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = e.getActionCommand();
            int quantidadeInformada = 0;
            if (nome.equalsIgnoreCase("Refrigerante")) {
                String quantidade = JOptionPane.showInputDialog(null,
                        "Você clicou no " + nome + " quantos você deseja adquirir");
                quantidadeInformada = Integer.parseInt(quantidade);
                nomeUsuario.setQuantidadeRefrigerantes(quantidadeInformada);
                jLabel2.setText(String.valueOf(nomeUsuario.getPrecoTotal()));
            } 
            if(!nome.equalsIgnoreCase("Refrigerante")) {
                String quantidade = JOptionPane.showInputDialog(null,
                        "Você clicou no filme " + nome + " quantos você deseja adquirir");
                quantidadeInformada = Integer.parseInt(quantidade);
                nomeUsuario.setQuantidadeFilmes(quantidadeInformada);
                jLabel2.setText(String.valueOf(nomeUsuario.getPrecoTotal()));
            }
        }

    }

 
}
