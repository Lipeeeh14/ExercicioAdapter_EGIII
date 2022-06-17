package br.com.fateczl.lipe.model;

public class Login {
	private String nome;
	private String senha;
	private int chaveConfirmacao;
	private long token;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getChaveConfirmacao() {
		return chaveConfirmacao;
	}
	
	public void setChaveConfirmacao(int chaveConfirmacao) {
		this.chaveConfirmacao = chaveConfirmacao;
	}
	
	public long getToken() {
		return token;
	}
	
	public void setToken(long token) {
		this.token = token;
	}
	
}
