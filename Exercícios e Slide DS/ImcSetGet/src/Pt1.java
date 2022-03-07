import java.util.Scanner;
import javax.Swing.JOptionPane;
public class Pt1 {

private double alt;
private double altAoq;
private double peso;
private double Salt;
private double Speso;

public double getAlt() {
	return alt;
}
public void setAlt(double alt) {
	this.alt = alt;
}
public double getAltAoq() {
	return altAoq;
}
public void setAltAoq(double altAoq) {
	this.altAoq = altAoq;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}
public double getImc() {
	return imc;
}
public void setImc(double imc) {
	this.imc = imc;
}


	


public void leitura() {
	
	peso = JOptionPane.showInputDialog("Digite seu Peso");
	Speso = Integer.parseDouble(peso);
	alt = JOptionPane.showInputDialog("Digite sua altura");
	Salt = Integer.parseDouble(alt);
}

public void  calculos() {
	altAoq = alt*alt;
	imc =peso/altAoq;
}

public void resultado(){
	if(imc < 18.5){
		JOptionPane.showMessageDialog("Peso baixo");
	}
	else if (imc > 18.6 && imc < 24.9){
		JOptionPane.showMessageDialog("Peso  normal");
	}
	else if ( imc >= 25.0  && imc < 30.0){
		JOptionPane.showMessageDialog("Sobrepeso");
	}
	else if(imc >= 30.0 && imc < 35.0){
		JOptionPane.showMessageDialog("Obesidade Grau I");
	}
	else if(imc >=35.0 && imc< 40.0){
		JOptionPane.showMessageDialog("Obesidade Severa Grau II");
		
	}
	else if(imc >=40){
		JOptionPane.showMessageDialog("Obesidade Mórbida  Grau  III");
	}
}





}
