package br.com.fateczl.lipe.controller;

import br.com.fateczl.lipe.model.Login;

public class LoginUsuarioAdapter implements IAutenticacaoGoogle {
	
	private LoginUsuario loginUsuario;
	
	public LoginUsuarioAdapter(LoginUsuario loginUsuario) {
		this.loginUsuario = loginUsuario;
	} 
	
	@Override
	public void login(Login login) {
		loginUsuario.fazerLogin(login.getNome(), login.getSenha());
		login.setChaveConfirmacao(1000 + (int) (Math.random() * 9999));
		
		loginUsuario.confirmarSegundaEtapa(login.getChaveConfirmacao());
	}

}
