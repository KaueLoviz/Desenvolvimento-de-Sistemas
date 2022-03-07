import java.util.Scanner;
public class Pt2 {
	public static void main (String args[]) {
		
	Pt1 imc = new Pt1();
	
//	imc.leitura();
//	imc.calculos();
//	imc.resultado();
	
    imc.setAlt(2.0);
    imc.setPeso(100);
    imc.calculos();
    JOptionPane.showMessageDialog("O imc é: "+imc.getImc());
    //imc.resultado();
	
}		
	}
