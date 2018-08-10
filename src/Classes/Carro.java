package Classes;

public class Carro extends Automoveis {
	
	public Carro() {
		super();
		this.setNumeroDePortas(4);
		this.setNumeroDeRodas(4);
		this.setQuantidadeDeEstepes(1);
		this.setQuantidadeDePassageiros(5);
	}
	
	public void ligar() {
		this.setMotor(Motor.LIGADO);
	}
	
	public void desligar() {
		this.setMotor(Motor.DESLIGADO);
	}
	
	public Integer acelerar(Integer velocidade) {
		if(getMotor() == Motor.LIGADO) {
			if(velocidade < 110) {
				velocidade = velocidade + 10;
				setVelocidadeAtual(velocidade);
				return getVelocidadeAtual();
			}
		}	return getVelocidadeAtual();
		
	}
	
	public Integer diminuir(Integer velocidade) {
		return velocidade - 10;
	}
	
	public Integer trocarPneus(Integer quantidade) {
		return quantidade * 150;
	}
	
	public String exibeEstado() {
		return this.toString();
	}
	
	@Override
	public String toString() {
		return "[Motor: "+ getMotor() + "]" + "[Velocidade: "+ getVelocidadeAtual() +"]" +
				"[Rodas: "+ getNumeroDeRodas() + "]" + "[Portas: "+ getNumeroDePortas() +"]"
				+ "[Passageiros: "+ getQuantidadeDePassageiros() + "]" + "[Estepes: "+ getQuantidadeDeEstepes() +"]";
	}
	
}