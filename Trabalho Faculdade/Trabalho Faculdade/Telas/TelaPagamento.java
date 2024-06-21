package Telas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class TelaPagamento extends JFrame{
      JPanel panel1 = new JPanel();
      JButton buttonDebito = new JButton("Débito");
      JButton buttonCredito = new JButton("Crédito");
      JButton buttonPix = new JButton("Pix");

      public TelaPagamento(){
        this.setTitle("***Tela Pagamento***");
        this.setSize(300,265);
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,100,20));
        panel1.setBackground(new Color(28,28,28));
        add(panel1);

        panel1.add(buttonDebito);
        panel1.add(buttonCredito);
        panel1.add(buttonPix);

        this.setLocationRelativeTo(null);
        this.revalidate();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.repaint();

         buttonCredito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                 JOptionPane.showMessageDialog(null,"Pagamento crédito realizado","**Crédito***",JOptionPane.INFORMATION_MESSAGE);
                 dispose();
            }
         });
         buttonDebito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                 JOptionPane.showMessageDialog(null,"Pagamento débito realizado","**dédito***",JOptionPane.INFORMATION_MESSAGE);
                 dispose();
            }
         });
         buttonPix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                 JOptionPane.showMessageDialog(null,"Chave pix cpf 130880186-63","**Pix***",JOptionPane.INFORMATION_MESSAGE);
                 dispose();
            }
         });
    }

}