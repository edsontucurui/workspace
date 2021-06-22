package Pessoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		boolean repetir  = true;
		
		do {
		
		try {
			
		
		Pessoa p = new Pessoa();
		
		p.setNome(JOptionPane.showInputDialog("Digite o seu nome:")) ;

		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		p.setDataNascimento(LocalDate.parse(JOptionPane.showInputDialog("Digite sua data de nascimento:"),formatoData));
		
		p.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura:").replace(",",".")));
		
		JOptionPane.showInternalMessageDialog(null, p.dados());
		repetir = false;
		
		}catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Valor numerico invalido!");
		
		
		}catch (DateTimeParseException dtpe) {
			JOptionPane.showMessageDialog(null, "Data de Nascimento invalida!");
			
		
		} catch (Exception e ) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Algo deu Errado");
			
			
		}	
		} while (repetir);
		
		
	}

}
