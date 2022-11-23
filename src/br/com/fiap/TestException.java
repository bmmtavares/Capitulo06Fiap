package br.com.fiap;

public class TestException {
	public static void main(String args[] )   {
		
		try {
			//trecho por onde pode ocorrer
			int val=10 / 0;
			System.out.println(val);
			
		} catch(Exception e ) { //captura excecao
			
			//tratamento exececao
			System.out.println("tratamento excecao");
			e.printStackTrace();
		}
		
	}
}
