package Telas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSobreNos extends JFrame {
    // Montando o menu que ficará em todas as telas
    JMenuBar jMenuBar = new JMenuBar();
    JMenu jMenu1 = new JMenu("Home");
    JMenu jMenu2 = new JMenu("Usuario");
    JMenu jMenu3 = new JMenu("Filmes indicados");
    //Itens primeiro bloco do menu
    JMenuItem jMenuItem1 = new JMenuItem("Início");
    JMenuItem jMenuItem2 = new JMenuItem("Sobre nós");
    // itens segundo bloco
    JMenuItem jMenuItem3 = new JMenuItem("Cadastro");
    JMenuItem jMenuItem4 = new JMenuItem("Login");
    // itens terceiro bloco
    JMenuItem jMenuItem5 = new JMenuItem("Top 5 Filmes da vida");
   
    // parte gáfica contando intuito do app
    JPanel jPanel1 = new JPanel();
    ImageIcon imageIcon = new ImageIcon("Trabalho Faculdade/Imagens/assistindo-um-filme.png");
    Image imagemOriginal = imageIcon.getImage();
    Image tamanhoImagem = imagemOriginal.getScaledInstance(85, 85, Image.SCALE_SMOOTH);// Deixando a imagem menor e melhor qualidade
    ImageIcon imageIcon1 = new ImageIcon(tamanhoImagem);
    JLabel jLabel1 = new JLabel(imageIcon1);
    String texto = "<html>" +
            "<div style='text-align: center;'>" +
            "No Cine Retrô, estamos trazendo de volta a magia do cinema clássico!<br/>" +
            "Nosso aplicativo é um verdadeiro tributo aos dias de glória do cinema,<br/>" +
            "quando assistir a um filme era uma experiência única e especial.<br/>" +
            "Sabemos que, em meio à era digital, muitos de nós sentimos saudades do charme<br/>" +
            "e da emoção de possuir filmes em formatos físicos, como DVDs e Blu-rays.<br/>" +
            "É por isso que decidimos criar o Cine Retrô." +
            "</div>" +
            "</html>";
    JLabel jLabel2 = new JLabel(texto);

    public TelaSobreNos() {
        this.setTitle("Cine Retrô");
        this.setSize(500, 500);
        jPanel1.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 20));
        jPanel1.setBackground(new Color(28, 28, 28));
        add(jMenuBar);
        jPanel1.add(jMenuBar);
        jMenuBar.setBackground(new Color(60,60,60));

        //menu
        //Menu home
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

        
        // parte gáfica com vitrine dos produtos
        add(jPanel1);
        jPanel1.add(jLabel1);
        jLabel2.setForeground(Color.white);
        jPanel1.add(jLabel2);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.repaint();
        this.revalidate();

        //eventos menu
        jMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new TelaPrincipal();
                dispose();
            }
        });
        jMenuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new TelaCadastro();
                
            }
        });

        // Eventos Login
        jMenuItem4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new TelaLogin();
                
            }
        });
    }

}
