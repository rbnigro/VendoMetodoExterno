package br.com.pacote;

public class Pessoa {

	private String name = "DigiteSeuNome";
	
	private String pegarNome(String visitanteNome) {
		System.out.println("Quem �? " + visitanteNome);
		return name;
	}
}
