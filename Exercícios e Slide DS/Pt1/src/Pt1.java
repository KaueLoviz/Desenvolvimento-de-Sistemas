import java.util.Scanner;
import javax.swing.JOptionPane;
public class Pt1 {

private double imc;
private double alt;
private double altAoq;
private int peso;
private String Salt;
private String Speso;

public double getAlt() {
	return alt;
}
public void setAlt(double alt) {
	this.alt = alt;
}
public double getAltAoq() {
	return altAoq;
}
public void setAltAoq(int altAoq) {
	this.altAoq = altAoq;
}
public int getPeso() {
	return peso;
}
public void setPeso(int peso) {
	this.peso = peso;
}
public double getImc() {
	return imc;
}
public void setImc(int imc) {
	this.imc = imc;
}


	


public void leitura() {
	
	Speso = JOptionPane.showInputDialog("Digite seu Peso");
	peso = Integer.parseInt(Speso);
	Salt = JOptionPane.showInputDialog("Digite sua altura");
	alt = Double.parseDouble(Salt);
}

public void  calculos() {
	altAoq = alt*alt;
	imc =peso/altAoq;
}

public void resultado(){
	if(imc < 18.5){
		JOptionPane.showMessageDialog(null,"Peso baixo");
	}
	else if (imc > 18.6 && imc < 24.9){
		JOptionPane.showMessageDialog(null,"Peso  normal");
	}
	else if ( imc >= 25.0  && imc < 30.0){
		JOptionPane.showMessageDialog(null,"Sobrepeso");
	}
	else if(imc >= 30.0 && imc < 35.0){
		JOptionPane.showMessageDialog(null,"Obesidade Grau I");
	}
	else if(imc >=35.0 && imc< 40.0){
		JOptionPane.showMessageDialog(null,"Obesidade Severa Grau II");
		
	}
	else if(imc >=40){
		JOptionPane.showMessageDialog(null,"Obesidade Mórbida  Grau  III");
	}
}





}
