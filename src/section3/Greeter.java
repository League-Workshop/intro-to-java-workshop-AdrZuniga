package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	
	String name = JOptionPane.showInputDialog("what is your name");
		
	JOptionPane.showMessageDialog(null, "hello " + name + " how is your day?");
	
	String number = JOptionPane.showInputDialog("how old are you?");
	
	JOptionPane.showMessageDialog(null, "oh " + number + ", your big");
	
	String gender = JOptionPane.showInputDialog("no offense but, are you a boy or a girl");
	
	JOptionPane.showMessageDialog(null, "well it is very nice to meet you uh... " + name + " right? Sorry i can forget all the time");
	
}
}
