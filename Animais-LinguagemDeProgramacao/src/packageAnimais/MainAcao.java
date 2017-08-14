package packageAnimais;

public class MainAcao {

	public static void main(String[] args) {
		
		Cachorro pitbull = new Cachorro();
		pitbull.setRaca("Pitbull");
		pitbull.setTamanho(30);
		System.out.println("Raça: " + pitbull.getRaca());
		System.out.println("Tamanho: " + pitbull.getTamanho());
		pitbull.latir();
						
		System.out.println("Agora o gato mia");
		Gato siames = new Gato();
		siames.setRaca("siames");
		siames.setTamanho(20);
		System.out.println("Raça: " + siames.getRaca());
		System.out.println("Tamanho: " + siames.getTamanho());
		siames.miar();

	}

}
