import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno(a):");
		float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota final:"+nome+":"));


		if (nota < 4.0) { 
			JOptionPane.showMessageDialog(null,"O(a) aluno(a): "+nome+", está reprovado(a), com a nota "+nota);
		} else if((nota > 4.0) && (nota < 7.0)) {
			JOptionPane.showMessageDialog(null,"O(a) aluno(a): "+nome+", está em recuperação, com a nota "+nota);
		} else if (nota >= 7.0){
			JOptionPane.showMessageDialog(null,"O(a) aluno(a): "+nome+", está aprovado(a), com a nota "+nota);
	}

	}
	
}
