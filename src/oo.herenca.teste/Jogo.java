package oo.herenca.teste;

import oo.herenca.Direcao;
import oo.herenca.Heroi;
import oo.herenca.Jogador;
import oo.herenca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jogador monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		Jogador heroi = new Heroi(10,6);
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.println("Monstro tem "+monstro.vida+" vida");
		System.out.println("Herói tem "+heroi.vida+" vida");
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem "+monstro.vida+" vida");
		System.out.println("Herói tem "+heroi.vida+" vida");
		
		System.out.print(monstro.x);
		System.out.print(" ");
		System.out.println(monstro.y);
	
	}

}
