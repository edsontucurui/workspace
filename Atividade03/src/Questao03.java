import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite nota 01"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite nota 02"));
		float sum = num1 + num2;
		float med = sum / 2;
				
		JOptionPane.showMessageDialog(null, "A média é: "+med);
		
		
	}

}
