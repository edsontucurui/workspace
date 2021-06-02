import javax.swing.JOptionPane;


public class Questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
		//float num2 = Interger.parseInt(JOptionPane.showInputDialog("Digite o valor da hora"));
		float num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora"));
		float sum = num1 * num2;
				
		JOptionPane.showMessageDialog(null, "O Salário do funcionário é: "+sum);
	}

}
