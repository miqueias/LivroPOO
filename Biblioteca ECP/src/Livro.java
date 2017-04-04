//nome da classe
public class Livro {
	//atributos
	String nome;
	String categoria;
	boolean disponibilidade;
	String stado;
	int codigo;
	double taxa;
	String autor;
	int diasParaDevolucao;
	//construtor
	Livro() {
		
	}
	//métodos
	//void -> não tem retorno
	void taxaPorCategoria() {
		if(categoria.equals("ROMANCE")) {
			taxa = 5.00;
		} else if (categoria.equals("TERROR")) {
			taxa = 6.00;
		} else if (categoria.equals("TECNOLOGIA")) {
			taxa = 10.00;
		} else {
			taxa = 11.00;
		}
	}
	//double -> tipo de retorno
	double taxaPorAtrasso(int diasDeAtrasso) {
		return taxa * diasDeAtrasso;
	}	
}
