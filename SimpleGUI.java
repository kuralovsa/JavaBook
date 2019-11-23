import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button=new JButton("Start");
    private JTextField input=new JTextField("",5);
    private JLabel label=new JLabel("Input: ");

    public SimpleGUI(){
        super("~First program!~");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container=this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(button);
        container.add(label);
        container.add(input);
        button.setBackground(Color.lightGray);
        container.setBackground(Color.white);
        label.setBackground(Color.getHSBColor(255,25,50));
        label.setSize(18,50);
        button.addActionListener(new SSD());
        container.add(button);
    }
    class SSD implements ActionListener{

        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message+="Text: \n "+input.getText()+"\n";
            message+="Finished ";
            JOptionPane.showConfirmDialog(null,message,"Check Box",JOptionPane.PLAIN_MESSAGE);
        }
    }
}
class Main_of_GUI{
    public static void main(String[] args) {
        SimpleGUI sg=new SimpleGUI();
        sg.setVisible(true);
    }
}
