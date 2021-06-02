import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da conta"));
		float perct = cont * 0.10f;
		float tot = cont + perct;
				
		JOptionPane.showMessageDialog(null,"10% do garçom: " + perct + " \n" + "Valor Final: " +tot);
	}

}
