import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2;
		n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 número:"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 número:"));
		
		if (n1 > n2) {
			JOptionPane.showMessageDialog(null, "O maior número é: "+n1);
		} else if (n1 < n2){
			JOptionPane.showMessageDialog(null, "O maior número é: "+n2);
		} else {
			JOptionPane.showMessageDialog(null, "Números iguais.");
		}
	}

}
