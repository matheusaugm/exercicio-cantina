import javax.swing.*;
import java.util.ArrayList;

public class Cantina {
	public static void main(String[] args) {


		int escolhaUsuario;
		String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente");
		Cliente cliente = new Cliente(nomeCliente);
		int nomeMassa = Integer.parseInt(JOptionPane.showInputDialog("Escolha a massa\n 1. Penne\n2. Ravioli\n3. Espaguete\n4. Outros"));
		Massa massa = new Massa(nomeMassa);
		massa.setValor(nomeMassa);

		double valorFinal = massa.setValor(nomeMassa);
		if(nomeMassa==4) {
			massa.setNome(JOptionPane.showInputDialog("Digite o nome da massa:"));
			 valorFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da massa:"));

		}

		ArrayList<Ingrediente> ingredientes =  new ArrayList<>();

		do{
		escolhaUsuario= Integer.parseInt(JOptionPane.showInputDialog("Escolha um ingrediente abaixo\n1. Bacon\n2. Mussarela\n3. Tomate\n4. Queijo\n5. Sair"));
		switch (escolhaUsuario){
			case 1:
				ingredientes.add(new Ingrediente("Bacon"));
				break;
			case 2:
				ingredientes.add(new Ingrediente("Mussarela"));
				break;
			case 3:
				ingredientes.add(new Ingrediente("Tomate"));
				break;
			case 4:
				ingredientes.add(new Ingrediente("Queijo"));
				break;
			case 5:
				break;

			default:
				JOptionPane.showMessageDialog(null, "Digite um valor valido34");
				break;
		}
		}while(escolhaUsuario !=5);
		Pedido pedido = new Pedido(cliente,massa,ingredientes);
		double valorPrato = pedido.valorIngredientes(ingredientes.size())+valorFinal;
		String mensagem = "Pedido feito por: "+pedido.c.nome+"\nPedido:\n"+pedido.m.nome+" com ";
		for (int i = 0; i < ingredientes.size(); i++) {
			mensagem += ingredientes.get(i).nome;
			if (i <ingredientes.size()-1){
				mensagem += " e ";

			}
		}
		mensagem+="\n e custou: R$ "+valorPrato;

		JOptionPane.showMessageDialog(null, mensagem);


	}
}
