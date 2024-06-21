package Telas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaPrincipal extends JFrame {
    // Montando o menu que ficará em todas as telas
    JPanel jPanel1 = new JPanel();
    JMenuBar jMenuBar = new JMenuBar();
    JMenu jMenu1 = new JMenu("Home");
    JMenu jMenu2 = new JMenu("Usuario");
    JMenu jMenu3 = new JMenu("Filmes indicados");
    // Itens primeiro bloco do menu
    JMenuItem jMenuItem1 = new JMenuItem("Início");
    JMenuItem jMenuItem2 = new JMenuItem("Sobre nós");
    // itens segundo bloco
    JMenuItem jMenuItem3 = new JMenuItem("Cadastro");
    JMenuItem jMenuItem4 = new JMenuItem("Login");
    // itens terceiro bloco
    JMenuItem jMenuItem5 = new JMenuItem("Top 5 Filmes da vida");// pulp fiction, titanic, cinema paradiso, requiem para um sonho, lobo de wall street
   
    // imagens da vitrine
    ImageIcon imageIcon = new ImageIcon("Trabalho Faculdade/Imagens/image.jpg");
    Image imagemOriginal = imageIcon.getImage();
    Image tamanhoImagem = imagemOriginal.getScaledInstance(95, 95, Image.SCALE_SMOOTH);// Deixando a imagem menor e melhor qualidade
    ImageIcon imageIconPulpFiction = new ImageIcon(tamanhoImagem);
    JLabel jLabelPulp = new JLabel(imageIconPulpFiction);
    
    ImageIcon imageIcon2 = new ImageIcon("Trabalho Faculdade/Imagens/Titanic_poster.jpg");
    Image imagemOriginal2 = imageIcon2.getImage();
    Image tamanhoImagem2 = imagemOriginal2.getScaledInstance(95, 95, Image.SCALE_SMOOTH);// Deixando a imagem menor e melhor qualidade
    ImageIcon imageIconTitanic = new ImageIcon(tamanhoImagem2);
    JLabel jLabelTitanic = new JLabel(imageIconTitanic);
   
    ImageIcon imageIcon3 = new ImageIcon("Trabalho Faculdade/Imagens/Nuovo_Cinema_Paradiso.jpg");
    Image imagemOriginal3 = imageIcon3.getImage();
    Image tamanhoImagem3 = imagemOriginal3.getScaledInstance(95, 95, Image.SCALE_SMOOTH);// Deixando a imagem menor e melhor qualidade
    ImageIcon imageIconCinemaParadiso = new ImageIcon(tamanhoImagem3);
    JLabel jLabelCinemaParadiso = new JLabel(imageIconCinemaParadiso);
   
    ImageIcon imageIcon4 = new ImageIcon("Trabalho Faculdade/Imagens/Requiem_for_a_dream.jpg");
    Image imagemOriginal4 = imageIcon4.getImage();
    Image tamanhoImagem4 = imagemOriginal4.getScaledInstance(95, 95, Image.SCALE_SMOOTH);// Deixando a imagem menor e melhor qualidade
    ImageIcon imageIconRequiem = new ImageIcon(tamanhoImagem4);
    JLabel jLabelRequiem = new JLabel(imageIconRequiem);

    ImageIcon imageIcon5 = new ImageIcon("Trabalho Faculdade/Imagens/111145.png");
    Image imagemOriginal5 = imageIcon5.getImage();
    Image tamanhoImagem5 = imagemOriginal5.getScaledInstance(95, 95, Image.SCALE_SMOOTH);// Deixando a imagem menor e melhor qualidade
    ImageIcon imageIconLobo = new ImageIcon(tamanhoImagem5);
    JLabel jLabelLobo = new JLabel(imageIconLobo);
    
    ImageIcon imageIcon6 = new ImageIcon("Trabalho Faculdade/Imagens/lion_king_the_2019_la_ih_ptb_1000_x_1440_2baad78d.jpeg");
    Image imagemOriginal6 = imageIcon6.getImage();
    Image tamanhoImagem6 = imagemOriginal6.getScaledInstance(95, 95, Image.SCALE_SMOOTH);// Deixando a imagem menor e melhor qualidade
    ImageIcon imageIconReiLeao = new ImageIcon(tamanhoImagem6);
    JLabel jLabelReiLeao = new JLabel(imageIconReiLeao);
    
    // buttons
    JButton jButtonCadastro = new JButton("Cadastro");
    JButton jButtonLogin = new JButton("Login");

    public TelaPrincipal() {
        this.setTitle("Cine Retrô");
        this.setSize(500, 500);
        jPanel1.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 20));
        jPanel1.setBackground(new Color(28, 28, 28));
        add(jMenuBar);
        add(jPanel1);
        jPanel1.add(jMenuBar);
        jMenuBar.setBackground(new Color(60, 60, 60));

        // Menu home
        jMenuBar.add(jMenu1);
        jMenu1.setForeground(Color.white);
        jMenu1.add(jMenuItem1);
        jMenu1.add(jMenuItem2);

        // Menu Usuario
        jMenuBar.add(jMenu2);
        jMenu2.setForeground(Color.white);
        jMenu2.add(jMenuItem3);
        jMenu2.add(jMenuItem4);

        // Menu filmes indicados
        jMenuBar.add(jMenu3);
        jMenu3.setForeground(Color.white);
        jMenu3.add(jMenuItem5);

        // imagens
        JPanel jPanel2 = new JPanel(new GridLayout(2,3,5,5));
        jPanel1.add(jPanel2);
        jPanel2.add(jLabelPulp);
        jPanel2.add(jLabelTitanic);
        jPanel2.add(jLabelCinemaParadiso);
        jPanel2.add(jLabelRequiem);
        jPanel2.add(jLabelLobo);
        jPanel2.add(jLabelReiLeao);
        jPanel2.setBackground(new Color(28,28,28));

        // buttons
        jPanel1.add(jButtonCadastro);
        jPanel1.add(jButtonLogin);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.repaint();
        this.revalidate();

        jMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaPrincipal();
                dispose();
            }
        });

        // eventos Cadastro
        jButtonCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaCadastro();
                dispose();
            }
        });
        jMenuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaCadastro();
                dispose();
            }
        });

        // Eventos Login
        jMenuItem4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaLogin();
                dispose();

            }
        });

        jButtonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaLogin();
                dispose();
            }
        });

        // evento tela sobre nós
        jMenuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaSobreNos();
                dispose();
            }
        });
        
        jMenuItem5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,top5(),"***Indicações***",JOptionPane.INFORMATION_MESSAGE);
            }
        });

    }

    public static void main(String[] args) {
        new TelaPrincipal();

    }

    public String top5(){
        return "Top 1: Pulp Fiction\n"+
        "Top 2: Cinema Paradiso\n"+
        "Top 3: Rei Leão\n"+
        "Top 4: Requien for a dream\n"+
        "Top 5: O lobo de Wall Street";
    }

}