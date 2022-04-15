package principal;

public class Produto {
	private String nome;
	private double preço;
	private String condigoDeBarras;
	
	public Produto() {
	}
	public Produto(String nome, double preço, String condigoDeBarras) {
		this.nome = nome;
		this.preço = preço;
		this.condigoDeBarras = condigoDeBarras;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public String getCondigoDeBarras() {
		return condigoDeBarras;
	}
	public void setCondigoDeBarras(String condigoDeBarras) {
		this.condigoDeBarras = condigoDeBarras;
	}
	
	
}

