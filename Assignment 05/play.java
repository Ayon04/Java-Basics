
import javax.swing.*;
import java.awt.*;

class play{
	public static void main(String[] args){
		//create frame : 
		JFrame fram = new JFrame("JAVA file ");
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setSize(800, 400);
	
		//create menubar & and some menu ::
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("FILE");
		JMenu m2 = new JMenu("HELP");
		JMenu m3 = new JMenu("Members");
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		//for file;
		JMenuItem mi1 = new JMenuItem("Save");
		JMenuItem mi2 = new JMenuItem("Save As");
		m1.add(mi1);
		m1.add(mi2);
		//for help;
		JMenuItem mi3 = new JMenuItem("Setting");
		JMenuItem mi4 = new JMenuItem("GoodBye");
		m2.add(mi3);
		m2.add(mi4);
		//for members;
		JMenuItem mi5 = new JMenuItem("Mr.A");
		JMenuItem mi6 = new JMenuItem("Mr.B");
		JMenuItem mi7 = new JMenuItem("Mr.C");
		JMenuItem mi8 = new JMenuItem("Mr.D");
		m3.add(mi5);
		m3.add(mi6);
		m3.add(mi7);
		m3.add(mi8);
		//create some pannel ::
		JPanel p1=  new JPanel(); 
		JLabel l1 = new JLabel("Enter Text");
		JTextField tf = new JTextField(10); 
		JButton button1 = new JButton("Submit");
		JButton button2 = new JButton("Reset");
		p1.add(l1);
		p1.add(tf);
		p1.add(button1);
		p1.add(button2);
		
		//
		JPanel p2 = new JPanel();
		JTextArea ta = new JTextArea();
		
	
		
		
		//visible :
		fram.getContentPane().add(BorderLayout.SOUTH,p1);
	    fram.getContentPane().add(BorderLayout.NORTH, mb);
		fram.getContentPane().add(BorderLayout.CENTER,ta);
		fram.getContentPane().add(BorderLayout.CENTER,p2);
		fram.setVisible(true);
		
	}
}