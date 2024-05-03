import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class fecharJanela extends JFrame {
        JButton botaoSair;
        public fecharJanela() {
            super("Exemplo");
            Container conteiner = getContentPane();
            setLayout(null);
            botaoSair = new JButton("Sair");
            botaoSair.setBounds(100, 50, 100, 20);
            botaoSair.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        System.exit(0);
                    }
                }
            );
            conteiner.add(botaoSair);
            setSize(300,150);
            setVisible(true);
        }

        // Main
        public static void main(String args[]) {
            fecharJanela app = new fecharJanela();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    
}