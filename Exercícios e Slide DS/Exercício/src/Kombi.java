
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
			
			System.out.println("Meu modelo � "+Kombi.modelo);
			System.out.println("Minha placa � "+Kombi.placa);
			System.out.println("Meu ano de fabricacao � "+Kombi.ano);
			System.out.println("Minha marca � "+Kombi.marca);
			
			
			
		}
}
