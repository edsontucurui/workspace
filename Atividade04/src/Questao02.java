import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2;
		n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 n�mero:"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 n�mero:"));
		
		if (n1 > n2) {
			JOptionPane.showMessageDialog(null, "O maior n�mero �: "+n1);
		} else if (n1 < n2){
			JOptionPane.showMessageDialog(null, "O maior n�mero �: "+n2);
		} else {
			JOptionPane.showMessageDialog(null, "N�meros iguais.");
		}
	}

}
