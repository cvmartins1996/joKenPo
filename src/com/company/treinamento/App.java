package com.company.treinamento;
public class App {
	public static void main(String[] args) {
		Computer computer1 = new Computer();
		Player player1 = new Player(new JoKenPo(Opcoes.PAPEL));
		
		Resultado resultado = new Resultado();
		resultado.exibir();
		
	}
}