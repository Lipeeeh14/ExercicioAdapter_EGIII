package br.com.fateczl.lipe.controller;

import br.com.fateczl.lipe.model.Login;

public class LoginTokenAdapter implements IAutenticacaoGoogle {
	
	private LoginToken loginToken;
	
	public LoginTokenAdapter(LoginToken loginToken) {
		this.loginToken = loginToken;
	}

	@Override
	public void login(Login login) {
		login.setToken(100000000 + (long) (Math.random() * 999999999));
		loginToken.enviarToken(login.getToken());
	}

}
