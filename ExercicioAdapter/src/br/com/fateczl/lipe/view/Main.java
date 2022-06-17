package br.com.fateczl.lipe.view;

import br.com.fateczl.lipe.controller.LoginToken;
import br.com.fateczl.lipe.controller.LoginTokenAdapter;
import br.com.fateczl.lipe.controller.LoginUsuario;
import br.com.fateczl.lipe.controller.LoginUsuarioAdapter;
import br.com.fateczl.lipe.model.Login;
import br.com.fateczl.lipe.model.LoginBuilder;

public class Main {

	public static void main(String[] args) {
		Login login = LoginBuilder.builder().addUsuario("Lipe", "123").get();

		LoginUsuarioAdapter loginUsuarioAdapter = new LoginUsuarioAdapter(new LoginUsuario());
		loginUsuarioAdapter.login(login);
		
		LoginTokenAdapter loginTokenAdapter = new LoginTokenAdapter(new LoginToken());
		loginTokenAdapter.login(login);
	}

}
