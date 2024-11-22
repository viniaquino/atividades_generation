package conta;

public class Conta {

	private String nome;
	private int numero;
	private int agencia;
	private int tipo;
	private float saldo;

	public Conta(String nome, int numero, int agencia, int tipo, float saldo) {
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public Conta() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void Imprimir() {
		System.out.println("\nNome: " + nome);
		System.out.println("Numero: " + numero);
		System.out.println("Agencia: " + agencia);
		System.out.println("Tipo: " + tipo);
		System.out.println("Saldo: " + saldo);
	}

}
