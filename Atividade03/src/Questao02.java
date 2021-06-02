import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número."));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número."));
		int sum = num1 + num2;
				
		JOptionPane.showMessageDialog(null, "A soma é: "+sum);
		
		
	}

}
