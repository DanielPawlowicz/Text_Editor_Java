import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextEditor extends JFrame implements ActionListener{

	JTextArea textArea;
	JScrollPane scroll;
	
	TextEditor(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Text Editor");
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		
		textArea = new JTextArea();
//		textArea.setPreferredSize(new Dimension(450, 450));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Calibri", Font.PLAIN, 100));
		
		scroll = new JScrollPane(textArea);
		scroll.setPreferredSize(new Dimension(450, 450));
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		this.add(scroll);
//		this.add(textArea);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
