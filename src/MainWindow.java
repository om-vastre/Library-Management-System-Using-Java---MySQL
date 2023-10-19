
import java.awt.event.*;  
import javax.swing.*;    
public class MainWindow {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");  

 
    JLabel l1=new JLabel("Dashboard");  
    l1.setBounds(50,20, 100,30);
    l1.setFont(null);
    JTextField tf=new JTextField();
    tf.setBounds(50,50, 150,20);  
    
    JButton b=new JButton("Click Here");  
    b.setBounds(50,100,95,30);  
    b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){  
            tf.setText("Welcome to Javatpoint.");  
        }
    });
    
    f.add(b);
    f.add(tf);
    f.add(l1); 
    f.setSize(1300,600);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}