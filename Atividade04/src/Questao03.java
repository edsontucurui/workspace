import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero: "));
		
				
		String numeros = "";
		
	 
			if (n1 == n2) {
				JOptionPane.showMessageDialog(null, "Os n�meros s�o iguais.");			
			} else {
			
				
				for (int i = n1; i <= n2; i++) {
					numeros = numeros + i+",";
				
			}
               
			JOptionPane.showMessageDialog(null,  "Os numeros entre "+n1+" e "+n2+" s�o: "+numeros );
	}
		
}

}