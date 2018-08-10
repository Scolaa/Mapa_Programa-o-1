package Apricativo.Java;

import Classes.Caminhao;
import Classes.Carro;
import Classes.Moto;
import Classes.Motor;

public class AplicativoJava {
	

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Caminhao caminhao = new Caminhao();
		Moto moto = new Moto();
		
		carro.setMotor(Motor.DESLIGADO);
		carro.acelerar(carro.getVelocidadeAtual());
		carro.acelerar(carro.getVelocidadeAtual());

		
		caminhao.setMotor(Motor.LIGADO);
		caminhao.acelerar(caminhao.getVelocidadeAtual());
		caminhao.acelerar(caminhao.getVelocidadeAtual());

		
		moto.setMotor(Motor.LIGADO);
		moto.acelerar(moto.getVelocidadeAtual());
		moto.acelerar(moto.getVelocidadeAtual());
		
		
		System.out.println("CARRO");
		System.out.println(carro.exibeEstado());
		System.out.println("O valor da troca dos 4 pneus do Carro é: " + carro.trocarPneus(4) + " Reais");
		System.out.println("");
		
		if(carro.getVelocidadeAtual() > 110) {
			System.out.println("Acima da velocidade máxima permitida!");
		} 
		
		
		System.out.println("CAMINHÃO");
		System.out.println(caminhao.exibeEstado());
		System.out.println("O valor da troca dos 10 pneus do Caminhão é: " + caminhao.trocarPneus(10) + " Reais");
		System.out.println("");
		
		if(caminhao.getVelocidadeAtual() > 80) {
			System.out.println("Acima da velocidade máxima permitida!");
		} 
		

		System.out.println("MOTO");
		System.out.println(moto.exibeEstado());
		System.out.println("O valor da troca dos 2 pneus da Moto é: " + moto.trocarPneus(2) + " Reais");
		
		if(moto.getVelocidadeAtual() > 110) {
			System.out.println("Acima da velocidade máxima permitida!");
		} 
	}

}
