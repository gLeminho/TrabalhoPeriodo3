package Telas;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {
    JPanel jPanel = new JPanel();
    JLabel jLabel1 = new JLabel("Email:");
    JTextField jTextField1 = new JTextField(20);
    JLabel jLabel2 = new JLabel("Senha:");
    JTextField jTextField2 = new JTextField(20);
    JButton jButton = new JButton("Entrar");
    JButton jButton2 = new JButton("Voltar");


    public TelaLogin(){
    this.setTitle("Login");
    this.setSize(300,265);
    jPanel.setLayout(new GridLayout(3,2,35,75));
    jPanel.setBackground(new Color(28,28,28));
    add(jPanel);

    jPanel.add(jLabel1);
    jPanel.add(jTextField1);
    jPanel.add(jLabel2);
    jPanel.add(jTextField2);

    jLabel1.setForeground(Color.WHITE);
    jLabel2.setForeground(Color.WHITE);

    JPanel jPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    jPanel.add(jPanel2);
    jPanel2.setBackground(new Color(28,28,28));
    jPanel2.add(jButton2);
    JPanel jPanel3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    jPanel.add(jPanel3);
    jPanel3.setBackground(new Color(28,28,28));
    jPanel3.add(jButton);

    this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.repaint();
    this.revalidate();

    jButton2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
           new TelaPrincipal();
           dispose();
        }
    });
    jButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            new TelaCarrinho();
            dispose();
        }
    });
    
}
}
