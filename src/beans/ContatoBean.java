package beans;

import Model.Contato;

public class ContatoBean {

	private Contato contato = new Contato();

	public ContatoBean() {
		System.out.println("Criando bean ContatoBean");
	}

	public String gravar(String paginarecebe) {
		int i = 5;
		while (i > 0) {
			System.out.println("Gravando contato " + contato.getNome());
			System.out.println("Gravando contato " + contato.getTelefone());
			System.out.println("Gravando contato " + contato.getNascimento());
			System.out.println("Macaco Banana");
			i--;
		}
		return paginarecebe;
	}

	public void alterar() {

	}

	public void deletar() {

	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
