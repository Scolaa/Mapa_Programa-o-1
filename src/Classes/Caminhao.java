package Classes;

public class Caminhao extends Automoveis {

	public Caminhao() {
		super();
		this.setNumeroDePortas(2);
		this.setNumeroDeRodas(10);
		this.setQuantidadeDeEstepes(2);
		this.setQuantidadeDePassageiros(3);
	}
	
	public void ligar() {
		this.setMotor(Motor.LIGADO);
	}
	
	public void desligar() {
		this.setMotor(Motor.DESLIGADO);
	}
	
	public Integer acelerar(Integer velocidade) {
		if(velocidade > 80) {
			return velocidade;
		}
		velocidade = velocidade + 5;
		setVelocidadeAtual(velocidade);
		return getVelocidadeAtual();
	}
	
	public Integer diminuir(Integer velocidade) {
		return velocidade - 5;
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
