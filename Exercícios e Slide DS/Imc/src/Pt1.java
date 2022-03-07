import java.util.Scanner;
public class Pt1 {

double alt;
double altAoq;
double peso;
double imc;


public void leitura() {
	Scanner ler = new Scanner(System.in);
	System.out.println("Digite seu peso");
	peso = ler.nextDouble();
	System.out.println("Digite sua altura");
	alt = ler.nextDouble();
}

public void  calculos() {
	altAoq = alt*alt;
	imc =peso/altAoq;
}

public void resultado(){
	if(imc < 18.5){
		System.out.println("Peso baixo");
	}
	else if (imc > 18.6 && imc < 24.9){
		System.out.println("Peso  normal");
	}
	else if ( imc >= 25.0  && imc < 30.0){
		System.out.println("Sobrepeso");
	}
	else if(imc >= 30.0 && imc < 35.0){
		System.out.println("Obesidade Grau I");
	}
	else if(imc >=35.0 && imc< 40.0){
		System.out.println("Obesidade Severa Grau II");
		
	}
	else if(imc >=40){
		System.out.println("Obesidade Mórbida  Grau  III");
	}
}





}
