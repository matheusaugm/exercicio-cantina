import java.util.List;

public class Pedido {

	Cliente c;
	Massa m;
	List<Ingrediente> listaIngredientes;

	double valorTotal;

	public double valorIngredientes(int qtdIngrediente){

		return qtdIngrediente*2;

	}

	public Pedido(Cliente c, Massa m, List<Ingrediente> listaIngredientes) {
		this.c = c;
		this.m = m;
		this.listaIngredientes = listaIngredientes;
	}
	//Achei que seria legal colocar no pedido, porém esqueci que tinha feito isso rsrsrs
	public void setValorTotal(double valorTotal) {

		this.valorTotal=this.m.valor+ this.valorIngredientes(this.listaIngredientes.size());
	}
}
