package beans;

import Model.Contato;

public class ContatoBean {

	private Contato contato = new Contato();
	
	public ContatoBean(){
		System.out.println("Criando bean ContatoBean");
	}
	
	public String gravar(String paginarecebe){
		System.out.println("Gravando contato "+ contato.getNome());
		System.out.println("Gravando contato "+ contato.getTelefone());
		System.out.println("Gravando contato "+ contato.getNascimento());
		System.out.println();
		return paginarecebe;
	}
	
	public void alterar(){
		
	}
	
	public void deletar(){
		
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
}
