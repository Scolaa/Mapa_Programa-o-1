package Classes;

public class Moto extends Automoveis {

	public Moto() {
		super();
		this.setNumeroDePortas(0);
		this.setNumeroDeRodas(2);
		this.setQuantidadeDeEstepes(0);
		this.setQuantidadeDePassageiros(2);
	}
	
	public void ligar() {
		this.setMotor(Motor.LIGADO);
	}
	
	public void desligar() {
		this.setMotor(Motor.DESLIGADO);
	}
	
	public Integer acelerar(Integer velocidade) {
		if(velocidade > 110) {
			return velocidade;
		}
		velocidade = velocidade + 20;
		setVelocidadeAtual(velocidade);
		return getVelocidadeAtual();
	}
	
	public Integer diminuir(Integer velocidade) {
		return velocidade - 20;
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
