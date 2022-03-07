
public class Kombi {

		public static void main(String args[]){
			Veiculo Kombi = new  Veiculo();
			
			Kombi.modelo = "Kombi";
			Kombi.placa = "olas235";
			Kombi.ano = 1990;
			Kombi.marca = "Wolksvagen";
			Kombi.drift = false;
			Kombi.acelerar = false;
			
			Kombi.drift();
			Kombi.acelerar();
			
			System.out.println("Meu modelo é "+Kombi.modelo);
			System.out.println("Minha placa é "+Kombi.placa);
			System.out.println("Meu ano de fabricacao é "+Kombi.ano);
			System.out.println("Minha marca é "+Kombi.marca);
			
			
			
		}
}
