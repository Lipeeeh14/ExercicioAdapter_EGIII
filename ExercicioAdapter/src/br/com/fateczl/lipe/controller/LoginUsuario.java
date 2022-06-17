package br.com.fateczl.lipe.controller;

public class LoginUsuario {
	public void fazerLogin(String nome, String senha) {
		System.out.println("Login realizado com sucesso!");
		
		try {
			System.out.println(nome + " uma chave de confirmação será enviada para você.");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void confirmarSegundaEtapa(int chaveConfirmacao) {
		System.out.println("Chave confirmada: " + chaveConfirmacao);
	}
}
