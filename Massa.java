public class Massa
{
	double valor;
	String nome;

	public Massa(double valor) {
		this.valor = valor;

	}

	public double getValor() {
		return valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public double setValor(int opcao) {
		if(opcao==1){
			this.valor=20.00;
			setNome("Penne");
		}
		if(opcao==2){
			this.valor=10.00;
			setNome("Espaguete");

		}
		if(opcao==3){
			this.valor=15.00;
			setNome("Ravioli");

		}
		else{
			return 0;
		}
	return valor;
	}
}
