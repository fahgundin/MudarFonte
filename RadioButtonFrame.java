package javaaplication1;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonFrame extends JFrame{
    private JTextField textfd = new JTextField("Veja o estilo da fonte mudando");
    private Font plainFont = new Font("Serif", Font.PLAIN, 14);
    private Font boldFont = new Font("Serif", Font.BOLD, 14);
    private Font italicFont = new Font("Serif", Font.ITALIC, 14);
    private Font boldItalicFont= new Font("Serif", Font.BOLD + Font.ITALIC, 14);
    
    private JRadioButton plainJRadioBt = new JRadioButton("Normal",false);
    private JRadioButton boldRadioBt = new JRadioButton("Negrito",false);
    private JRadioButton italicJRadioBt = new JRadioButton("Italic",false);   
    private JRadioButton boldItalicBt = new JRadioButton("Negrito/Italic",false);   
    private ButtonGroup radioGroup = new ButtonGroup(); 
    public RadioButtonFrame(){  
        super("teste");
        setLayout(new FlowLayout());
        add(textfd);
        add(plainJRadioBt);
        add(boldRadioBt);
        add(italicJRadioBt);
        add(boldItalicBt);
        radioGroup.add(plainJRadioBt);
        radioGroup.add(boldRadioBt);
        radioGroup.add(italicJRadioBt);
        radioGroup.add(boldItalicBt);
        
        
        textfd.setFont(plainFont);
        plainJRadioBt.addItemListener(new RadioButtonHandler(plainFont));
        boldRadioBt.addItemListener(new RadioButtonHandler(boldFont));
        italicJRadioBt.addItemListener(new RadioButtonHandler(italicFont));
        boldItalicBt.addItemListener(new RadioButtonHandler(boldItalicFont));

    }
    private class RadioButtonHandler implements ItemListener{
        private Font font;
        public RadioButtonHandler(Font f){
            font = f;
        }
        public void itemStateChanged(ItemEvent e ){
            textfd.setFont(font);
        }
    }
    
}




