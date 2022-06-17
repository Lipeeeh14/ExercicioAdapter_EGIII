package br.com.fateczl.lipe.model;

public class LoginBuilder {
	private Login login;

	public LoginBuilder() {
		this.login = new Login();
	}
	
	public static LoginBuilder builder() {
		return new LoginBuilder();
	}
	
	public LoginBuilder addUsuario(String nome, String senha) {
		login.setNome(nome);
		login.setSenha(senha);
		
		return this;
	}
	
	public Login get() {
		return login;
	}
}
