import java.util.Scanner;

public class Executa {
	public static void main(String[] args) {
		//criando objetos
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Scanner leitor = new Scanner(System.in);
		//preenchendo atributos
		//utilizamos o . (ponto) para acessar atributos
		System.out.println("Digite o nome do autor: ");
		livro1.autor = leitor.next();
		System.out.println("Digite o nome do livro: ");
		livro1.nome = leitor.next();
		System.out.println("Digite o categoria: ");
		livro1.categoria = leitor.next();
		System.out.println("Digite o codigo: ");
		livro1.codigo = leitor.nextInt();
		System.out.println("Digite a quantidae de dias pra devolução: ");
		livro1.diasParaDevolucao = leitor.nextInt();
		livro1.disponibilidade = true;
		System.out.println("Digite o estado do livro: ");
		livro1.stado = leitor.next();
		//acessando o método
		livro1.taxaPorCategoria();
		//acessando informações do objeto
		System.out.println("Nome do Livro: " + livro1.nome);
		System.out.println("Autor: " + livro1.autor);
		System.out.println("Categoria: " + livro1.categoria);
		System.out.println("Taxa :" + livro1.taxa);
		double multa = livro1.taxaPorAtrasso(12);
		System.out.println("Sua multa por atrasso foi de: " + multa);
		
		livro2.nome = "Contos de Terror";
		livro2.categoria = "TERROR";
		livro2.taxaPorCategoria();
		System.out.println("Taxa :" + livro2.taxa);
		double multa2 = livro2.taxaPorAtrasso(30);
		System.out.println("Sua multa por atrasso foi de: " + multa2);
	}

}
