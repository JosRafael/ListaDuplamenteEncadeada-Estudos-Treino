public class Pessoa {
	private String nome;
	private String telefone;
	private String email;
	
	
	public Pessoa(String nome) {
		this.setNome(nome);
		this.setEmail("vazio");
		this.setTelefone("vazio");
	}
	
	public Pessoa(String nome, String telefone, String email) {
		this.setEmail(email);
		this.setNome(nome);
		this.setTelefone(telefone);
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setTelefone(String telefone) {
		if (telefone != null && !telefone.isBlank()) {
			this.telefone = telefone;
		} else {
			System.out.println("Telefone não pode ser vazio.");
		}
	}
	
	public void setNome(String nome) {
		if(nome != null && !nome.isBlank()) {
			this.nome = nome;
		} else { 
			System.out.println("Nome não pode ser vazio");
		}
	}
	
	public void setEmail(String email) {
		if(email != null && !email.isBlank())
			this.email = email;
		else
			System.out.println("Email não pode ser vazio.");
	}
	
	public void alterarEmailTelefone(String email, String telefone) {
		if(!email.isBlank() && !telefone.isBlank()) {
			this.email = email;
			this.telefone = telefone;
		} else {
			System.out.println("Email ou telefone são vazios.");
		}
	}
	
	public void imprimeDados() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Email: "+this.email);
		System.out.println("Telefone: "+this.telefone);
	}
}