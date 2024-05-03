import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MostrarSenha extends JFrame {
    JPasswordField caixa;    
    JLabel rotulo, exibir;
    JButton mostrar;   
    
    public MostrarSenha() {
        super("Mostrar senha");
        Container container = getContentPane();
        setLayout(null);
        rotulo = new JLabel("Senha");
        caixa = new JPasswordField(10);
        exibir = new JLabel("A senha digitada é: ");
        mostrar = new JButton("Mostrar");
        exibir.setVisible(false);
        rotulo.setBounds(50,20,100,20);
        caixa.setBounds(50,60,200,20);
        exibir.setBounds(50,120,200,20);
        mostrar.setBounds(150,150,80,20);
        mostrar.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String senha = new String(caixa.getPassword());
                    exibir.setVisible(true);
                    exibir.setText("A senha digitada é: " + senha);
                }
            }
        );
        container.add(rotulo);
        container.add(caixa);
        container.add(exibir);
        container.add(mostrar);
        setSize(400,250);
        setVisible(true);
    }

    // Main
    public static void main(String args[]) {
        MostrarSenha app = new MostrarSenha();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
