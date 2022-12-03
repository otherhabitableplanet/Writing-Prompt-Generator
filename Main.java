import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Font font1 = new Font("SansSerif", Font.BOLD, 13);
        JFrame f=new JFrame("Writing Prompt Generator");
        final JTextField tf=new JTextField();
        tf.setBounds(0,400, 1400,40);
        tf.setFont(font1);
        JButton b=new JButton("Click for prompt");
        b.setBounds(400,500,170,20);
        b.setVisible(true);
        b.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
                tf.setText(PromptGenerator.getPrompt());
            }
        });
    f.add(b);f.add(tf);
    f.setSize(1400,1400);
    f.setLayout(null);
    f.setVisible(true);

    }
}
