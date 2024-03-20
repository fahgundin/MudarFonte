package javaaplication1;

import javax.swing.JFrame;

public class RadioButtonTest extends JFrame {
    public static void main(String[] args) { 
        RadioButtonFrame radioBtFrame = new RadioButtonFrame();
        radioBtFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        radioBtFrame.setSize(300,100);
        radioBtFrame.setVisible(true);
        radioBtFrame.setResizable(false);
        radioBtFrame.setLocationRelativeTo(null);
    }
    
}
