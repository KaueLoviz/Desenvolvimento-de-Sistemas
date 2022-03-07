import java.util.Scanner;
public class EX1{
double a;
double b;
	


public void  EscolhaOp() {
	Scanner ler = new Scanner (System.in);
	int Escolha;
	System.out.println("Escolha a operação");
	System.out.println("");
	System.out.println("1 = Somar");
	System.out.println("2 = Subtração");
	System.out.println("3 = Multiplicação");
	System.out.println("4 = Divisão");
	Escolha = ler.nextInt();
	
	if(Escolha == 1) {
		soma();
	}
	else if(Escolha == 2) {
		subtração();
	}
	else if(Escolha == 3) {
		multiplicação();
	}
	else if(Escolha == 4) {
		divisão();
	}

}



public void numero() {
	Scanner ler = new Scanner (System.in);
	System.out.println("Digite o primeiro valor");
	a = ler.nextDouble();
	System.out.println("Digite o segundo valor");
	b = ler.nextDouble();
}


public void soma() {
	double resultado = a+b;
	System.out.println("O resultado da soma é:" +resultado);
}
public void subtração() {
	double resultado = a-b;
	System.out.println("O resultado da subtração é:" +resultado);
}
public void divisão() {
	double resultado = a/b;
	System.out.println("O resultado da divisão é:" +resultado);
}
public void multiplicação() {
	double resultado = a*b;
	System.out.println("O resultado da multiplicação é:" +resultado);
}
}