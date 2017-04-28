package Testng;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class criarJanelaJframe{
	
	public static void main(String[] args) {
		
		JFrame f =new JFrame("mandar email");	
		
		JLabel  l1;
		
		l1 =new JLabel("meu primeiro label");
		l1.setBounds(100,50,200,50);
		
		f.add(l1);
		
		final JTextField tf=new JTextField();
		tf.setBounds(110,100,150,30);
		
		
		JButton b=new JButton("click");		
		b.setBounds(130,200,100,40);
		
		b.addActionListener(new  ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("Bem vindos ao java");
				
			}
		});
		
		f.add(b);
		f.add(tf);
		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
		
	}
}