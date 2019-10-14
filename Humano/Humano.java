public class Humano {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;
	
	public Humano(String nome,int idade,double altura,double peso,String sexo){
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}
	
	public void setAltura(double altura) {
		this.altura=altura;
	}
	
	public void setPeso(double peso) {
		this.peso=peso;
	}
	
	public String analisaIMC() {
	double imc=calcIMC();
        if (imc < 18.5)
            return "Abaixo do peso ideal, vamos melhorar!";
        else if ((imc > 18.5) &&(imc <24.9))
            return "Voce esta no peso ideal, parabens!";
        else if ((imc > 25.0)&& (imc <29.9))
        	return "Voce está com excesso de peso, vamos melhorar!";
        else if ((imc > 30.0) && (imc <34.9))
        	return "Obesidade Classe I, cuidado!";
        else if ((imc > 35.0) && (imc <39.9))
        	return "Obesidade Classe II, ainda temos como mudar isso!";
        else 
        	return "Obesidade Classe III, procure ajuda, nada está perdido!";
	}
	
	private double calcIMC() {
		return this.peso/(this.altura*this.altura);
	}
}
