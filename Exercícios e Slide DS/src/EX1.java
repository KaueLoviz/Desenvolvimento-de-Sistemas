import java.util.Scanner;
public class EX1{
double a;
double b;
	


public void  EscolhaOp() {
	Scanner ler = new Scanner (System.in);
	int Escolha;
	System.out.println("Escolha a opera��o");
	System.out.println("");
	System.out.println("1 = Somar");
	System.out.println("2 = Subtra��o");
	System.out.println("3 = Multiplica��o");
	System.out.println("4 = Divis�o");
	Escolha = ler.nextInt();
	
	if(Escolha == 1) {
		soma();
	}
	else if(Escolha == 2) {
		subtra��o();
	}
	else if(Escolha == 3) {
		multiplica��o();
	}
	else if(Escolha == 4) {
		divis�o();
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
	System.out.println("O resultado da soma �:" +resultado);
}
public void subtra��o() {
	double resultado = a-b;
	System.out.println("O resultado da subtra��o �:" +resultado);
}
public void divis�o() {
	double resultado = a/b;
	System.out.println("O resultado da divis�o �:" +resultado);
}
public void multiplica��o() {
	double resultado = a*b;
	System.out.println("O resultado da multiplica��o �:" +resultado);
}
}