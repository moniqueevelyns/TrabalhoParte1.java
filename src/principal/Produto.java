package principal;

public class Produto {
	private String nome;
	private double pre�o;
	private String condigoDeBarras;
	
	public Produto() {
	}
	public Produto(String nome, double pre�o, String condigoDeBarras) {
		this.nome = nome;
		this.pre�o = pre�o;
		this.condigoDeBarras = condigoDeBarras;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public String getCondigoDeBarras() {
		return condigoDeBarras;
	}
	public void setCondigoDeBarras(String condigoDeBarras) {
		this.condigoDeBarras = condigoDeBarras;
	}
	
	
}

