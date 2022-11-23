package br.com.fiap;

public interface Transferivel {

	public boolean realizarDoc(int nroBanco, int nrAgencia, int nrConta, double valor);
	
	public boolean realizarTed(int nroBanco, int nrAgencia, int nrConta, double valor);
	
	default boolean realizarTransferenciaInterna(int nroBanco, int nrAgencia, int nrConta, double valor){
		
		//regra negocio
		return true;
	}
	
		
}
