package Telas;
import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame{
    JPanel jPanel = new JPanel();
    JLabel jLabel1 = new JLabel("Nome:");
    JTextField jTextField1 = new JTextField(20);
    JLabel jLabel2 = new JLabel("Data Nascimento:");
    JTextField jTextField2 = new JTextField(3);
    JLabel jLabel3 = new JLabel("Cidade:");
    JTextField jTextField3 = new JTextField(20);
    JLabel jLabel4 = new JLabel("Endereço:");
    JTextField jTextField4 = new JTextField(20);
    JLabel jLabel5 = new JLabel("Email:");
    JTextField jTextField5 = new JTextField(20);
    JLabel jLabel6 = new JLabel("Senha:");
    JTextField jTextField6 = new JTextField(20);
    JButton jButton = new JButton("Salvar");

    public TelaCadastro(){
        this.setTitle("***Cadastro***");
        this.setSize(400,260);
        jPanel.setLayout(new GridLayout(7,2,5,5));
        jPanel.setBackground(new Color(28,28,28));
        add(jPanel);
        
        //configurando cadastro
        jPanel.add(jLabel1);
        jPanel.add(jTextField1);
        jPanel.add(jLabel2);
        jPanel.add(jTextField2);
        jPanel.add(jLabel3);
        jPanel.add(jTextField3);
        jPanel.add(jLabel4);
        jPanel.add(jTextField4);
        jPanel.add(jLabel5);
        jPanel.add(jTextField5);
        jPanel.add(jLabel6);
        jPanel.add(jTextField6);

        jLabel1.setForeground(Color.WHITE);
        jLabel2.setForeground(Color.WHITE);
        jLabel3.setForeground(Color.WHITE);
        jLabel4.setForeground(Color.WHITE);
        jLabel5.setForeground(Color.WHITE);
        jLabel6.setForeground(Color.WHITE);

        JPanel jPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jPanel2.setBackground(new Color(28,28,28));    
        jPanel.add(jPanel2);
        jPanel2.add(jButton);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.repaint();
        this.revalidate();

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new TelaLogin();
                dispose();
            }
        });
    }

}
