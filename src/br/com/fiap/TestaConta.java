package br.com.fiap;

public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaCorrente conta = new ContaCorrenteEspecial();
		
		try {
			conta.sacar(20);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
	}

}
