package br.com.fiap;

public final class ContaCorrenteEspecial extends ContaCorrente implements Transferivel{

	private double limite;
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException{
		if(valor > saldo + limite) {
			throw new SaldoInsuficienteException();
		}
		saldo  = saldo - valor;
	}

	@Override
	public boolean realizarDoc(int nroBanco, int nrAgencia, int nrConta, double valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean realizarTed(int nroBanco, int nrAgencia, int nrConta, double valor) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
