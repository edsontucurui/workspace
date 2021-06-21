package Pessoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Pessoa p = new Pessoa();
		
		p.setNome(JOptionPane.showInputDialog("Digite o seu nome:")) ;

		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		p.setDataNascimento(LocalDate.parse(JOptionPane.showInputDialog("Digite sua data de nascimento:"),formatoData));
		
		p.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite sua idade:")));
		
		JOptionPane.showInternalMessageDialog(null, p.dados());
		
		
	}

}
