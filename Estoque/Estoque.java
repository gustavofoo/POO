public class Estoque{
	private String nome;
	private int qtdAtual;
	private int qtdMinima;

	Estoque (String nome, int qtdAtual, int qtdMinima){
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}
	
	public Estoque(){
		
	} 
	
	void mudarNome(String nome){
		this.nome = nome;
	}
	
	void mudarqtdMinima(int qtdMinima){
		if(this.qtdMinima > 0){
			this.qtdMinima = qtdMinima;
		}
	}
	
	void repor(int qtd){ 
		if(qtd > 0){
			this.qtdAtual += qtd;
		}
	}
	
	void darBaixa(int qtd){
		if((this.qtdAtual - qtd) >= 0) {
			this.qtdAtual -= qtd;
		}
	}
		
	String mostra(){
			return("Produto: " + this.nome + System.lineSeparator() + "Quantidade mínima: " + this.qtdMinima + System.lineSeparator() + "Quantidade atual: " + this.qtdAtual + System.lineSeparator());
		}
	
	boolean precisaRepor(){
		if (this.qtdAtual <= this.qtdMinima) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void reporValor() {
		this.qtdAtual = this.qtdMinima;
	}	
}
