package packageAnimais;

public class Cachorro extends Animal {
	private int tamanho;
	private String raca;
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}

	void latir(){
		System.out.println("aurrr");
	}
}
