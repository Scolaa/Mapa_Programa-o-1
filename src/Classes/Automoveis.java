package Classes;

public class Automoveis {
	
	private Motor motor = Motor.DESLIGADO;
	private Integer numeroDeRodas;
	private Integer numeroDePortas;
	private Integer velocidadeAtual = 0;
	private Integer quantidadeDePassageiros;
	private Integer quantidadeDeEstepes;
	
	public Automoveis() {
		
	}

	public Automoveis(Integer numeroDeRodas, Integer numeroDePortas, Integer quantidadeDePassageiros, Integer quantidadeDeEstepes) {
		this.numeroDeRodas = numeroDeRodas;
		this.numeroDePortas = numeroDePortas;
		this.quantidadeDePassageiros = quantidadeDePassageiros;
		this.quantidadeDeEstepes = quantidadeDeEstepes;
	}
	
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Integer getNumeroDeRodas() {
		return numeroDeRodas;
	}

	public void setNumeroDeRodas(Integer numeroDeRodas) {
		this.numeroDeRodas = numeroDeRodas;
	}

	public Integer getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(Integer numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	public Integer getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(Integer velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public Integer getQuantidadeDePassageiros() {
		return quantidadeDePassageiros;
	}

	public void setQuantidadeDePassageiros(Integer quantidadeDePassageiros) {
		this.quantidadeDePassageiros = quantidadeDePassageiros;
	}

	public Integer getQuantidadeDeEstepes() {
		return quantidadeDeEstepes;
	}

	public void setQuantidadeDeEstepes(Integer quantidadeDeEstepes) {
		this.quantidadeDeEstepes = quantidadeDeEstepes;
	}

}
