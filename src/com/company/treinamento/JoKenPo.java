package com.company.treinamento;

public class JoKenPo {
	Opcoes opcoes;
	private Opcoes pedra;
	private Opcoes tesoura;
	private Opcoes papel;
	
	public JoKenPo(Opcoes opcoes) {
		this.opcoes = opcoes;
	}
	
	public Opcoes Pedra() {
		return pedra = Opcoes.PEDRA;
	}
	
	public Opcoes Tesoura() {
		return tesoura = Opcoes.TESOURA;
	}
	
	public Opcoes Papel() {
		return papel = Opcoes.PAPEL;
	}
	
	public Opcoes getPedra() {
		return pedra;
	}
	
	public Opcoes getPapel() {
		return papel;
	}
	
	public Opcoes getTesoura() {
		return tesoura;
	}
	
}
	