package br.com.fiap;

public class ContaCorrente {
	
	protected double saldo;
	public static final int BANCO=33; //constante
	
	public void sacar(double valor) throws SaldoInsuficienteException{
		if(valor > saldo) {
			throw new SaldoInsuficienteException();
		}
		saldo = saldo - valor;
	}
	
}
