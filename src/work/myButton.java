package work;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class myButton implements ActionListener {
	public JButton ok = new JButton();
	
	public void test() {
		System.out.println("23");
		
		ok.setText("ok");
		ok.setBounds(0,0,0,0);
		ok.setVisible(true);
	}
	
	JButton button;
	
	public void newtest(){
		
		button = new JButton();
		
		
		button.addActionListener(this);
		button.setText("Ajoutez Ticket");
		button.setBounds(0, 0 ,400,300);
		button.setVisible(true);
        button.setForeground(Color.BLUE);
        button.setBackground(Color.BLUE);
         
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			System.out.println("Goku");
		}
		
	}

	

}
