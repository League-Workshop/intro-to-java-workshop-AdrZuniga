package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		
		// 2. If they say "yes", tell them they will rule the world.
	

		// 3. Otherwise, wish them good luck washing dishes.
		
		String answer = JOptionPane.showInputDialog("do you know how to write code");
		
		if(answer.equals("yes")){
			JOptionPane.showMessageDialog(null, "you will rule the wrold");
		}
		else {
			JOptionPane.showMessageDialog(null,"good luck washing dishes" );
		}

	}
}

