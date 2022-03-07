import java.util.Scanner;
import javax.swing.JOptionPane;
public class Pt2 {
	public static void main (String args[]) {
		
	Pt1 imc = new Pt1();
	
//	imc.leitura();
//	imc.calculos();
//	imc.resultado();
	
	imc.leitura();
    imc.calculos();
    JOptionPane.showMessageDialog(null,"O imc é: "+imc.getImc());
    //imc.resultado();
	
}		
	}
