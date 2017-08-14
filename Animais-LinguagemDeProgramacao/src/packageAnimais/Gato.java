package packageAnimais;

public class Gato {
	private int tamanho;
	private String raca;
	
	void miar(){
		System.out.println("miaaaau!");
	}
	public String getRaca(){
		return raca;
	}
	public void setRaca(String raca){
		this.raca = raca;
	}
	public int getTamanho(){
		return tamanho;
	}
	public void setTamanho(int tamanho){
		this.tamanho = tamanho;
	}
}
